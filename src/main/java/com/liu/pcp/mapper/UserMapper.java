package com.liu.pcp.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liu.pcp.dao.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
