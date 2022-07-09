package com.lnw.vueblog.modules.service.impl;

import com.lnw.vueblog.modules.model.Blog;
import com.lnw.vueblog.modules.mapper.BlogMapper;
import com.lnw.vueblog.modules.service.BlogService;
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
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
