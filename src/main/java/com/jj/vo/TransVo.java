package com.jj.vo;

import com.jj.util.FileUtils;

/**延迟处理vo
 * Created by Administrator on 2016/5/22.
 */
public class TransVo implements IEntity{
    private String SYS_ID="";
    private String REF_NO="";
    private String TRANS_AMOUN="";
    private String RESULT="";
    private String REASON="";
    private String FEE="";
    private String AMOUNT="";
    private String ENDSIGN="";

    public String getSYS_ID() {
        return SYS_ID;
    }

    public String getREF_NO() {
        return REF_NO;
    }

    public String getTRANS_AMOUN() {
        return TRANS_AMOUN;
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

    public String getENDSIGN() {
        return ENDSIGN;
    }

    public void setSYS_ID(String SYS_ID) {
        this.SYS_ID = SYS_ID;
    }

    public void setREF_NO(String REF_NO) {
        this.REF_NO = REF_NO;
    }

    public void setTRANS_AMOUN(String TRANS_AMOUN) {
        this.TRANS_AMOUN = TRANS_AMOUN;
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

    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append(getSYS_ID()).append(FileUtils.splitstr);
        sb.append(getREF_NO()).append(FileUtils.splitstr);
        sb.append(getTRANS_AMOUN()).append(FileUtils.splitstr);
        sb.append(getRESULT()).append(FileUtils.splitstr);
        sb.append(getREASON()).append(FileUtils.splitstr);
        sb.append(getFEE()).append(FileUtils.splitstr);
        sb.append(getAMOUNT()).append(FileUtils.splitstr);
        sb.append(getENDSIGN());
        return sb.toString();
    }
}
