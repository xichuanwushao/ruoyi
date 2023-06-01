package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.Faceperson;
import com.ruoyi.system.service.IFacepersonService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 人脸识别库Controller
 * 
 * @author wuxiao
 * @date 2023-06-01
 */
@RestController
@RequestMapping("/system/faceperson")
public class FacepersonController extends BaseController
{
    @Autowired
    private IFacepersonService facepersonService;

    /**
     * 查询人脸识别库列表
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:list')")
    @GetMapping("/list")
    public TableDataInfo list(Faceperson faceperson)
    {
        startPage();
        List<Faceperson> list = facepersonService.selectFacepersonList(faceperson);
        return getDataTable(list);
    }

    /**
     * 导出人脸识别库列表
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:export')")
    @Log(title = "人脸识别库", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Faceperson faceperson)
    {
        List<Faceperson> list = facepersonService.selectFacepersonList(faceperson);
        ExcelUtil<Faceperson> util = new ExcelUtil<Faceperson>(Faceperson.class);
        util.exportExcel(response, list, "人脸识别库数据");
    }

    /**
     * 获取人脸识别库详细信息
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(facepersonService.selectFacepersonById(id));
    }

    /**
     * 新增人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:add')")
    @Log(title = "人脸识别库", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Faceperson faceperson)
    {
        return toAjax(facepersonService.insertFaceperson(faceperson));
    }

    /**
     * 修改人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:edit')")
    @Log(title = "人脸识别库", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Faceperson faceperson)
    {
        return toAjax(facepersonService.updateFaceperson(faceperson));
    }

    /**
     * 删除人脸识别库
     */
    @PreAuthorize("@ss.hasPermi('system:faceperson:remove')")
    @Log(title = "人脸识别库", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(facepersonService.deleteFacepersonByIds(ids));
    }
}
