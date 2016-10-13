package com.note.search.controller;

import com.note.search.code.TransCodeFactory;
import com.note.search.request.CodeReq;
import com.note.search.request.CodeResp;
import com.note.search.util.Native2AsciiUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>TODO </p>
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
@Controller
@RequestMapping("search")
public class SearchAction {

    @RequestMapping("/transcoding")
    public String transcoding(CodeReq codeReq, Model model){

        String type = codeReq.getType();
        String content = codeReq.getContent();
        CodeResp codeResp = TransCodeFactory.getInstance().trans(type,content);

        model.addAttribute("codeResp",codeResp);
        model.addAttribute("aa","asdf");
        return "transcode/main";
    }



    public static void main(String[] args) {
        String s = "\\u4f01\\u4e1a";
        String s2 = s.replace("\\","\\");
        System.out.println("s:"+s);
        System.out.println("s2:"+s2);
        System.out.println(Native2AsciiUtils.ascii2Native(s));
        System.out.println(Native2AsciiUtils.native2Ascii("中国"));
    }


}
