package com.note.search.code;

import com.note.search.consts.SearchConst;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>转码工厂 </p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lvxz5
 * @version 1.0
 * @date 2016/10/11
 * @since 1.0
 */
public class TransCodeFactory {

    private Map<String,String> codeMap = new HashMap<>();

    private static TransCodeFactory transCodeFactory;

    private TransCodeFactory(){

    }

    public static TransCodeFactory getInstance(){

        if(transCodeFactory==null){
            Map<String,String> map = new HashMap<>();
            map.put(SearchConst.CodeType.ASCII2NATIVE.getType(),"");
            transCodeFactory = new TransCodeFactory();
        }

        return transCodeFactory;
    }

}
