package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人脸识别库对象 faceperson
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
public class Faceperson extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String name;

    /** 工号 */
    @Excel(name = "工号")
    private Long number;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String imagePath;

    /** 图片内容 */
    @Excel(name = "图片内容")
    private String imageBase64;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setNumber(Long number) 
    {
        this.number = number;
    }

    public Long getNumber() 
    {
        return number;
    }
    public void setImagePath(String imagePath) 
    {
        this.imagePath = imagePath;
    }

    public String getImagePath() 
    {
        return imagePath;
    }
    public void setImageBase64(String imageBase64) 
    {
        this.imageBase64 = imageBase64;
    }

    public String getImageBase64() 
    {
        return imageBase64;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("number", getNumber())
            .append("imagePath", getImagePath())
            .append("imageBase64", getImageBase64())
            .toString();
    }
}
