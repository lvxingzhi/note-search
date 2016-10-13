package com.note.search.response;

/**
 * <p>请求返回实体 </p>
 * <p>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author lvxz5
 * @version 1.0
 * @date 2016/10/12
 * @since 1.0
 */
public class HttpResp {

    private static String SUCCESS = "0";
    private static String FAIL = "1";

    private String code = SUCCESS;
    private String date = "";
    private String message = "";

    public static HttpResp getInstance(){
        return new HttpResp();
    }

    public static HttpResp getInstance(String message){
        HttpResp httpResp = HttpResp.getInstance();
        httpResp.setMessage(message);
        return httpResp;
    }

    public static HttpResp getSuccessInstance(){
        HttpResp httpResp = HttpResp.getInstance();
        return httpResp;
    }

    public static HttpResp getSuccessInstance(String data){
        HttpResp httpResp = HttpResp.getInstance();
        httpResp.setDate(data);
        return httpResp;
    }

    public static HttpResp getSuccessInstance(String data,String message){
        HttpResp httpResp = HttpResp.getInstance();
        httpResp.setMessage(message);
        httpResp.setDate(data);
        return httpResp;
    }

    public static HttpResp getFailInstance(){
        HttpResp httpResp =  HttpResp.getInstance();
        httpResp.setCode(FAIL);
        return httpResp;
    }

    public static HttpResp getFailInstance(String message){
        HttpResp httpResp =  HttpResp.getInstance();
        httpResp.setCode(FAIL);
        httpResp.setMessage(message);
        return httpResp;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
