package com.hw.shop.controller.weixin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.hw.framework.weixin.utils.SignUtil;
import com.hw.shop.service.weixin.WxBackService;

/**
* @ClassName: WeiXinCoreAtc
* @Description: 微信核心请求处理类,与微信交互均通过此处
* @author: huangwen 
* @modifier: None
* @modifyReason: None
* @mail:   huangwen6@163.com
* @modifierEmail:如有修改，请留下您的邮箱!!!
* @createdate: 2016年2月27日 下午9:34:41
* @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
* @modifyReason: 如有改动本类型,请写下本类型改动说明!!!
* @version: V1.0   
*/
@Controller
@SessionAttributes(value = { "loginuser", "masterName","moduleList","map" })    
@RequestMapping("/weixinAct")
public class WeiXinCoreAtc {
	
	private static Logger log = Logger.getLogger(WeiXinCoreAtc.class);
	@Autowired
	private WxBackService backService;
	@Autowired
	private UserInfoService userInfoService;

	/**
	* @Title: checkSignature
	* @Description: 确认请求来自微信服务认证
	* @param request
	* @param response
	* @param modelMap
	* @throws IOException    设定文件，设定文件后中文说明记得删除
	* @return: void    返回类型
	* @throws:
	* @auther:huangwen
	* @modifier: None
	* @version:huangwen
	* @modifier:None
	* @mail:  huangwen6@163.com   
	* @modifierdate:如有改动此方法,请按照创建时间修改此处时间!!!
	* @modifyReason: 如有改动此方法,请写下修改原因!!!
	* @createdate: 2016年2月27日 下午9:27:50
	*/
	@RequestMapping(value = "/main", method=RequestMethod.GET )
	public void checkSignature(HttpServletRequest request,HttpServletResponse response,   ModelMap modelMap) throws IOException
	{
		// 微信加密签名
		String signature = request.getParameter("signature");
		log.info("微信加密签名:"+signature);
		// 时间戳
		
		String timestamp = request.getParameter("timestamp");
		// 随机字符
		String nonce = request.getParameter("nonce");
		// 随机字符串
		String echostr = request.getParameter("echostr");

		PrintWriter out = response.getWriter();
		// 通过、、signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
		if (SignUtil.checkSignature(signature, timestamp, nonce)) {
			log.info("接口校验成功");
			out.print(echostr);
		}
		out.close();
		out = null;
	}
	
	/**
	* @Title: processRequest
	* @Description: 处理微信服务器发来的消息
	* @param request
	* @param response
	* @param session
	* @throws IOException    设定文件，设定文件后中文说明记得删除
	* @return: void    返回类型
	* @throws:
	* @auther:huangwen
	* @modifier: None
	* @version:huangwen
	* @modifier:none
	* @mail:  huangwen6@163.com   
	* @modifierdate:如有改动此方法，请按照创建时间修改此处时间!!!
	* @modifyReason:如修改本方法,请写下修改原因!!
	* @createdate: 2016年2月27日 下午9:33:03
	*/
	@RequestMapping(value = "/main", method=RequestMethod.POST )
	public void processRequest( HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException
	{    
		
		log.info("来自处理微信请求....");
		// 将请求响应的编码均设置为UTF-8（防止中文乱码）
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		//  从请求中获取用户的原始id 并根据原始id查找对应服务账号
		Map<String, String> requestMap;
		// 调用核心业务类接收消息、处理消息
		String respMessage1 = backService.processRequest(request,session);
        log.info(respMessage1);
		// 响应消息
		PrintWriter out = response.getWriter();
		out.print(respMessage1);
		out.close();
	}

}
