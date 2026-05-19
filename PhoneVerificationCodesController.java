package org.xingyu.system.ccq.controller;

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
import org.xingyu.system.ccq.domain.PhoneVerificationCodes;
import org.xingyu.system.ccq.service.IPhoneVerificationCodesService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 短信验证码记录，用于发送、校验及频率控制Controller
 * 
 * @author ruoyi
 * @date 2026-05-20
 */
@RestController
@RequestMapping("/ccq/codes")
public class PhoneVerificationCodesController extends BaseController
{
    @Autowired
    private IPhoneVerificationCodesService phoneVerificationCodesService;

    /**
     * 查询短信验证码记录，用于发送、校验及频率控制列表
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:list')")
    @GetMapping("/list")
    public TableDataInfo list(PhoneVerificationCodes phoneVerificationCodes)
    {
        startPage();
        List<PhoneVerificationCodes> list = phoneVerificationCodesService.selectPhoneVerificationCodesList(phoneVerificationCodes);
        return getDataTable(list);
    }

    /**
     * 导出短信验证码记录，用于发送、校验及频率控制列表
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:export')")
    @Log(title = "短信验证码记录，用于发送、校验及频率控制", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PhoneVerificationCodes phoneVerificationCodes)
    {
        List<PhoneVerificationCodes> list = phoneVerificationCodesService.selectPhoneVerificationCodesList(phoneVerificationCodes);
        ExcelUtil<PhoneVerificationCodes> util = new ExcelUtil<PhoneVerificationCodes>(PhoneVerificationCodes.class);
        util.exportExcel(response, list, "短信验证码记录，用于发送、校验及频率控制数据");
    }

    /**
     * 获取短信验证码记录，用于发送、校验及频率控制详细信息
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(phoneVerificationCodesService.selectPhoneVerificationCodesById(id));
    }

    /**
     * 新增短信验证码记录，用于发送、校验及频率控制
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:add')")
    @Log(title = "短信验证码记录，用于发送、校验及频率控制", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody PhoneVerificationCodes phoneVerificationCodes)
    {
        return toAjax(phoneVerificationCodesService.insertPhoneVerificationCodes(phoneVerificationCodes));
    }

    /**
     * 修改短信验证码记录，用于发送、校验及频率控制
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:edit')")
    @Log(title = "短信验证码记录，用于发送、校验及频率控制", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody PhoneVerificationCodes phoneVerificationCodes)
    {
        return toAjax(phoneVerificationCodesService.updatePhoneVerificationCodes(phoneVerificationCodes));
    }

    /**
     * 删除短信验证码记录，用于发送、校验及频率控制
     */
    @PreAuthorize("@ss.hasPermi('ccq:codes:remove')")
    @Log(title = "短信验证码记录，用于发送、校验及频率控制", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(phoneVerificationCodesService.deletePhoneVerificationCodesByIds(ids));
    }
}
