package com.github.flux.mapper;

import com.github.flux.base.BaseMapper;
import com.github.flux.entity.User;

public interface UserMapper extends BaseMapper<User> {
	public void add2(User t) throws Exception;
}
