package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.CartQuery;
import com.soft2242.shop.query.EditCartQuery;
import com.soft2242.shop.vo.CartGoodsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserShoppingCartService extends IService<UserShoppingCart> {

    //添加购物车
    CartGoodsVO addShopCart(CartQuery query);

    //购物车列表
    List<CartGoodsVO> shopCartList(Integer userId);

    //修改购物车
    CartGoodsVO editCart(EditCartQuery query);

}
