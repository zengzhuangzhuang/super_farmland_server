package com.superfarmland.system.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zzz
 * @since 2021-04-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 登录账号
     */
    private String loginId;

    /**
     * 登录密码
     */
    private String loginKey;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 用户类型 1农场主 2消费者
     */
    private Integer userType;

    /**
     * 用户手机号码
     */
    private String phoneNumber;

    /**
     * 是否删除 0存在 1注销
     */
    private Integer delstatus;


}
