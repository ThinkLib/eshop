package com.hw.shop.wxmanage.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hw.shop.wxmanage.entity.WxBack;

/**
* @ClassName: BackService
* @Description: TODO(用一句话描述该文件做什么,记住删除TODO,TODO为项目中待执行任务)
* @author: huangwen 
* @modifier: None
* @modifyReason: None
* @mail:   huangwen6@163.com
* @modifierEmail:如有修改，请留下您的邮箱!!!
* @createdate: 2016年2月27日 下午9:36:46
* @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
* @modifyReason: 如有改动本类型,请写下本类型改动说明!!!
* @version: V1.0   
*/
public interface WxBackService {
	List<WxBack> queryWxBackList(int user_id,int back_type);
	List<WxBack> queryWxBackList1(int user_id,int back_type);
	int addWxBack(WxBack wxBack);
	WxBack queryWxBackInfo(int back_id);
	int updateWxBackInfo(int back_id,WxBack wxBack);
	int delWxBackInfo(int back_id);  
	int updateWxBackFlag(int back_id,int flag);
	String processRequest(HttpServletRequest request,HttpSession session);
	int delBackToUserAndType(int backType,int userId);
}
