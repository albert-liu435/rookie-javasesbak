package com.rookie.bigdata.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

/**
 * @Class Dom
 * @Description TODO
 * @Author rookie
 * @Date 2023/4/27 14:35
 * @Version 1.0
 */
public class Dom {

    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

        //获取解析工厂
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //创建解析器对象
        DocumentBuilder db = dbf.newDocumentBuilder();
        //获取Document对象
        Document d = db.parse("C:\\work\\IDEAWorkSpace\\rookie-project\\rookie-github\\rookie-javases\\rookie-javase-other\\src\\main\\resources\\xml\\Book.xml");
        //通过Document对象的方法获取相应的节点列表
        NodeList nl = d.getElementsByTagName("bookname");
        //获取指定节点
        Node node = nl.item(0);
        //获取指定节点内容
        String content = node.getTextContent();
        //输出内容
        System.out.println(content);

    }

}
