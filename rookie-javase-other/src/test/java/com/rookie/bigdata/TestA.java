package com.rookie.bigdata;


import com.mysql.cj.jdbc.MysqlDataSource;
import org.apache.naming.ContextBindings;
import org.apache.naming.NamingContext;
import org.apache.naming.java.javaURLContextFactory;
import org.junit.Assert;
import org.junit.Test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.naming.spi.ObjectFactory;
import java.util.StringTokenizer;

/**
 * @Class TestA
 * @Description TODO
 * @Author rookie
 * @Date 2023/4/27 9:41
 * @Version 1.0
 */
public class TestA {
    // "java:comp/env/jdbc/mysql" 包含三层 Context，最后一层存储元素 mysql
    @Test
    public void testSelectorContext() throws Exception {


        String jdbcPath = "jdbc/mysql";
        createSelectorContext();

        InitialContext ctx = new InitialContext();
        // 1. 绑定依赖
        createSubcontexts(ctx, "java:comp/env/" + jdbcPath);
        ctx.bind("java:comp/env/" + jdbcPath, new MysqlDataSource());

        // 2. 依赖查找
        Object ds = ctx.lookup("java:comp/env/" + jdbcPath);
        Assert.assertEquals(MysqlDataSource.class, ds.getClass());
    }

    // 创建 schema 为 “java:” 的命名空间
    public void createSelectorContext() throws Exception {
        System.setProperty(NamingContext.URL_PKG_PREFIXES, "org.apache.naming");
        System.setProperty(NamingContext.INITIAL_CONTEXT_FACTORY,
                javaURLContextFactory.class.getName());
        NamingContext rootContext = createNamingContext();

        ContextBindings.bindContext(this, rootContext, null);
        ContextBindings.bindThread(this, null);
    }

    // 创建父容器 NamingContext
    public NamingContext createNamingContext() throws Exception {
        NamingContext rootContext = new NamingContext(null, "rootContext");
        Context compCtx = rootContext.createSubcontext("comp");
        Context envCtx = compCtx.createSubcontext("env");
        return rootContext;
    }

    // 递归创建子容器 subContext
    private void createSubcontexts(Context ctx, String name)
            throws NamingException {
        Context currentContext = ctx;
        StringTokenizer tokenizer = new StringTokenizer(name, "/");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if ((!token.equals("")) && (tokenizer.hasMoreTokens())) {
                try {
                    currentContext = currentContext.createSubcontext(token);
                } catch (NamingException e) {
                    // Silent catch. Probably an object is already bound in the context.
                    currentContext = (Context) currentContext.lookup(token);
                }
            }
        }
    }

}
