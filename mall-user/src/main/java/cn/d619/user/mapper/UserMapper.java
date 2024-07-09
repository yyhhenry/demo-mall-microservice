package cn.d619.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import cn.d619.user.pojo.po.UserPO;

@Mapper
public interface UserMapper extends BaseMapper<UserPO> {
}
