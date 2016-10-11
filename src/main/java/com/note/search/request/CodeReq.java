package com.note.search.request;

/**
 * <p>转码请求对象 </p>
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
public class CodeReq {

    /**
     * 转码类型
     *
     * @see com.note.search.util.Native2AsciiUtils
     */
    private String type;

    /**
     * 转码内容
     */
    private String content;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
