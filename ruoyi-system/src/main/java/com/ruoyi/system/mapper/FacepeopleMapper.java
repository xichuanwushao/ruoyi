package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Facepeople;

/**
 * 人脸识别库Mapper接口
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
public interface FacepeopleMapper 
{
    /**
     * 查询人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 人脸识别库
     */
    public Facepeople selectFacepeopleById(Long id);

    /**
     * 查询人脸识别库列表
     * 
     * @param facepeople 人脸识别库
     * @return 人脸识别库集合
     */
    public List<Facepeople> selectFacepeopleList(Facepeople facepeople);

    /**
     * 新增人脸识别库
     * 
     * @param facepeople 人脸识别库
     * @return 结果
     */
    public int insertFacepeople(Facepeople facepeople);

    /**
     * 修改人脸识别库
     * 
     * @param facepeople 人脸识别库
     * @return 结果
     */
    public int updateFacepeople(Facepeople facepeople);

    /**
     * 删除人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 结果
     */
    public int deleteFacepeopleById(Long id);

    /**
     * 批量删除人脸识别库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacepeopleByIds(Long[] ids);
}
