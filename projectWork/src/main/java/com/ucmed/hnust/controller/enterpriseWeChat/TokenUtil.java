package com.ucmed.hnust.controller.enterpriseWeChat;

import com.alibaba.fastjson.JSONObject;
import com.ucmed.hnust.util.HttpRequestGet;
import com.ucmed.hnust.util.RedisCacheUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ZY-LJ-1446 on 2018/4/18.
 */
public class TokenUtil {
    private static final Logger logger = Logger.getLogger(TokenUtil.class);

    @Autowired
    private RedisCacheUtil redisCacheUtil;

    public String gettxlTokenImpl() {
        if (redisCacheUtil.getCacheObjectForqywx("txltoken") == null) {
            Map<String, Object> param = new HashMap<>();
            param.put("corpid", PublicVariable.corpid);
            param.put("corpsecret", PublicVariable.txlsecret);
            JSONObject res = HttpRequestGet.sendGet(
                    PublicVariable.tokenuri,
                    param, "utf-8");
            logger.info("txltoken:" + res);
            redisCacheUtil.setCacheObjectForqywx("txltoken", res.getString("access_token"));
        }
        return redisCacheUtil.getCacheObjectForqywx("txltoken").toString();
    }

    public String getzjyyTokenImpl(String zjyysecret) {
        if (redisCacheUtil.getCacheObjectForqywx(zjyysecret) == null) {

            Map<String, Object> param = new HashMap<>();
            param.put("corpid", PublicVariable.corpid);
            param.put("corpsecret", zjyysecret);
            JSONObject res = HttpRequestGet.sendGet(
                    PublicVariable.tokenuri,
                    param, "utf-8");
            logger.info(zjyysecret + ":" + res);
            redisCacheUtil.setCacheObjectForqywx(zjyysecret, res.getString("access_token"));
        }
        return redisCacheUtil.getCacheObjectForqywx(zjyysecret).toString();
    }
}
