package com.note.search.code;

import org.junit.Test;

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
 * @date 2016/10/12
 * @since 1.0
 */

public class T_TransCodeFactory {

    @Test
    public void t_trans(){
        TransCodeFactory transCodeFactory = TransCodeFactory.getInstance();
        transCodeFactory.trans("","");
    }
}
