package com.ucmed.zsyy.webService;

import javax.jws.WebService;

/**
 * Created by ZY-LJ-1446 on 2017/11/21.
 */
@WebService(endpointInterface = "com.ucmed.zsyy.webService.Demo")
public class DemoImpl implements Demo{
    @Override
    public String queryBaseTx() {
        return "what's your name?";
    }

    @Override
    public String queryBaseTxById(String id) {
        return "what's your name by ID?";
    }
}
