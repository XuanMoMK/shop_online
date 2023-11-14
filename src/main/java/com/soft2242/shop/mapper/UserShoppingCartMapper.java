package com.soft2242.shop.mapper;

import com.soft2242.shop.entity.UserShoppingCart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft2242.shop.vo.CartGoodsVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserShoppingCartMapper extends BaseMapper<UserShoppingCart> {

    //查询购物车信息
    List<CartGoodsVO> getCartGoodsInfo(@Param("id") Integer id);

}
