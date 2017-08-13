package com.cqupt.rms.util;

import net.sf.json.JSONObject;

/**
 * 将返回结果转换为一个json对象的工具类
 * @author Cynthia
 *
 */
public class ConvertToJson {

	/**
	 * 
	 * @param mStatus 执行完成后结果状态码   0：成功; 1:失败
	 * @param mContent 成功结果
	 * @param mError 错误结果
	 * @return 将执行结果装换为json数据格式输出
	 */
	public static String strToJson(int mStatus,Object mContent,String mError){
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("mStatus", mStatus);
		jsonObj.put("mContent", mContent);
		jsonObj.put("mError", mError);
		return jsonObj.toString();
	}
}
