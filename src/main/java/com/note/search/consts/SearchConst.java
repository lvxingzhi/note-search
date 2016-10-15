package com.note.search.consts;

/**
 * <p>Search常量 </p>
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
public class SearchConst {

    /**
     *
     */
    public enum CodeType {
        NATIVE2ASCII("10001", "本地转ASCII"),
        ASCII2NATIVE("10002", "ASCII转本地");

        private String type;
        private String message;

        CodeType(String type, String message) {
            this.type = type;
            this.message = message;
        }

        public String getType(){
            return this.type;
        }

        public String getMessage(){
            return this.message;
        }

    }
}
