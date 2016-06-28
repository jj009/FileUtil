package com.jj.vo;

/**
 * Created by Administrator on 2016/6/5.
 */
public class UpPartiesVo {
    private String FULL_NAME;
    private String ISSUER_NET_NO;
    private String ISSUER_FACTOR;
    private String START_DATE;
    private String END_DATE;
    private String ENDSIGN;
  
    public String getFULL_NAME() {
		return FULL_NAME;
	}

	public void setFULL_NAME(String fULL_NAME) {
		FULL_NAME = fULL_NAME;
	}

	public String getISSUER_NET_NO() {
		return ISSUER_NET_NO;
	}

	public void setISSUER_NET_NO(String iSSUER_NET_NO) {
		ISSUER_NET_NO = iSSUER_NET_NO;
	}

	public String getISSUER_FACTOR() {
		return ISSUER_FACTOR;
	}

	public void setISSUER_FACTOR(String iSSUER_FACTOR) {
		ISSUER_FACTOR = iSSUER_FACTOR;
	}

	public String getSTART_DATE() {
		return START_DATE;
	}

	public void setSTART_DATE(String sTART_DATE) {
		START_DATE = sTART_DATE;
	}

	public String getEND_DATE() {
		return END_DATE;
	}

	public void setEND_DATE(String eND_DATE) {
		END_DATE = eND_DATE;
	}

	public String getENDSIGN() {
		return ENDSIGN;
	}

	public void setENDSIGN(String eNDSIGN) {
		ENDSIGN = eNDSIGN;
	}

	public static UpPartiesVo converFromStr(String str)throws Exception{
		UpPartiesVo partiesVo=new UpPartiesVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
            partiesVo.setFULL_NAME(str.substring(0,50));
            partiesVo.setISSUER_NET_NO(str.substring(50, 54));
            partiesVo.setISSUER_FACTOR(str.substring(54, 70));
            partiesVo.setSTART_DATE(str.substring(70, 76));
            partiesVo.setEND_DATE(str.substring(76, 82));
            partiesVo.setENDSIGN(str.substring(82, 84));
        }catch (Exception e){
            throw e;
        }
        return partiesVo;
    }
}
