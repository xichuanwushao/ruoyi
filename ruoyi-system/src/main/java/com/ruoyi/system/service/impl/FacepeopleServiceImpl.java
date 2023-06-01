package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FacepeopleMapper;
import com.ruoyi.system.domain.Facepeople;
import com.ruoyi.system.service.IFacepeopleService;

/**
 * 人脸识别库Service业务层处理
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
@Service
public class FacepeopleServiceImpl implements IFacepeopleService 
{
    @Autowired
    private FacepeopleMapper facepeopleMapper;

    /**
     * 查询人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 人脸识别库
     */
    @Override
    public Facepeople selectFacepeopleById(Long id)
    {
        return facepeopleMapper.selectFacepeopleById(id);
    }

    /**
     * 查询人脸识别库列表
     * 
     * @param facepeople 人脸识别库
     * @return 人脸识别库
     */
    @Override
    public List<Facepeople> selectFacepeopleList(Facepeople facepeople)
    {
        return facepeopleMapper.selectFacepeopleList(facepeople);
    }

    /**
     * 新增人脸识别库
     * 
     * @param facepeople 人脸识别库
     * @return 结果
     */
    @Override
    public int insertFacepeople(Facepeople facepeople)
    {
        return facepeopleMapper.insertFacepeople(facepeople);
    }

    /**
     * 修改人脸识别库
     * 
     * @param facepeople 人脸识别库
     * @return 结果
     */
    @Override
    public int updateFacepeople(Facepeople facepeople)
    {
        return facepeopleMapper.updateFacepeople(facepeople);
    }

    /**
     * 批量删除人脸识别库
     * 
     * @param ids 需要删除的人脸识别库主键
     * @return 结果
     */
    @Override
    public int deleteFacepeopleByIds(Long[] ids)
    {
        return facepeopleMapper.deleteFacepeopleByIds(ids);
    }

    /**
     * 删除人脸识别库信息
     * 
     * @param id 人脸识别库主键
     * @return 结果
     */
    @Override
    public int deleteFacepeopleById(Long id)
    {
        return facepeopleMapper.deleteFacepeopleById(id);
    }
}
