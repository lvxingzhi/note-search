package com.note.search.controller;

import com.note.search.request.CodeReq;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>基本页面控制器</p>
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
public class CommonAction {

    @RequestMapping("/index")
    public String index(CodeReq codeReq, Model model){
        return "common/index";
    }

    @RequestMapping("/bootstrap/main")
    public String bootstrapMain(CodeReq codeReq, Model model){
        return "bootstrap/main";
    }

}
