package com.superfarmland.system.mapper;

import com.superfarmland.system.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zzz
 * @since 2021-04-18
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
