package com.ucmed.hnust.controller;

import com.alibaba.fastjson.JSONObject;
import org.dom4j.Document;
import org.dom4j.Element;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.logging.SimpleFormatter;

/**
 * Created by ZY-LJ-1446 on 2018/4/26.
 */
public class Test {
    public static void main(String[] args) {
        //点击菜单拉取消息的事件推送
        String s="<xml>\n" +
                "<ToUserName><![CDATA[toUser]]></ToUserName>\n" +
                "<FromUserName><![CDATA[FromUser]]></FromUserName>\n" +
                "<CreateTime>123456789</CreateTime>\n" +
                "<MsgType><![CDATA[event]]></MsgType>\n" +
                "<Event><![CDATA[click]]></Event>\n" +
                "<EventKey><![CDATA[EVENTKEY]]></EventKey>\n" +
                "<AgentID>1</AgentID>\n" +
                "</xml>";

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String a = simpleDateFormat.format(new Date());
        String b="17:00:00";
        if(a.compareTo(b)>0)
        {
           System.out.print("aaaaa");
        }

    }


}
