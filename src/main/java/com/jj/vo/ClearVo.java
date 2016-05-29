package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 清分文件
 * Created by Administrator on 2016/5/22.
 */
public class ClearVo implements IEntity {

    private String SYS_ID = "";
    private String REF_NO = "";
    private String TRANS_DATE = "";
    private String TRANS_TIME = "";
    private String CARD_NET_NO = "";
    private String CARD_CHIP_NO = "";
    private String TRANS_AMOUNT = "";
    private String PSAM_ID = "";
    private String TERMINAL_ID = "";
    private String TRANS_ADDR = "";
    private String TRANS_PREAMT = "";
    private String TRANS_TYPE = "";
    private String CARD_SERIALNO = "";
    private String PSAM_SERIALNO = "";
    private String CARD_RND = "";
    private String TAC = "";
    private String RESULT = "";
    private String REASON = "";
    private String FEE = "";
    private String AMOUNT = "";
    private String PARKINGIN_TRANS_DATE = "";
    private String PARKINGIN_TRANS_TIME = "";
    private String ENDSIGN = "";

    public String getSYS_ID() {
        return StringUtil.fillStr(SYS_ID,1);
    }

    public String getREF_NO() {
        return StringUtil.fillStr(REF_NO,20);
    }

    public String getTRANS_DATE() {
        return StringUtil.fillStr(TRANS_DATE,8);
    }

    public String getTRANS_TIME() {
        return StringUtil.fillStr(TRANS_TIME,6);
    }

    public String getCARD_NET_NO() {
        return StringUtil.fillStr(CARD_NET_NO,4);
    }

    public String getCARD_CHIP_NO() {
        return StringUtil.fillStr(CARD_CHIP_NO,19);
    }

    public String getTRANS_AMOUNT() {
        return StringUtil.fillStr(TRANS_AMOUNT,12);
    }

    public String getPSAM_ID() {
        return StringUtil.fillStr(PSAM_ID,22);
    }

    public String getTERMINAL_ID() {
        return StringUtil.fillStr(TERMINAL_ID,12);
    }

    public String getTRANS_ADDR() {
        return StringUtil.fillStr(TRANS_ADDR,60);
    }

    public String getTRANS_PREAMT() {
        return StringUtil.fillStr(TRANS_PREAMT,12);
    }

    public String getTRANS_TYPE() {
        return StringUtil.fillStr(TRANS_TYPE,2);
    }

    public String getCARD_SERIALNO() {
        return StringUtil.fillStr(CARD_SERIALNO,4);
    }

    public String getPSAM_SERIALNO() {
        return StringUtil.fillStr(PSAM_SERIALNO,8);
    }

    public String getCARD_RND() {
        return StringUtil.fillStr(CARD_RND,8);
    }

    public String getTAC() {
        return StringUtil.fillStr(TAC,8);
    }

    public String getRESULT() {
        return StringUtil.fillStr(RESULT,1);
    }

    public String getREASON() {
        return StringUtil.fillStr(REASON,20);
    }

    public String getFEE() {
        return StringUtil.fillStr(FEE,12);
    }

    public String getAMOUNT() {
        return StringUtil.fillStr(AMOUNT,12);
    }

    public String getPARKINGIN_TRANS_DATE() {
        return StringUtil.fillStr(PARKINGIN_TRANS_DATE,8);
    }

    public String getPARKINGIN_TRANS_TIME() {
        return StringUtil.fillStr(PARKINGIN_TRANS_TIME,6);
    }

    public String getENDSIGN() {
        return StringUtil.fillStr(ENDSIGN,2);
    }

    public void setSYS_ID(String SYS_ID) {
        this.SYS_ID = SYS_ID;
    }

    public void setREF_NO(String REF_NO) {
        this.REF_NO = REF_NO;
    }

    public void setTRANS_DATE(String TRANS_DATE) {
        this.TRANS_DATE = TRANS_DATE;
    }

    public void setTRANS_TIME(String TRANS_TIME) {
        this.TRANS_TIME = TRANS_TIME;
    }

    public void setCARD_NET_NO(String CARD_NET_NO) {
        this.CARD_NET_NO = CARD_NET_NO;
    }

    public void setCARD_CHIP_NO(String CARD_CHIP_NO) {
        this.CARD_CHIP_NO = CARD_CHIP_NO;
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
    }

    public void setPSAM_ID(String PSAM_ID) {
        this.PSAM_ID = PSAM_ID;
    }

    public void setTERMINAL_ID(String TERMINAL_ID) {
        this.TERMINAL_ID = TERMINAL_ID;
    }

    public void setTRANS_ADDR(String TRANS_ADDR) {
        this.TRANS_ADDR = TRANS_ADDR;
    }

    public void setTRANS_PREAMT(String TRANS_PREAMT) {
        this.TRANS_PREAMT = TRANS_PREAMT;
    }

    public void setTRANS_TYPE(String TRANS_TYPE) {
        this.TRANS_TYPE = TRANS_TYPE;
    }

    public void setCARD_SERIALNO(String CARD_SERIALNO) {
        this.CARD_SERIALNO = CARD_SERIALNO;
    }

    public void setPSAM_SERIALNO(String PSAM_SERIALNO) {
        this.PSAM_SERIALNO = PSAM_SERIALNO;
    }

    public void setCARD_RND(String CARD_RND) {
        this.CARD_RND = CARD_RND;
    }

    public void setTAC(String TAC) {
        this.TAC = TAC;
    }

    public void setRESULT(String RESULT) {
        this.RESULT = RESULT;
    }

    public void setREASON(String REASON) {
        this.REASON = REASON;
    }

    public void setFEE(String FEE) {
        this.FEE = FEE;
    }

    public void setAMOUNT(String AMOUNT) {
        this.AMOUNT = AMOUNT;
    }

    public void setPARKINGIN_TRANS_DATE(String PARKINGIN_TRANS_DATE) {
        this.PARKINGIN_TRANS_DATE = PARKINGIN_TRANS_DATE;
    }

    public void setPARKINGIN_TRANS_TIME(String PARKINGIN_TRANS_TIME) {
        this.PARKINGIN_TRANS_TIME = PARKINGIN_TRANS_TIME;
    }

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getSYS_ID());
        sb.append(getREF_NO());
        sb.append(getTRANS_DATE());
        sb.append(getTRANS_TIME());
        sb.append(getCARD_NET_NO());
        sb.append(getCARD_CHIP_NO());
        sb.append(getTRANS_AMOUNT());
        sb.append(getPSAM_ID());
        sb.append(getTERMINAL_ID());
        sb.append(getTRANS_ADDR());
        sb.append(getTRANS_PREAMT());
        sb.append(getTRANS_TYPE());
        sb.append(getCARD_SERIALNO());
        sb.append(getPSAM_SERIALNO());
        sb.append(getCARD_RND());
        sb.append(getTAC());
        sb.append(getRESULT());
        sb.append(getREASON());
        sb.append(getFEE());
        sb.append(getAMOUNT());
        sb.append(getPARKINGIN_TRANS_DATE());
        sb.append(getPARKINGIN_TRANS_TIME());
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
