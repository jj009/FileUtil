package com.jj.vo;

import com.jj.util.FileUtils;

/**
 * 清分文件
 * Created by Administrator on 2016/5/22.
 */
public class ClearVo implements IEntity{
    private String SYS_ID="";
    private String REF_NO="";
    private String TRANS_DATE="";
    private String TRANS_TIME="";
    private String CARD_NET_NO="";
    private String CARD_CHIP_NO="";
    private String TRANS_AMOUNT="";
    private String PSAM_ID="";
    private String TERMINAL_ID="";
    private String TRANS_ADDR="";
    private String TRANS_PREAMT="";
    private String TRANS_TYPE="";
    private String CARD_SERIALNO="";
    private String PSAM_SERIALNO="";
    private String CARD_RND="";
    private String TAC="";
    private String RESULT="";
    private String REASON="";
    private String FEE="";
    private String AMOUNT="";
    private String PARKINGIN_TRANS_DATE="";
    private String PARKINGIN_TRANS_TIME="";
    private String ENDSIGN="";

    public String getSYS_ID() {
        return SYS_ID;
    }

    public String getREF_NO() {
        return REF_NO;
    }

    public String getTRANS_DATE() {
        return TRANS_DATE;
    }

    public String getTRANS_TIME() {
        return TRANS_TIME;
    }

    public String getCARD_NET_NO() {
        return CARD_NET_NO;
    }

    public String getCARD_CHIP_NO() {
        return CARD_CHIP_NO;
    }

    public String getTRANS_AMOUNT() {
        return TRANS_AMOUNT;
    }

    public String getPSAM_ID() {
        return PSAM_ID;
    }

    public String getTERMINAL_ID() {
        return TERMINAL_ID;
    }

    public String getTRANS_ADDR() {
        return TRANS_ADDR;
    }

    public String getTRANS_PREAMT() {
        return TRANS_PREAMT;
    }

    public String getTRANS_TYPE() {
        return TRANS_TYPE;
    }

    public String getCARD_SERIALNO() {
        return CARD_SERIALNO;
    }

    public String getPSAM_SERIALNO() {
        return PSAM_SERIALNO;
    }

    public String getCARD_RND() {
        return CARD_RND;
    }

    public String getTAC() {
        return TAC;
    }

    public String getRESULT() {
        return RESULT;
    }

    public String getREASON() {
        return REASON;
    }

    public String getFEE() {
        return FEE;
    }

    public String getAMOUNT() {
        return AMOUNT;
    }

    public String getPARKINGIN_TRANS_DATE() {
        return PARKINGIN_TRANS_DATE;
    }

    public String getPARKINGIN_TRANS_TIME() {
        return PARKINGIN_TRANS_TIME;
    }

    public String getENDSIGN() {
        return ENDSIGN;
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

    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append(getSYS_ID()).append(FileUtils.splitstr);
        sb.append(getREF_NO()).append(FileUtils.splitstr);
        sb.append(getTRANS_DATE()).append(FileUtils.splitstr);
        sb.append(getTRANS_TIME()).append(FileUtils.splitstr);
        sb.append(getCARD_NET_NO()).append(FileUtils.splitstr);
        sb.append(getCARD_CHIP_NO()).append(FileUtils.splitstr);
        sb.append(getTRANS_AMOUNT()).append(FileUtils.splitstr);
        sb.append(getPSAM_ID()).append(FileUtils.splitstr);
        sb.append(getTERMINAL_ID()).append(FileUtils.splitstr);
        sb.append(getTRANS_ADDR()).append(FileUtils.splitstr);
        sb.append(getTRANS_PREAMT()).append(FileUtils.splitstr);
        sb.append(getTRANS_TYPE()).append(FileUtils.splitstr);
        sb.append(getCARD_SERIALNO()).append(FileUtils.splitstr);
        sb.append(getPSAM_SERIALNO()).append(FileUtils.splitstr);
        sb.append(getCARD_RND()).append(FileUtils.splitstr);
        sb.append(getTAC()).append(FileUtils.splitstr);
        sb.append(getRESULT()).append(FileUtils.splitstr);
        sb.append(getREASON()).append(FileUtils.splitstr);
        sb.append(getFEE()).append(FileUtils.splitstr);
        sb.append(getAMOUNT()).append(FileUtils.splitstr);
        sb.append(getPARKINGIN_TRANS_DATE()).append(FileUtils.splitstr);
        sb.append(getPARKINGIN_TRANS_TIME()).append(FileUtils.splitstr);
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
