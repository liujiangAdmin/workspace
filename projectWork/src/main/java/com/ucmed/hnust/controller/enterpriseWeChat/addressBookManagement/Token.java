package com.ucmed.hnust.controller.enterpriseWeChat.addressBookManagement;

import com.ucmed.hnust.controller.enterpriseWeChat.TokenUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取企业微信通讯录和自建应用TOKEN
 * Created by ZY-LJ-1446 on 2018/4/18.
 */
@Controller
@RequestMapping(value = "/getSecret")
public class Token {
    private static final Logger logger = Logger.getLogger(Token.class);

    @Autowired
    private TokenUtil tokenUtil;

    /**
     * 获取通讯录token
     * @param ：无
     * */
    @RequestMapping(value = "/gettxlToken",method= RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody String gettxlToken(HttpServletRequest request, Model model, ModelMap map, HttpServletResponse response)
    {
        return tokenUtil.gettxlTokenImpl();
    }
    /**
     * 获取自建应用token
     * @param request
     * */
    @RequestMapping(value = "/getzjyyToken",method = RequestMethod.GET,produces = "application/json;charset=utf-8")
    public @ResponseBody String getzjyyToken(HttpServletRequest request, Model model, ModelMap map, HttpServletResponse response)
    {
        String zjyysecret=request.getParameter("zjyysecret");
        return tokenUtil.getzjyyTokenImpl(zjyysecret);
    }
}
