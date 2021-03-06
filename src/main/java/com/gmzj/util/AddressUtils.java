package com.gmzj.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;

public class AddressUtils {
	
	private static String localhost = "125.71.76.2";//本地测试用
	
	/**
	 * 
	 * @param content 请求的参数 格式为：ip=xxx
	 * @param encoding 服务器端请求编码。如GBK,UTF-8等
	 * @return 响应格式：{"ret":1,"start":-1,"end":-1,"country":"\u4e2d\u56fd",
	 * 				"province":"\u56db\u5ddd","city":"\u6210\u90fd","district":"","isp":"","type":"","desc":""}
	 * @throws UnsupportedEncodingException
	 */
	public static String getAddresses(String param, String encodingString)
			throws UnsupportedEncodingException {
		//如果是本地测试则替换ip
		if (param.indexOf("127.0.0.1") > -1) {
			param = "ip="+localhost;
		}
		// 这里调用pconline的接口
		String urlStr = "http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&";
		String resultStr = getResult(urlStr, param, encodingString);
		return resultStr;
	}
	/**
	 * @param urlStr 请求的地址
	 * @param content 请求的参数 格式为：name=xxx&pwd=xxx
	 * @param encoding
	 *            服务器端请求编码。如GBK,UTF-8等
	 * @return
	 */
	private static String getResult(String urlStr, String content, String encoding) {
		URL url = null;
		HttpURLConnection connection = null;
		try {
			url = new URL(urlStr);
			connection = (HttpURLConnection) url.openConnection();// 新建连接实例
			connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫秒
			connection.setReadTimeout(2000);// 设置读取数据超时时间，单位毫秒
			connection.setDoOutput(true);// 是否打开输出流 true|false
			connection.setDoInput(true);// 是否打开输入流true|false
			connection.setRequestMethod("POST");// 提交方法POST|GET
			connection.setUseCaches(false);// 是否缓存true|false
			connection.connect();// 打开连接端口
			DataOutputStream out = new DataOutputStream(connection
					.getOutputStream());// 打开输出流往对端服务器写数据
			out.writeBytes(content);// 写数据,也就是提交你的表单 name=xxx&pwd=xxx
			out.flush();// 刷新
			out.close();// 关闭输出流
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), encoding));// 往对端写完数据对端服务器返回数据
			// ,以BufferedReader流来读取
			StringBuffer buffer = new StringBuffer();
			String line = "";
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			return buffer.toString();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.disconnect();// 关闭连接
			}
		}
		return null;
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println(AddressUtils.getAddresses("ip=127.0.0.1", "utf-8"));
	}
}
