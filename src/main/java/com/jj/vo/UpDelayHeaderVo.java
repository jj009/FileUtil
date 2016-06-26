package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 延迟文件下行解析内容
 * Created by Administrator on 2016/5/22.
 */
public class UpDelayHeaderVo {

    private String CLEAR_BILLNO = "";
    private String TRANS_COUNT = "";
    private String TRANS_AMOUNT = "";
    private String 	ACPT_COUNT = "";
    private String ACPT_AMOUNT = "";
    private String 	REFU_COUNT = "";
    private String 	REFU_AMOUNT = "";
    private String 	FEE_COUNT = "";
    private String 	FEE_AMOUNT = "";
    private String  BANK_TRANS_ID = "";
    private String 	ENDSIGN= "";
    



	public String getCLEAR_BILLNO() {
		return CLEAR_BILLNO;
	}




	public void setCLEAR_BILLNO(String cLEAR_BILLNO) {
		CLEAR_BILLNO = cLEAR_BILLNO;
	}




	public String getTRANS_COUNT() {
		return TRANS_COUNT;
	}




	public void setTRANS_COUNT(String tRANS_COUNT) {
		TRANS_COUNT = tRANS_COUNT;
	}




	public String getTRANS_AMOUNT() {
		return TRANS_AMOUNT;
	}




	public void setTRANS_AMOUNT(String tRANS_AMOUNT) {
		TRANS_AMOUNT = tRANS_AMOUNT;
	}




	public String getACPT_COUNT() {
		return ACPT_COUNT;
	}




	public void setACPT_COUNT(String aCPT_COUNT) {
		ACPT_COUNT = aCPT_COUNT;
	}




	public String getACPT_AMOUNT() {
		return ACPT_AMOUNT;
	}




	public void setACPT_AMOUNT(String aCPT_AMOUNT) {
		ACPT_AMOUNT = aCPT_AMOUNT;
	}




	public String getREFU_COUNT() {
		return REFU_COUNT;
	}




	public void setREFU_COUNT(String rEFU_COUNT) {
		REFU_COUNT = rEFU_COUNT;
	}




	public String getREFU_AMOUNT() {
		return REFU_AMOUNT;
	}




	public void setREFU_AMOUNT(String rEFU_AMOUNT) {
		REFU_AMOUNT = rEFU_AMOUNT;
	}




	public String getFEE_COUNT() {
		return FEE_COUNT;
	}




	public void setFEE_COUNT(String fEE_COUNT) {
		FEE_COUNT = fEE_COUNT;
	}




	public String getFEE_AMOUNT() {
		return FEE_AMOUNT;
	}




	public void setFEE_AMOUNT(String fEE_AMOUNT) {
		FEE_AMOUNT = fEE_AMOUNT;
	}




	public String getBANK_TRANS_ID() {
		return BANK_TRANS_ID;
	}




	public void setBANK_TRANS_ID(String bANK_TRANS_ID) {
		BANK_TRANS_ID = bANK_TRANS_ID;
	}




	public String getENDSIGN() {
		return ENDSIGN;
	}




	public void setENDSIGN(String eNDSIGN) {
		ENDSIGN = eNDSIGN;
	}




	public static UpDelayHeaderVo converFromString(String str) throws Exception {
		UpDelayHeaderVo upDelayHeaderVo=new UpDelayHeaderVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
        	upDelayHeaderVo.setCLEAR_BILLNO(str.substring(0, 40));
        	upDelayHeaderVo.setTRANS_COUNT(str.substring(40,50));
        	upDelayHeaderVo.setTRANS_AMOUNT(str.substring(50,62));
        	upDelayHeaderVo.setACPT_COUNT(str.substring(62,72));
        	upDelayHeaderVo.setACPT_AMOUNT(str.substring(72,84));
        	upDelayHeaderVo.setREFU_COUNT(str.substring(84,94));
        	upDelayHeaderVo.setREFU_AMOUNT(str.substring(94,106));
        	upDelayHeaderVo.setFEE_COUNT(str.substring(106,116));
        	upDelayHeaderVo.setFEE_AMOUNT(str.substring(116,128));
        	upDelayHeaderVo.setBANK_TRANS_ID(str.substring(128,148));
        	upDelayHeaderVo.setENDSIGN(str.substring(148,150));

        }catch (Exception e){
            throw e;
        }
        return upDelayHeaderVo;
    }

}
