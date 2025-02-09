package com.dimple.system.web.controller.vo.params;

import lombok.Data;

/**
 * 用户和角色关联 sys_user_role
 *
 * @author Dimple
 */
@Data
public class SysUserRoleVOParams {
    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 角色ID
     */
    private Long roleId;
}
