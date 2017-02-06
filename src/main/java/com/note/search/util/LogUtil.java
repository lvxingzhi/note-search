package com.note.search.util;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.LoggingMXBean;

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
 * @date 2016/11/8
 * @since 1.0
 */
public class LogUtil {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogUtil.class.getName());
        System.out.println(LogUtil.class.getName());
        LoggingMXBean loggingMXBean = LogManager.getLoggingMXBean();
        String levelName = loggingMXBean.getLoggerLevel(LogUtil.class.getName());
        System.out.println(levelName);
        loggingMXBean.setLoggerLevel(LogUtil.class.getName(),"asdf");
    }

}
