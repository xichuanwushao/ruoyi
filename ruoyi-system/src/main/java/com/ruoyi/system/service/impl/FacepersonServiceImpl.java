package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.FacepersonMapper;
import com.ruoyi.system.domain.Faceperson;
import com.ruoyi.system.service.IFacepersonService;

/**
 * 人脸识别库Service业务层处理
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
@Service
public class FacepersonServiceImpl implements IFacepersonService 
{
    @Autowired
    private FacepersonMapper facepersonMapper;

    /**
     * 查询人脸识别库
     * 
     * @param id 人脸识别库主键
     * @return 人脸识别库
     */
    @Override
    public Faceperson selectFacepersonById(Long id)
    {
        return facepersonMapper.selectFacepersonById(id);
    }

    /**
     * 查询人脸识别库列表
     * 
     * @param faceperson 人脸识别库
     * @return 人脸识别库
     */
    @Override
    public List<Faceperson> selectFacepersonList(Faceperson faceperson)
    {
        return facepersonMapper.selectFacepersonList(faceperson);
    }

    /**
     * 新增人脸识别库
     * 
     * @param faceperson 人脸识别库
     * @return 结果
     */
    @Override
    public int insertFaceperson(Faceperson faceperson)
    {
        return facepersonMapper.insertFaceperson(faceperson);
    }

    /**
     * 修改人脸识别库
     * 
     * @param faceperson 人脸识别库
     * @return 结果
     */
    @Override
    public int updateFaceperson(Faceperson faceperson)
    {
        return facepersonMapper.updateFaceperson(faceperson);
    }

    /**
     * 批量删除人脸识别库
     * 
     * @param ids 需要删除的人脸识别库主键
     * @return 结果
     */
    @Override
    public int deleteFacepersonByIds(Long[] ids)
    {
        return facepersonMapper.deleteFacepersonByIds(ids);
    }

    /**
     * 删除人脸识别库信息
     * 
     * @param id 人脸识别库主键
     * @return 结果
     */
    @Override
    public int deleteFacepersonById(Long id)
    {
        return facepersonMapper.deleteFacepersonById(id);
    }
}
