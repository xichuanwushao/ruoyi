package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.Faceperson;

/**
 * 人脸识别库Mapper接口
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
public interface FacepersonMapper 
{
    /**
     * 查询人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 人脸识别库
     */
    public Faceperson selectFacepersonById(Long id);

    /**
     * 查询人脸识别库列表
     * 
     * @param faceperson 人脸识别库
     * @return 人脸识别库集合
     */
    public List<Faceperson> selectFacepersonList(Faceperson faceperson);

    /**
     * 新增人脸识别库
     * 
     * @param faceperson 人脸识别库
     * @return 结果
     */
    public int insertFaceperson(Faceperson faceperson);

    /**
     * 修改人脸识别库
     * 
     * @param faceperson 人脸识别库
     * @return 结果
     */
    public int updateFaceperson(Faceperson faceperson);

    /**
     * 删除人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 结果
     */
    public int deleteFacepersonById(Long id);

    /**
     * 批量删除人脸识别库
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteFacepersonByIds(Long[] ids);
}
