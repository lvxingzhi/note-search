package com.note.search.code;

import com.note.search.chain.TransCodeAscii2NativeChain;
import com.note.search.chain.TransCodeBaseChain;
import com.note.search.chain.TransCodeNative2AsciiChain;
import com.note.search.exception.SystemException;
import com.note.search.request.CodeResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
    protected static final Logger logger = LoggerFactory.getLogger(TransCodeFactory.class);
    private Map<String,TransCodeBaseChain> codeMap = new HashMap<>();

    private static TransCodeFactory transCodeFactory;

    private TransCodeFactory(){

    }

    public static TransCodeFactory getInstance(){
        if(transCodeFactory==null){
            Map<String,TransCodeBaseChain> map = new HashMap<>();
            TransCodeAscii2NativeChain transCodeAscii2NativeChain = new TransCodeAscii2NativeChain();
            TransCodeNative2AsciiChain transCodeNative2AsciiChain = new TransCodeNative2AsciiChain();
            map.put(transCodeAscii2NativeChain.getCodeType(),transCodeAscii2NativeChain);
            map.put(transCodeNative2AsciiChain.getCodeType(),transCodeNative2AsciiChain);
            transCodeFactory = new TransCodeFactory();
            transCodeFactory.setCodeMap(map);
        }

        if(transCodeFactory==null){
            logger.error("TransCodeFactory is null");
            throw new SystemException("TransCodeFactory can not be null, create init is error");
        }

        return transCodeFactory;
    }

    public CodeResp trans(String type,String content){
        TransCodeBaseChain chain = codeMap.get(type);
        if(type==null){
            return null;
        }
        if(content==null){
            return null;
        }
        if(chain==null){
            return null;
        }
        return chain.execute(content);

    }

    private void setCodeMap(Map<String, TransCodeBaseChain> codeMap) {
        this.codeMap = codeMap;
    }
}
