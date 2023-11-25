package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.vo.OrderDetailVO;
import com.soft2242.shop.vo.SubmitOrderVO;
import com.soft2242.shop.vo.UserOrderVO;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserOrderService extends IService<UserOrder> {
    /**
     * 提交订单
     *
     * @return
     */
    Integer addGoodsOrder(UserOrderVO orderVO);

    /**
     * 订单详情
     *
     * @param id
     * @return
     */
    OrderDetailVO getOrderDetail(Integer id);

    /**
     * 填写订单 - 获取预付订单
     *
     * @param userId
     * @return
     */
    SubmitOrderVO getPreOrderDetail(Integer userId);
}
