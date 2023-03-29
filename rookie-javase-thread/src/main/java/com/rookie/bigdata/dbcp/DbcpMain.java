package com.rookie.bigdata.dbcp;

//import org.apache.commons.dbcp.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @author rookie
 * @version 1.0
 * @date 2020/4/29 22:24
 */
public class DbcpMain {

    public static void main(String[] args) throws Exception{
        Properties pro = new Properties();
        pro.load(DbcpMain.class.getClassLoader().getResourceAsStream("dbcpconfig.properties"));
      //  DataSource ds = BasicDataSourceFactory.createDataSource(pro);//得到一个连接池对象
    }
}
