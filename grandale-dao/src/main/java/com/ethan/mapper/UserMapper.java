package com.ethan.mapper;

import com.ethan.pojo.User;

/**
 * Created by Ethan on 2017/4/25.
 */
public interface UserMapper {

    User selectByPrimaryKey(Long userId);
}
