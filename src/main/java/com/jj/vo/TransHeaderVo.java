package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * Created by Administrator on 2016/5/22.
 */
public class TransHeaderVo implements IEntity {

    private String CLEAR_BILLNO = "";
    private String TRANS_COUNT = "";
    private String TRANS_AMOUNT = "";
    private String ACPT_COUNT = "";
    private String ACPT_AMOUNT = "";
    private String REFU_COUNT = "";
    private String REFU_AMOUNT = "";
    private String FEE_COUNT = "";
    private String FEE_AMOUNT = "";
    private String BANK_TRANS_ID = "";
    private String ENDSIGN = "";

    public String getCLEAR_BILLNO() {
        return StringUtil.fillStr(CLEAR_BILLNO,40);
    }

    public String getTRANS_COUNT() {
        return StringUtil.fillStr(TRANS_COUNT,10);
    }

    public String getTRANS_AMOUNT() {
        return StringUtil.fillStr(TRANS_AMOUNT,12);
    }

    public String getACPT_COUNT() {
        return StringUtil.fillStr(ACPT_COUNT,10);
    }

    public String getACPT_AMOUNT() {
        return StringUtil.fillStr(ACPT_AMOUNT,12);
    }

    public String getREFU_COUNT() {
        return StringUtil.fillStr(REFU_COUNT,10);
    }

    public String getREFU_AMOUNT() {
        return  StringUtil.fillStr(REFU_AMOUNT,12);
    }

    public String getFEE_COUNT() {
        return StringUtil.fillStr(FEE_COUNT,10);
    }

    public String getFEE_AMOUNT() {
        return StringUtil.fillStr(FEE_AMOUNT,12);
    }

    public String getBANK_TRANS_ID() {
        return StringUtil.fillStr(BANK_TRANS_ID,20);
    }

    public String getENDSIGN() {
        return StringUtil.fillStr(ENDSIGN,2);
    }

    public void setCLEAR_BILLNO(String CLEAR_BILLNO) {
        this.CLEAR_BILLNO = CLEAR_BILLNO;
    }

    public void setTRANS_COUNT(String TRANS_COUNT) {
        this.TRANS_COUNT = TRANS_COUNT;
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
    }

    public void setACPT_COUNT(String ACPT_COUNT) {
        this.ACPT_COUNT = ACPT_COUNT;
    }

    public void setACPT_AMOUNT(String ACPT_AMOUNT) {
        this.ACPT_AMOUNT = ACPT_AMOUNT;
    }

    public void setREFU_COUNT(String REFU_COUNT) {
        this.REFU_COUNT = REFU_COUNT;
    }

    public void setREFU_AMOUNT(String REFU_AMOUNT) {
        this.REFU_AMOUNT = REFU_AMOUNT;
    }

    public void setFEE_COUNT(String FEE_COUNT) {
        this.FEE_COUNT = FEE_COUNT;
    }

    public void setFEE_AMOUNT(String FEE_AMOUNT) {
        this.FEE_AMOUNT = FEE_AMOUNT;
    }

    public void setBANK_TRANS_ID(String BANK_TRANS_ID) {
        this.BANK_TRANS_ID = BANK_TRANS_ID;
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
        sb.append(getFEE_COUNT());
        sb.append(getFEE_AMOUNT());
        sb.append(getBANK_TRANS_ID());
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
