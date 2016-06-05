package com.jj.util;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.jj.vo.IEntity;
import com.jj.vo.RefuHeadVo;
import com.jj.vo.RefuVo;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FileUtil {
	public static Logger log= Logger.getLogger(FileUtil.class);
	public  static String splitstr="|";
	/**
	 * 查看某个日期文件夹内 是否已经有这个文件
	 * 没有就创建一个文件并返回
	 * @param filename
	 * @param path
	 * @return
	 */
	public static File getOrcreateFile(String path,String date,String filename){
		if(null==date||"".equals(date)){
			Calendar calendar = Calendar.getInstance();
			date= new SimpleDateFormat("yyyy-MM-dd").format(calendar.getTime());
		}
		File file = new File(path+date);
		if(!file.exists()){
			//如果当天日期的文件夹没有创建就创建一个
			file.mkdir();
		}
		file = new File(path+date+File.separator+filename);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				log.error(e.getMessage(),e);
			}
		}
		return file;
	}

	/**
	 * 接受数据并写入到文件中，header参数是文件头，不为空的话代表新创建文件从头开始写
	 * Hdeader为空的话 则是将content追加写入到指定日期的文件里
	 * @param _header 文件头
	 * @param content 内容不能超过五千条数据 否则抛出异常
	 * @param _date 可为空，为空则默认是今天  格式YYYY-MM-DD
     * @param path 文件保存的路径 调用方自己传入
	 * @param  filename 处理的文件名
     */
	public static void createFile(IEntity _header, List<IEntity> content, String _date, String path,String filename)throws Exception{
		if(content==null||StringUtils.isEmpty(filename)||StringUtils.isEmpty(path)){
			throw new Exception("参数为空");
		}
		if(content.size()>5000){
			throw new Exception("传入数据超量");
		}
		if (StringUtils.isEmpty(_date)){
			Calendar calendar=Calendar.getInstance();
			SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
			_date=format1.format(calendar.getTime());
		}
		File file=getOrcreateFile(path,_date,filename);
		if(_header!=null){
			FileUtils.write(file,_header.toString(),"GBK",false);
			FileUtils.writeStringToFile(file,"\r\n","GBK", true);
		}
		for(IEntity entity:content){
			FileUtils.write(file,entity.toString(),"GBK",true);
			FileUtils.writeStringToFile(file,"\r\n","GBK", true);
		}
	}
    public static void main(String[] args) {
        RefuHeadVo refuHeadVo=new RefuHeadVo();
        refuHeadVo.setBANK_TRANS_ID("setBANK_TRANS_ID");
        refuHeadVo.setCLEAR_BILLNO("setCLEAR_BILLNO");
        refuHeadVo.setENDSIGN("结束");
        refuHeadVo.setFEE_AMOUNT("setFEE_AMOUNT");
        refuHeadVo.setFEE_COUNT("setFEE_COUNT");
        refuHeadVo.setREFU_AMOUNT("setREFU_AMOUNT");
        refuHeadVo.setREFU_COUNT("setREFU_COUNT");
        List<IEntity> list=new ArrayList<IEntity>();
        RefuVo refuVo=new RefuVo();
        refuVo.setENDSIGN("结束");
        refuVo.setAMOUNT("2222");
        refuVo.setFEE("333");
        refuVo.setREF_NO("4444");
        refuVo.setSYS_ID("5555");
        refuVo.setTRANS_AMOUNT("666");
        refuVo.setRESULT("777");
        refuVo.setREASON("8888");
        list.add(refuVo);
        RefuVo refuVo1=new RefuVo();
        refuVo1.setENDSIGN("结束");
        refuVo1.setAMOUNT("2222");
        refuVo1.setFEE("333");
        refuVo1.setREF_NO("4444");
        refuVo1.setSYS_ID("5555");
        refuVo1.setTRANS_AMOUNT("666");
        refuVo1.setRESULT("777");
        refuVo1.setREASON("8888");
        list.add(refuVo1);
        try {
            FileUtil.createFile(refuHeadVo,list,null,"D://","ETCPMC-A-C-151016-01-0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
