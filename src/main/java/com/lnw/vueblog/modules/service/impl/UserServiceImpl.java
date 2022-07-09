package com.lnw.vueblog.modules.service.impl;

import com.lnw.vueblog.modules.model.User;
import com.lnw.vueblog.modules.mapper.UserMapper;
import com.lnw.vueblog.modules.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 刘 乃伟
 * @since 2022-07-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
