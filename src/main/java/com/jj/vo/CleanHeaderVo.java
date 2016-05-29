package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 清分文件头
 * Created by Administrator on 2016/5/22.
 */
public class CleanHeaderVo implements IEntity {

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
        return StringUtil.fillStr(CLEAR_BILLNO,40);
    }

    public void setCLEAR_BILLNO(String CLEAR_BILLNO) {
        this.CLEAR_BILLNO = CLEAR_BILLNO;
    }

    public String getTRANS_COUNT() {
        return StringUtil.fillStr(TRANS_COUNT,10);
    }

    public void setTRANS_COUNT(String TRANS_COUNT) {
        this.TRANS_COUNT = TRANS_COUNT;
    }

    public String getTRANS_AMOUNT() {
        return StringUtil.fillStr(TRANS_AMOUNT,12);
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
    }

    public String getACPT_COUNT() {
        return StringUtil.fillStr(ACPT_COUNT,10);
    }

    public void setACPT_COUNT(String ACPT_COUNT) {
        this.ACPT_COUNT = ACPT_COUNT;
    }

    public String getACPT_AMOUNT() {
        return StringUtil.fillStr(ACPT_AMOUNT,12);
    }

    public void setACPT_AMOUNT(String ACPT_AMOUNT) {
        this.ACPT_AMOUNT = ACPT_AMOUNT;
    }

    public String getUREFU_COUNT() {
        return StringUtil.fillStr(UREFU_COUNT,10);
    }

    public void setUREFU_COUNT(String UREFU_COUNT) {
        this.UREFU_COUNT = UREFU_COUNT;
    }

    public String getUREFU_AMOUNT() {
        return StringUtil.fillStr(UREFU_AMOUNT,12);
    }

    public void setUREFU_AMOUNT(String UREFU_AMOUNT) {
        this.UREFU_AMOUNT = UREFU_AMOUNT;
    }

    public String getREFU_COUNT() {
        return StringUtil.fillStr(REFU_COUNT,10);
    }

    public void setREFU_COUNT(String REFU_COUNT) {
        this.REFU_COUNT = REFU_COUNT;
    }

    public String getREFU_AMOUNT() {
        return StringUtil.fillStr(REFU_AMOUNT,12);
    }

    public void setREFU_AMOUNT(String REFU_AMOUNT) {
        this.REFU_AMOUNT = REFU_AMOUNT;
    }

    public String getFEE_COUNT() {
        return StringUtil.fillStr(FEE_COUNT,10);
    }

    public void setFEE_COUNT(String FEE_COUNT) {
        this.FEE_COUNT = FEE_COUNT;
    }

    public String getFEE_AMOUNT() {
        return StringUtil.fillStr(FEE_AMOUNT,12);
    }

    public void setFEE_AMOUNT(String FEE_AMOUNT) {
        this.FEE_AMOUNT = FEE_AMOUNT;
    }

    public String getBANK_TRANS_ID() {
        return StringUtil.fillStr(BANK_TRANS_ID,20);
    }

    public void setBANK_TRANS_ID(String BANK_TRANS_ID) {
        this.BANK_TRANS_ID = BANK_TRANS_ID;
    }

    public String getENDSIGN() {
        return StringUtil.fillStr(ENDSIGN,2);
    }

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getCLEAR_BILLNO());
        sb.append(getTRANS_COUNT());
        sb.append(getTRANS_AMOUNT());
        sb.append(getACPT_COUNT());
        sb.append(getACPT_AMOUNT());
        sb.append(getREFU_COUNT());
        sb.append(getREFU_AMOUNT());
        sb.append(getUREFU_COUNT());
        sb.append(getUREFU_AMOUNT());
        sb.append(getFEE_COUNT());
        sb.append(getFEE_AMOUNT());
        sb.append(getBANK_TRANS_ID());
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
