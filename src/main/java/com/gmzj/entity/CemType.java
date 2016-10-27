package com.gmzj.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CemType implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Integer id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.name
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String name;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.cem_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Integer cemId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.zone_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Integer zoneId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.code
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String code;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.orig_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Long origPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Long price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.is_dis_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Boolean isDisPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.material
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String material;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.type
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String type;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.colours
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String colours;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.enjoy
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Boolean enjoy;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.special
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Boolean special;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.special_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Integer specialNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.direction
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String direction;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.follow_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private Integer followNum;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String num;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.feature
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String feature;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column t_cem_type.stat
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	private String stat;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.id
	 * @return  the value of t_cem_type.id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.id
	 * @param id  the value for t_cem_type.id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.name
	 * @return  the value of t_cem_type.name
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.name
	 * @param name  the value for t_cem_type.name
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.cem_id
	 * @return  the value of t_cem_type.cem_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Integer getCemId() {
		return cemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.cem_id
	 * @param cemId  the value for t_cem_type.cem_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setCemId(Integer cemId) {
		this.cemId = cemId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.zone_id
	 * @return  the value of t_cem_type.zone_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Integer getZoneId() {
		return zoneId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.zone_id
	 * @param zoneId  the value for t_cem_type.zone_id
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setZoneId(Integer zoneId) {
		this.zoneId = zoneId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.code
	 * @return  the value of t_cem_type.code
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.code
	 * @param code  the value for t_cem_type.code
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.orig_price
	 * @return  the value of t_cem_type.orig_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Long getOrigPrice() {
		return origPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.orig_price
	 * @param origPrice  the value for t_cem_type.orig_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setOrigPrice(Long origPrice) {
		this.origPrice = origPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.price
	 * @return  the value of t_cem_type.price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Long getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.price
	 * @param price  the value for t_cem_type.price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setPrice(Long price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.is_dis_price
	 * @return  the value of t_cem_type.is_dis_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Boolean getIsDisPrice() {
		return isDisPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.is_dis_price
	 * @param isDisPrice  the value for t_cem_type.is_dis_price
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setIsDisPrice(Boolean isDisPrice) {
		this.isDisPrice = isDisPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.material
	 * @return  the value of t_cem_type.material
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.material
	 * @param material  the value for t_cem_type.material
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.type
	 * @return  the value of t_cem_type.type
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getType() {
		return type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.type
	 * @param type  the value for t_cem_type.type
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.colours
	 * @return  the value of t_cem_type.colours
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getColours() {
		return colours;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.colours
	 * @param colours  the value for t_cem_type.colours
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setColours(String colours) {
		this.colours = colours;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.enjoy
	 * @return  the value of t_cem_type.enjoy
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Boolean getEnjoy() {
		return enjoy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.enjoy
	 * @param enjoy  the value for t_cem_type.enjoy
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setEnjoy(Boolean enjoy) {
		this.enjoy = enjoy;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.special
	 * @return  the value of t_cem_type.special
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Boolean getSpecial() {
		return special;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.special
	 * @param special  the value for t_cem_type.special
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setSpecial(Boolean special) {
		this.special = special;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.special_num
	 * @return  the value of t_cem_type.special_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Integer getSpecialNum() {
		return specialNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.special_num
	 * @param specialNum  the value for t_cem_type.special_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setSpecialNum(Integer specialNum) {
		this.specialNum = specialNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.direction
	 * @return  the value of t_cem_type.direction
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.direction
	 * @param direction  the value for t_cem_type.direction
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.follow_num
	 * @return  the value of t_cem_type.follow_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public Integer getFollowNum() {
		return followNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.follow_num
	 * @param followNum  the value for t_cem_type.follow_num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setFollowNum(Integer followNum) {
		this.followNum = followNum;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.num
	 * @return  the value of t_cem_type.num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getNum() {
		return num;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.num
	 * @param num  the value for t_cem_type.num
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setNum(String num) {
		this.num = num;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.feature
	 * @return  the value of t_cem_type.feature
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getFeature() {
		return feature;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.feature
	 * @param feature  the value for t_cem_type.feature
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setFeature(String feature) {
		this.feature = feature;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column t_cem_type.stat
	 * @return  the value of t_cem_type.stat
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public String getStat() {
		return stat;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column t_cem_type.stat
	 * @param stat  the value for t_cem_type.stat
	 * @mbggenerated  Tue Oct 18 22:53:51 CST 2016
	 */
	public void setStat(String stat) {
		this.stat = stat;
	}
}