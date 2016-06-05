package com.jj.vo;

/**
 * Created by Administrator on 2016/6/5.
 */
public class UpPartiesHeaderVo {
    private String RECORD_COUNT;
    private String SEND_DATAE;
    private String ENDSIGN;

    public String getRECORD_COUNT() {
        return RECORD_COUNT;
    }

    public void setRECORD_COUNT(String RECORD_COUNT) {
        this.RECORD_COUNT = RECORD_COUNT;
    }

    public String getSEND_DATAE() {
        return SEND_DATAE;
    }

    public void setSEND_DATAE(String SEND_DATAE) {
        this.SEND_DATAE = SEND_DATAE;
    }

    public String getENDSIGN() {
        return ENDSIGN;
    }

    public void setENDSIGN(String ENDSIGN) {
        this.ENDSIGN = ENDSIGN;
    }
    public static UpPartiesHeaderVo converFromStr(String str)throws Exception{
        UpPartiesHeaderVo partiesVo=new UpPartiesHeaderVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
            partiesVo.setRECORD_COUNT(str.substring(0,10));
            partiesVo.setSEND_DATAE(str.substring(10,16));
            partiesVo.setENDSIGN(str.substring(16,18));
        }catch (Exception e){
            throw e;
        }
        return partiesVo;
    }
}
