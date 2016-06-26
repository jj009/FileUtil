package com.jj.util;

import com.jj.vo.UpBlackHeaderVo;
import com.jj.vo.UpBlackVo;
import com.jj.vo.UpCleanHeaderVo;
import com.jj.vo.UpClearVo;
import com.jj.vo.UpDelayHeaderVo;
import com.jj.vo.UpDelayVo;
import com.jj.vo.UpDisputeHeaderVo;
import com.jj.vo.UpDisputeVo;
import com.jj.vo.UpPartiesHeaderVo;
import com.jj.vo.UpPartiesVo;

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
                    curt++;
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

    
    /**
     * 黑卡文件头解析方法
     * @param file
     * @return
     */
    public static UpBlackHeaderVo convertFromBlackFile(File file){
        LineIterator ll=null;
        try {
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                return UpBlackHeaderVo.converFromString(line);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return null;
    }
    /**
     * 争议头文件头解析方法
     * @param file
     * @return
     */
    public static UpDisputeHeaderVo convertFromDisputeHeaderFile(File file){
        LineIterator ll=null;
        try {
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                return UpDisputeHeaderVo.converFromString(line);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return null;
    }
    
    /**
     * 延迟头文件头解析方法
     * @param file
     * @return
     */
    public static UpDelayHeaderVo convertFromDayHeaderFile(File file){
        LineIterator ll=null;
        try {
            ll= FileUtils.lineIterator(file,"GBK");
            while (ll.hasNext()) {
                String line = ll.nextLine();
                return UpDelayHeaderVo.converFromString(line);
            }
        } catch (Exception e) {
            log.error(e.getMessage(),e);
        }finally {
            LineIterator.closeQuietly(ll);
        }
        return null;
    }
    /**
     * 黑名单文件内容分行数解析
     * @param file
     * @param startNum 从1开始
     * @param endNum
     * @return
     */
    public static List<UpBlackVo> convertFromBalckFile(File file,int startNum,int endNum){
        LineIterator ll=null;
        List<UpBlackVo> list=new ArrayList();
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
                        list.add(UpBlackVo.converFromString(line));
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
     * 延迟文件内容分行数解析
     * @param file
     * @param startNum 从1开始
     * @param endNum
     * @return
     */
    public static List<UpDelayVo> convertFromDelayFile(File file,int startNum,int endNum){
        LineIterator ll=null;
        List<UpDelayVo> list=new ArrayList();
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
                        list.add(UpDelayVo.converFromString(line));
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
     * 争议文件内容分行数解析
     * @param file
     * @param startNum 从1开始
     * @param endNum
     * @return
     */
    public static List<UpDisputeVo> convertFromDisputeFile(File file,int startNum,int endNum){
        LineIterator ll=null;
        List<UpDisputeVo> list=new ArrayList();
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
                        list.add(UpDisputeVo.converFromString(line));
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
     * 参与方文件内容分行数解析
     * @param file
     * @param startNum 从1开始
     * @param endNum
     * @return
     */
    public static List<UpPartiesVo> convertFromPartiesFile(File file,int startNum,int endNum){
        LineIterator ll=null;
        List<UpPartiesVo> list=new ArrayList();
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
                        list.add(UpPartiesVo.converFromStr(line));
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

    public static void main(String[] args) {
        File file = new File("C://Users//Administrator//Desktop/ETCPMC-A-C-151016-01-1");
        UpCleanHeaderVo uhv = AnlysisUtil.convertFromFile(file);
        List<UpClearVo> clearVoss = AnlysisUtil.convertFromFile(file, 1, 2);
        System.out.println(clearVoss.toString());
        System.out.println(uhv.toString());

    }
}
