package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 争议文件下行解析内容
 * Created by Administrator on 2016/5/22.
 */
public class UpDisputeHeaderVo {

    private String CLEAR_BILLNO = "";
    private String REFU_COUNT = "";
    private String REFU_AMOUNT = "";
    private String FEE_COUNT = "";
    private String FEE_AMOUNT = "";
    private String BANK_TRANS_ID = "";
    private String ENDSIGN = "";
    



	public String getCLEAR_BILLNO() {
		return CLEAR_BILLNO;
	}




	public void setCLEAR_BILLNO(String cLEAR_BILLNO) {
		CLEAR_BILLNO = cLEAR_BILLNO;
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




	public static UpDisputeHeaderVo converFromString(String str) throws Exception {
		UpDisputeHeaderVo upDisputeHeaderVo=new UpDisputeHeaderVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
        	upDisputeHeaderVo.setCLEAR_BILLNO(str.substring(0, 40));
        	upDisputeHeaderVo.setREFU_COUNT(str.substring(40,50));
        	upDisputeHeaderVo.setREFU_AMOUNT(str.substring(50,62));
        	upDisputeHeaderVo.setFEE_COUNT(str.substring(62,72));
        	upDisputeHeaderVo.setFEE_AMOUNT(str.substring(72,84));
        	upDisputeHeaderVo.setBANK_TRANS_ID(str.substring(84,104));
        	upDisputeHeaderVo.setENDSIGN(str.substring(104,106));
        }catch (Exception e){
            throw e;
        }
        return upDisputeHeaderVo;
    }

}
