package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 争议文件下行解析内容
 * Created by Administrator on 2016/5/22.
 */
public class UpDisputeVo {

    private String SYS_ID = "";
    private String REF_NO = "";
    private String TRANS_AMOUNT = "";
    private String RESULT = "";
    private String REASON = "";
    private String FEE = "";
    private String AMOUNT = "";
    private String ENDSIGN = "";

    public String getSYS_ID() {
        return SYS_ID;
    }

    public void setSYS_ID(String SYS_ID) {
        this.SYS_ID = SYS_ID;
    }

    public String getREF_NO() {
        return REF_NO;
    }

    public void setREF_NO(String REF_NO) {
        this.REF_NO = REF_NO;
    }

    public String getTRANS_AMOUNT() {
        return TRANS_AMOUNT;
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
    }

    public String getRESULT() {
        return RESULT;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public String getREASON() {
        return REASON;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }

    public String getFEE() {
        return FEE;
    }

    public void setFEE(String FEE) {
        this.FEE = FEE;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public String getENDSIGN() {
        return ENDSIGN;
    }

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }

    public static UpDisputeVo converFromString(String str) throws Exception {
    	UpDisputeVo upClearVo=new UpDisputeVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
            upClearVo.setSYS_ID(str.substring(0,1));
            upClearVo.setREF_NO(str.substring(1,20+1));
            upClearVo.setTRANS_AMOUNT(str.substring(21,21+12));
            upClearVo.setRESULT(str.substring(33,33+1));
            upClearVo.setREASON(str.substring(34,34+20));
            upClearVo.setFEE(str.substring(54,54+12));
            upClearVo.setAMOUNT(str.substring(54+12,54+12+12));
            upClearVo.setENDSIGN(str.substring(54+12+12,54+12+12+2));
        }catch (Exception e){
            throw e;
        }
        return upClearVo;
    }

}
