package com.jj.util;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

/**
 * Created by huaren on 16/5/29.
 */
public class StringUtil {
    public static Logger logger=Logger.getLogger(StringUtil.class);
    public static String fillStr(String str,int length){
        if(StringUtils.isBlank(str)){
            logger.error("字符串为空");
        }
        if(str.length()>length){
            return str.substring(0,length);
        }else {
            StringBuffer sb=new StringBuffer(str);
            for(int i=0;i<(length-str.length());i++){
                sb.append(" ");
            }
            return sb.toString();
        }
    }
}
