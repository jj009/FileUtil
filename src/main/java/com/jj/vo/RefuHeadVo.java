package com.jj.vo;

import com.jj.util.FileUtils;

/**
 * 争议文件头
 * Created by Administrator on 2016/5/22.
 */
public class RefuHeadVo implements IEntity{
    private  String CLEAR_BILLNO="";
    private  String REFU_COUNT="";
    private  String REFU_AMOUNT="";
    private  String FEE_COUNT="";
    private  String FEE_AMOUNT="";
    private  String BANK_TRANS_ID="";
    private  String ENDSIGN="";

    public String getCLEAR_BILLNO() {
        return CLEAR_BILLNO;
    }

    public String getREFU_COUNT() {
        return REFU_COUNT;
    }

    public String getREFU_AMOUNT() {
        return REFU_AMOUNT;
    }

    public String getFEE_COUNT() {
        return FEE_COUNT;
    }

    public String getFEE_AMOUNT() {
        return FEE_AMOUNT;
    }

    public String getBANK_TRANS_ID() {
        return BANK_TRANS_ID;
    }

    public String getENDSIGN() {
        return ENDSIGN;
    }

    public void setCLEAR_BILLNO(String CLEAR_BILLNO) {
        this.CLEAR_BILLNO = CLEAR_BILLNO;
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

    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append(getCLEAR_BILLNO()).append(FileUtils.splitstr);
        sb.append(getREFU_COUNT()).append(FileUtils.splitstr);
        sb.append(getREFU_AMOUNT()).append(FileUtils.splitstr);
        sb.append(getFEE_COUNT()).append(FileUtils.splitstr);
        sb.append(getFEE_AMOUNT()).append(FileUtils.splitstr);
        sb.append(getBANK_TRANS_ID()).append(FileUtils.splitstr);
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
