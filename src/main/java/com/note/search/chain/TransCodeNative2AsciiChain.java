package com.note.search.chain;

import com.note.search.consts.SearchConst;
import com.note.search.request.CodeResp;
import com.note.search.util.Native2AsciiUtils;

/**
 * <p>转码处理Native2Ascii </p>
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
public class TransCodeNative2AsciiChain extends TransCodeBaseChain{

    public TransCodeNative2AsciiChain() {
        super(SearchConst.CodeType.NATIVE2ASCII);
    }

    public CodeResp execute(String content){
        CodeResp codeResp = new CodeResp();
        String respContent = Native2AsciiUtils.native2Ascii(content);
        codeResp.setType(this.getCodeType());
        codeResp.setContent(respContent);
        return codeResp;
    }

}
