package com.soft2242.shop.service;

import com.soft2242.shop.common.exception.ServerException;
import com.soft2242.shop.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.UserLoginQuery;
import com.soft2242.shop.vo.LoginResultVO;
import com.soft2242.shop.vo.UserVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserService extends IService<User> {
    LoginResultVO login(UserLoginQuery query);

//    根据用户id 获取用户信息
//    @paran userId
//    @return
    User getUserInfo(Integer userId);

//“修改用户信息
//    @paran usaPVC
//        @roturn
    UserVO editUserInfo(UserVO userVO);



}
