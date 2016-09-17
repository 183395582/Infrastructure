package com.gmzj.web;

import java.io.Serializable;
import java.math.BigDecimal;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.BeanFactoryUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.util.Assert;

/**
 * 定义数据库字段的显示属性<br>
 * <ul>
 * <li><b>nameWidth</b>	字段说明文字列表宽度</li>
 * <li><b>fieldWidth</b>	字段输入框列表宽度</li>
 * </ul>
 * <b>注意</b> 如果在浏览列表时，只取nameWidth为表格宽度。
 * @author chenjun.li
 *
 */
public class FieldDefinition implements Serializable, InitializingBean, BeanNameAware
{
	private static final long serialVersionUID = 1L;

	public enum FieldType {Text, Numeric, Selection, Password, Julian, Date, CardNumber, Checkbox,
        Textarea, Time,DateTime,Set, File,Hidden};

    private String field;
    private String name;
    private String value;	//checkbox取值
    private int size;
    private int maxLength;
    private String suffix = "";
    private String prefix = "";
    private boolean readOnlyOnEdit = false;
    private FieldType type = FieldType.Text;
    private boolean readOnlyOnAdd = false;
    private boolean disabled=false;//是否是属性值可编辑,为True不可编辑，add by zhangwei
    private boolean mandatory = false;
    private String onChange;
    private String onKeyup;
    private String onBlur;
    private int labelColSpan = 1;
    private int fieldColSpan = 1;
    private int scale;
    private BigDecimal maxValue;
    private BigDecimal minValue;
    private boolean disableAutoComplete = false;
    private boolean multiline = false;
    private String linkedEvent;
    private String key;
    private boolean visible = true;;
    private String charset = "gb18030";
    private String excludingCharacters = "|'\",";
    private int labelSize;
    private String labelColor;
    //以下属性只用于type 为 file
    private String extension;
    private int maxFileSize;
    //注入bean Id，获取字段所对应的OO对象名称
    private  String beanName;
    //该属性用于TEXT或者Textarea类的字段是否在用户输入时进行实时提示输入的长度，默认为false
    private boolean textLengthRemind=false;
    //该属性当type为Selection，是否舍弃原值并设置此字段对应的默认值 ,默认为true
    private   boolean setDefaultValue=true;

    /*
    该变量用于配置当前field的查询方式，如：当前field需要进行模糊查询，将该变量配置为“like”，要进行完全匹配查询，则配置为“=”
    查询类型：“=”→等于
              “<>”or“!=”→不等于
              “<”→小于
              “<=”→小于等于
              “>”→大于
              “>=”→大于等于
              “like”→like
              “not like”→not like
     */
    private String criteriaMethod="=";

	public String getCriteriaMethod() {
        return criteriaMethod;
    }

    public void setCriteriaMethod(String criteriaMethod) {
        this.criteriaMethod = criteriaMethod;
    }

    public boolean isSetDefaultValue() {
        return setDefaultValue;
    }

    public void setSetDefaultValue(boolean setDefaultValue) {
        this.setDefaultValue = setDefaultValue;
    }

