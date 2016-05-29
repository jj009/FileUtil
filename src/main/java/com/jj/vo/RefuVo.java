package com.jj.vo;

import com.jj.util.StringUtil;

/**
 * 争议文件VO
 * Created by Administrator on 2016/5/22.
 */
public class RefuVo implements IEntity {

    private String SYS_ID = "";
    private String REF_NO = "";
    private String TRANS_AMOUNT = "";
    private String RESULT = "";
    private String REASON = "";
    private String FEE = "";
    private String AMOUNT = "";
    private String ENDSIGN = "";

    public String getSYS_ID() {
        return StringUtil.fillStr(SYS_ID,1);
    }

    public String getREF_NO() {
        return StringUtil.fillStr(REF_NO,20);
    }

    public String getTRANS_AMOUNT() {
        return StringUtil.fillStr(TRANS_AMOUNT,12);
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

    public String getENDSIGN() {
        return StringUtil.fillStr(ENDSIGN,2);
    }

    public void setSYS_ID(String SYS_ID) {
        this.SYS_ID = SYS_ID;
    }

    public void setREF_NO(String REF_NO) {
        this.REF_NO = REF_NO;
    }

    public void setTRANS_AMOUNT(String TRANS_AMOUNT) {
        this.TRANS_AMOUNT = TRANS_AMOUNT;
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

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getSYS_ID());
        sb.append(getREF_NO());
        sb.append(getTRANS_AMOUNT());
        sb.append(getRESULT());
        sb.append(getREASON());
        sb.append(getFEE());
        sb.append(getAMOUNT());
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
