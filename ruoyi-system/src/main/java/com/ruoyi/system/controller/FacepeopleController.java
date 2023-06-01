package com.ruoyi.system.controller;

import java.io.File;
import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.config.RuoYiConfig;
import com.ruoyi.common.utils.file.FileUploadUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.Facepeople;
import com.ruoyi.system.service.IFacepeopleService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 人脸识别库Controller
 *
 * @author wuxiao
 * @date 2023-06-01
 */
@RestController
@RequestMapping("/system/facepeople")
public class FacepeopleController extends BaseController
{
    @Autowired
    private IFacepeopleService facepeopleService;

    @Autowired
    private RuoYiConfig ruoYiConfig;

    /**
     * 查询人脸识别库列表
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:list')")
    @GetMapping("/list")
    public TableDataInfo list(Facepeople facepeople)
    {
        startPage();
        List<Facepeople> list = facepeopleService.selectFacepeopleList(facepeople);
        return getDataTable(list);
    }

    /**
     * 导出人脸识别库列表
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:export')")
    @Log(title = "人脸识别库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Facepeople facepeople)
    {
        List<Facepeople> list = facepeopleService.selectFacepeopleList(facepeople);
        ExcelUtil<Facepeople> util = new ExcelUtil<Facepeople>(Facepeople.class);
        util.exportExcel(response, list, "人脸识别库数据");
    }

    /**
     * 获取人脸识别库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(facepeopleService.selectFacepeopleById(id));
    }

    /**
     * 新增人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:add')")
    @Log(title = "人脸识别库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Facepeople facepeople)
    {
        String face = facepeople.getImagePath().replace("/profile","");
        face = RuoYiConfig.getProfile()+ face;
        facepeople.setImageBase64(face);
        return toAjax(facepeopleService.insertFacepeople(facepeople));
    }


    /**
     * 获取人脸识别库详细信息
     */
    @PostMapping("/getface")
    public AjaxResult uploadFile(MultipartFile file) throws Exception
    {
        // 上传文件路径
        String filePath = RuoYiConfig.getUploadPath();
        // 上传并返回新文件名称
        String fileName = FileUploadUtils.upload(filePath, file);
        String face = fileName.replace("/profile","");
        face = RuoYiConfig.getProfile()+ face;
        Facepeople facepeople = facepeopleService.selectFacepeopleById(1L);
        facepeople.setRemark(face);
        return success(facepeople);
    }

    /**
     * 修改人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:edit')")
    @Log(title = "人脸识别库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Facepeople facepeople)
    {
        return toAjax(facepeopleService.updateFacepeople(facepeople));
    }

    /**
     * 删除人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:facepeople:remove')")
    @Log(title = "人脸识别库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(facepeopleService.deleteFacepeopleByIds(ids));
    }
}
