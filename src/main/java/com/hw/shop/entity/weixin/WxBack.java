package com.hw.shop.entity.weixin;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
* @ClassName: WxBack
* @Description: 客服回复实体类
* @author: huangwen 
* @modifier: None
* @modifyReason: None
* @mail:   huangwen6@163.com
* @modifierEmail:如有修改，请留下您的邮箱!!!
* @createdate: 2016年2月27日 下午9:38:44
* @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
* @modifyReason: 如有改动本类型,请写下本类型改动说明!!!
* @version: V1.0   
*/
public class WxBack implements Serializable {

	private static final long serialVersionUID = 1L;
	/**    
	  * backId:回复编号
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:39:20
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Integer backId;
	/**    
	  * backType:回复类型
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:39:32
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Integer backType;
	/**    
	  * content:回复类容
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:39:40
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private String content;
	/**    
	  * materialId:若图文消息情况下,则为素材Id
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:40:04
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Integer materialId;
	/**    
	  * userId:用户编号
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:42:25
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Integer userId;
	/**    
	  * inserttime:数据保存时间
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:42:39
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Timestamp inserttime;
	/**    
	  * flag:数据标记
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:42:51
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private Integer flag;
	/**    
	  * reserve:备用
	  *    
	  * @author: huangwen 
	  * @modifier: None
	  * @mail:  huangwen6@163.com 
	  * @modifierEmail:如有修改，请留下您的邮箱!!! 
	  * @createdate: 2016年2月27日 下午9:43:01
	  * @modifierdate:如有改动此类，请按照创建时间修改此处时间!!!
	  * @modifyReason:修改此处的原因,如有修改,请写下原因!!!
	  * @version: Ver 1.0  
	  */  
	private String reserve;

	public WxBack(Integer backId, Integer backType, String content,
			Integer materialId, Integer userId, Timestamp inserttime,
			Integer flag, String reserve) {
		super();
		this.backId = backId;
		this.backType = backType;
		this.materialId = materialId;
		this.userId = userId;
		this.inserttime = inserttime;
		this.flag = flag;
		this.reserve = reserve;
	}

	public WxBack() {
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
		this.materialId = materialId;
	}

	public Integer getBackId() {
		return backId;
	}

	public void setBackId(Integer backId) {
		this.backId = backId;
	}

	public Integer getBackType() {
		return backType;
	}

	public void setBackType(Integer backType) {
		this.backType = backType;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Timestamp getInserttime() {
		return inserttime;
	}

	public void setInserttime(Timestamp inserttime) {
		this.inserttime = inserttime;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public String getReserve() {
		return reserve;
	}

	public void setReserve(String reserve) {
		this.reserve = reserve;
	}

}
