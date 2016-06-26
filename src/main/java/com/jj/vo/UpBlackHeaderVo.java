package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 黑卡文件下行解析内容
 * Created by Administrator on 2016/5/22.
 */
public class UpBlackHeaderVo {

    private String RECORD_COUNT = "";
    private String ENDSIGN = "";
    


	public String getRECORD_COUNT() {
		return RECORD_COUNT;
	}


	public void setRECORD_COUNT(String rECORD_COUNT) {
		RECORD_COUNT = rECORD_COUNT;
	}


	public String getENDSIGN() {
		return ENDSIGN;
	}



	public void setENDSIGN(String eNDSIGN) {
		ENDSIGN = eNDSIGN;
	}


	public static UpBlackHeaderVo converFromString(String str) throws Exception {
		UpBlackHeaderVo upDisputeHeaderVo=new UpBlackHeaderVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
        	upDisputeHeaderVo.setRECORD_COUNT(str.substring(0, 10));
        	upDisputeHeaderVo.setENDSIGN(str.substring(10,12));
        }catch (Exception e){
            throw e;
        }
        return upDisputeHeaderVo;
    }

}
