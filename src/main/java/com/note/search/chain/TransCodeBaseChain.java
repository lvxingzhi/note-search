package com.note.search.chain;

import com.note.search.consts.SearchConst;
import com.note.search.request.CodeResp;

/**
 * <p>转码处理抽象类 </p>
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
public abstract class TransCodeBaseChain {

    private String codeType = null;

    public TransCodeBaseChain(SearchConst.CodeType codeType){
        this.codeType = codeType.getType();
    }

    public abstract CodeResp execute(String content);

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }
}
