package com.superfarmland.system.service.impl;

import com.superfarmland.system.entity.SysUser;
import com.superfarmland.system.mapper.SysUserMapper;
import com.superfarmland.system.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzz
 * @since 2021-04-18
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

}
