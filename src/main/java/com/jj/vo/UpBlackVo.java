package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 黑卡文件下行解析内容
 * Created by Administrator on 2016/5/22.
 */
public class UpBlackVo {

    private String SYS_ID = "";
    private String CARD_NET_NO;
    private String CARD_CHIP_NO;
    private String ENDSIGN = "";
    

	public String getSYS_ID() {
		return SYS_ID;
	}


	public void setSYS_ID(String sYS_ID) {
		SYS_ID = sYS_ID;
	}


	public String getCARD_NET_NO() {
		return CARD_NET_NO;
	}


	public void setCARD_NET_NO(String cARD_NET_NO) {
		CARD_NET_NO = cARD_NET_NO;
	}


	public String getCARD_CHIP_NO() {
		return CARD_CHIP_NO;
	}


	public void setCARD_CHIP_NO(String cARD_CHIP_NO) {
		CARD_CHIP_NO = cARD_CHIP_NO;
	}


	public String getENDSIGN() {
		return ENDSIGN;
	}


	public void setENDSIGN(String eNDSIGN) {
		ENDSIGN = eNDSIGN;
	}


	public static UpBlackVo converFromString(String str) throws Exception {
		UpBlackVo upDisputeHeaderVo=new UpBlackVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
        	upDisputeHeaderVo.setSYS_ID(str.substring(0, 1));
        	upDisputeHeaderVo.setCARD_NET_NO(str.substring(1,5));
        	upDisputeHeaderVo.setCARD_CHIP_NO(str.substring(5,24));
        	upDisputeHeaderVo.setENDSIGN(str.substring(24,26));
        }catch (Exception e){
            throw e;
        }
        return upDisputeHeaderVo;
    }

}
