package com.gmzj.entity;

/**
 * 枚举接口，用于处理entity与mybatis数据绑定
 * @author Edward
 *
 * @param <E>
 */
public interface IntEnum <E extends Enum<E>> {
	String getIndex();
}