    public String getField()
    {
        return field;
    }
    public void setField(String field)
    {
        this.field = field;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public int getSize()
    {
        return size;
    }
    public void setSize(int size)
    {
        this.size = size;
    }
    public String getSuffix()
    {
        return suffix;
    }
    public void setSuffix(String suffix)
    {
        this.suffix = suffix;
    }
    public String getPrefix()
    {
        return prefix;
    }
    public void setPrefix(String prefix)
    {
        this.prefix = prefix;
    }
    public int getMaxLength()
    {
        return maxLength;
    }
    public void setMaxLength(int maxLength)
    {
        this.maxLength = maxLength;
    }
    public boolean getReadOnlyOnEdit()
    {
        return readOnlyOnEdit;
    }
    public void setReadOnlyOnEdit(boolean readOnlyOnEdit)
    {
        this.readOnlyOnEdit = readOnlyOnEdit;
    }
    public FieldType getType()
    {
        return type;
    }
    public void setType(FieldType type)
    {
        this.type = type;
    }
    public boolean getReadOnlyOnAdd()
    {
        return readOnlyOnAdd;
    }
    public void setReadOnlyOnAdd(boolean readOnlyOnAdd)
    {
        this.readOnlyOnAdd = readOnlyOnAdd;
    }
    public boolean isMandatory()
    {
        return mandatory;
    }
    public void setMandatory(boolean mandatory)
    {
        this.mandatory = mandatory;
    }
    public String getOnChange()
    {
        return onChange;
    }
    public void setOnChange(String onChange)
    {
        this.onChange = onChange;
    }
    public String getOnBlur()
    {
        return onBlur;
    }
    public void setOnBlur(String onBlur)
    {
        this.onBlur = onBlur;
    }
    public int getLabelColSpan()
    {
        return labelColSpan;
    }
    public void setLabelColSpan(int labelColSpan)
    {
        this.labelColSpan = labelColSpan;
    }
    public int getFieldColSpan()
    {
        return fieldColSpan;
    }
    public void setFieldColSpan(int fieldColSpan)
    {
        this.fieldColSpan = fieldColSpan;
    }
    public String getValue()
    {
        return value;
    }
    public void setValue(String value)
    {
        this.value = value;
    }
    public int getScale()
    {
        return scale;
    }
    public void setScale(int scale)
    {
        this.scale = scale;
    }
    public BigDecimal getMaxValue()
    {
        return maxValue;
    }
    public void setMaxValue(BigDecimal maxValue)
    {
        this.maxValue = maxValue;
    }
    public BigDecimal getMinValue()
    {
        return minValue;
    }
    public void setMinValue(BigDecimal minValue)
    {
        this.minValue = minValue;
    }
    public void afterPropertiesSet() throws Exception
    {
        //判断最大最小值合法性
        Assert.isTrue(
                (minValue == null)||
                        (maxValue == null)||
                        (minValue.compareTo(maxValue))<=0,
                "字段[" + field + "]最小值应该小于最大值");
    }
    public boolean isDisableAutoComplete()
    {
        return disableAutoComplete;
    }
    public void setDisableAutoComplete(boolean disableAutoComplete)
    {
        this.disableAutoComplete = disableAutoComplete;
    }
    public boolean isMultiline()
    {
        return multiline;
    }
    public void setMultiline(boolean multiline)
    {
        this.multiline = multiline;
    }
    public String getLinkedEvent()
    {
        return linkedEvent;
    }
    public void setLinkedEvent(String linkedEvent)
    {
        this.linkedEvent = linkedEvent;
    }
    public String getKey()
    {
        return key;
    }
    public void setKey(String key)
    {
        this.key = key;
    }
    public boolean isVisible()
    {
        return visible;
    }
    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }

    protected static class ErrorInfo
    {
        public String code;
        public String defaultMessage;
        public Object[] args;

        public ErrorInfo(String code, Object[] args, String defaultMessage)
        {
            this.code = code;
            this.defaultMessage = defaultMessage;
            this.args = args;
        }
        public ErrorInfo(String code, String defaultMessage)
        {
            this.code = code;
            this.defaultMessage = defaultMessage;
            this.args = null;
        }
    }

    public int getLabelSize()
    {
        return labelSize;
    }
    public void setLabelSize(int labelSize)
    {
        this.labelSize = labelSize;
    }
    public String getLabelColor()
    {
        return labelColor;
    }
    public void setLabelColor(String labelColor)
    {
        this.labelColor = labelColor;
    }
    public String getExtension()
    {
        return extension;
    }
    public void setExtension(String extension)
    {
        this.extension = extension;
    }
    public int getMaxFileSize()
    {
        return maxFileSize;
    }
    public void setMaxFileSize(int maxFileSize)
    {
        this.maxFileSize = maxFileSize;
    }

    public boolean getTextLengthRemind() {
        return textLengthRemind;
    }

    public void setTextLengthRemind(boolean textLengthRemind) {
        this.textLengthRemind = textLengthRemind;
    }

    public String getBeanName() {
        return beanName;
    }
    public void setBeanName(String beanName) {
        beanName=StringUtils.substringBefore(beanName, BeanFactoryUtils.GENERATED_BEAN_NAME_SEPARATOR);
        beanName=StringUtils.substringBefore(beanName, PropertiesBeanDefinitionReader.CONSTRUCTOR_ARG_PREFIX);
        this.beanName = beanName;
    }
    public String getOnKeyup()
    {
        return onKeyup;
    }
    public void setOnKeyup(String onKeyup)
    {
        this.onKeyup = onKeyup;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public String getCharset()
	{
		return charset;
	}

	public String getExcludingCharacters()
	{
		return excludingCharacters;
	}

	public void setCharset(String charset)
	{
		this.charset = charset;
	}

	public void setExcludingCharacters(String excludingCharacters)
	{
		this.excludingCharacters = excludingCharacters;
	}
}
