package com.ucmed.zsyy.webService;

/**
 * Created by ZY-LJ-1446 on 2017/11/21.
 */

import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface Demo {

    String queryBaseTx();

    String queryBaseTxById(@WebParam(name="id") String id);
}
