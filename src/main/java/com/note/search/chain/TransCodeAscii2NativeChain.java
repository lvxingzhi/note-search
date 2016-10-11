package com.note.search.chain;

import com.note.search.consts.SearchConst;
import com.note.search.request.CodeResp;
import com.note.search.util.Native2AsciiUtils;

/**
 * <p>转码处理Ascii2Native</p>
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
public class TransCodeAscii2NativeChain extends TransCodeBaseChain{

    public TransCodeAscii2NativeChain() {
        super(SearchConst.CodeType.ASCII2NATIVE);
    }

    public CodeResp execute(String content){
        CodeResp codeResp = new CodeResp();
        String respContent = Native2AsciiUtils.ascii2Native(content);
        codeResp.setType(this.getCodeType());
        codeResp.setContent(respContent);
        return codeResp;
    }

}
