package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 清分文件头
 * Created by Administrator on 2016/5/22.
 */
public class UpCleanHeaderVo  {

    private String CLEAR_BILLNO = "";
    private String TRANS_COUNT = "";
    private String TRANS_AMOUNT = "";
    private String ACPT_COUNT = "";
    private String ACPT_AMOUNT = "";
    private String UREFU_COUNT = "";
    private String UREFU_AMOUNT = "";
    private String REFU_COUNT = "";
    private String REFU_AMOUNT = "";
    private String FEE_COUNT = "";
    private String FEE_AMOUNT = "";
    private String BANK_TRANS_ID = "";
    private String ENDSIGN = "";

    public String getCLEAR_BILLNO() {
        return CLEAR_BILLNO;
    }

    public void setCLEAR_BILLNO(String CLEAR_BILLNO) {
        this.CLEAR_BILLNO = CLEAR_BILLNO;
    }

    public String getTRANS_COUNT() {
        return TRANS_COUNT;
    }

    public void setTRANS_COUNT(String TRANS_COUNT) {
        this.TRANS_COUNT = TRANS_COUNT;
    }

    public String getTRANS_AMOUNT() {
        return TRANS_AMOUNT;
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
    }

    public String getACPT_COUNT() {
        return ACPT_COUNT;
    }

    public void setACPT_COUNT(String ACPT_COUNT) {
        this.ACPT_COUNT = ACPT_COUNT;
    }

    public String getACPT_AMOUNT() {
        return ACPT_AMOUNT;
    }

    public void setACPT_AMOUNT(String ACPT_AMOUNT) {
        this.ACPT_AMOUNT = ACPT_AMOUNT;
    }

    public String getUREFU_COUNT() {
        return UREFU_COUNT;
    }

    public void setUREFU_COUNT(String UREFU_COUNT) {
        this.UREFU_COUNT = UREFU_COUNT;
    }

    public String getUREFU_AMOUNT() {
        return UREFU_AMOUNT;
    }

    public void setUREFU_AMOUNT(String UREFU_AMOUNT) {
        this.UREFU_AMOUNT = UREFU_AMOUNT;
    }

    public String getREFU_COUNT() {
        return REFU_COUNT;
    }

    public void setREFU_COUNT(String REFU_COUNT) {
        this.REFU_COUNT = REFU_COUNT;
    }

    public String getREFU_AMOUNT() {
        return REFU_AMOUNT;
    }

    public void setREFU_AMOUNT(String REFU_AMOUNT) {
        this.REFU_AMOUNT = REFU_AMOUNT;
    }

    public String getFEE_COUNT() {
        return FEE_COUNT;
    }

    public void setFEE_COUNT(String FEE_COUNT) {
        this.FEE_COUNT = FEE_COUNT;
    }

    public String getFEE_AMOUNT() {
        return FEE_AMOUNT;
    }

    public void setFEE_AMOUNT(String FEE_AMOUNT) {
        this.FEE_AMOUNT = FEE_AMOUNT;
    }

    public String getBANK_TRANS_ID() {
        return BANK_TRANS_ID;
    }

    public void setBANK_TRANS_ID(String BANK_TRANS_ID) {
        this.BANK_TRANS_ID = BANK_TRANS_ID;
    }

    public String getENDSIGN() {
        return ENDSIGN;
    }

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }
    public static UpCleanHeaderVo converFromString(String str) throws Exception {
        UpCleanHeaderVo upClearVo=new UpCleanHeaderVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
            upClearVo.setCLEAR_BILLNO(str.substring(0,40));
            upClearVo.setTRANS_COUNT(str.substring(40,50));
            upClearVo.setTRANS_AMOUNT(str.substring(50,62));
            upClearVo.setACPT_COUNT(str.substring(62,72));
            upClearVo.setACPT_AMOUNT(str.substring(72,84));
            upClearVo.setREFU_COUNT(str.substring(84,94));
            upClearVo.setREFU_AMOUNT(str.substring(94,106));
            upClearVo.setUREFU_COUNT(str.substring(106,116));
            upClearVo.setUREFU_AMOUNT(str.substring(116,128));
            upClearVo.setFEE_COUNT(str.substring(128,138));
            upClearVo.setFEE_AMOUNT(str.substring(138,150));
            upClearVo.setBANK_TRANS_ID(str.substring(150,170));
            upClearVo.setENDSIGN(str.substring(170,172));
        }catch (Exception e){
            throw e;
        }
        return upClearVo;
    }
}
