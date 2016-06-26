package com.jj.vo;

/**
 * Created by Administrator on 2016/6/5.
 */
public class UpPartiesVo {
    private String FULL_NAME;
  
    public String getFULL_NAME() {
		return FULL_NAME;
	}

	public void setFULL_NAME(String fULL_NAME) {
		FULL_NAME = fULL_NAME;
	}

	public static UpPartiesVo converFromStr(String str)throws Exception{
		UpPartiesVo partiesVo=new UpPartiesVo();
        if(org.apache.commons.lang3.StringUtils.isEmpty(str)){
            throw new Exception("需要解析的字符串为空");
        }
        try{
            partiesVo.setFULL_NAME(str.substring(0,50));
        }catch (Exception e){
            throw e;
        }
        return partiesVo;
    }
}
