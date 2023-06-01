package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 人脸识别库对象 facepeople
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
public class Facepeople extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private Long id;

    /** 姓名 */
    @Excel(name = "姓名")
    private String nickName;

    /** 工号 */
    @Excel(name = "工号")
    private String number;

    /** 图片路径 */
    @Excel(name = "图片路径")
    private String imagePath;

    /** 图片内容 */
    @Excel(name = "图片内容")
    private String imageBase64;

    /** 账号 */
    @Excel(name = "账号")
    private String userName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }
    public void setNumber(String number) 
    {
        this.number = number;
    }

    public String getNumber() 
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
    public void setUserName(String userName) 
    {
        this.userName = userName;
    }

    public String getUserName() 
    {
        return userName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("nickName", getNickName())
            .append("number", getNumber())
            .append("imagePath", getImagePath())
            .append("imageBase64", getImageBase64())
            .append("userName", getUserName())
            .toString();
    }
}
