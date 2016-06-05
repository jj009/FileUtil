package com.jj.util;

import com.jj.vo.UpCleanHeaderVo;
import com.jj.vo.UpClearVo;
import com.jj.vo.UpPartiesHeaderVo;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/5.
 */
public class AnlysisUtil {
    public static Logger log= Logger.getLogger(AnlysisUtil.class);
    /**
     * 清分文件头解析方法
     * @param file
     * @return
     */
    public static UpCleanHeaderVo convertFromFile(File file){
        LineIterator ll=null;
        try {
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                return UpCleanHeaderVo.converFromString(line);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return null;
    }

    /**
     * 请分文件内容分行数解析
     * @param file
     * @param startNum 从1开始
     * @param endNum
     * @return
     */
    public static List<UpClearVo> convertFromFile(File file,int startNum,int endNum){
        LineIterator ll=null;
        List<UpClearVo> list=new ArrayList();
        if(startNum<=0){
            log.error("开始行小于1");
            return list;
        }
        try {
            int curt=0;
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                if(curt==0){
                    continue;
                }else if(curt<endNum){
                    if(curt>=startNum){
                        list.add(UpClearVo.converFromString(line));
                    }
                }else{
                    return list;
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return list;
    }

    /**
     * 参与方文件头解析
     */
    public static UpPartiesHeaderVo convertFromFileForParties(File file){
        LineIterator ll=null;
        try {
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                return UpPartiesHeaderVo.converFromStr(line);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return null;
    }
}
