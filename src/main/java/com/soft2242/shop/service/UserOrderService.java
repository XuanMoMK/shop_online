package com.soft2242.shop.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft2242.shop.common.result.PageResult;
import com.soft2242.shop.entity.Goods;
import com.soft2242.shop.entity.UserOrder;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.query.CancelGoodsQuery;
import com.soft2242.shop.query.OrderPreQuery;
import com.soft2242.shop.query.OrderQuery;
import com.soft2242.shop.vo.OrderDetailVO;
import com.soft2242.shop.vo.SubmitOrderVO;
import com.soft2242.shop.vo.UserOrderGoodsVO;
import com.soft2242.shop.vo.UserOrderVO;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserOrderService extends IService<UserOrder> {

//提交订单
    Integer addGoodsOrder(UserOrderVO orderVO);


//订单详情
    OrderDetailVO getOrderDetail(Integer id);

//填写订单 - 获取预付订单
    SubmitOrderVO getPreOrderDetail(Integer userId);

//填写订单 - 获取立即购买订单
    SubmitOrderVO getPreNowOrderDetail(OrderPreQuery query);

//填写订单 - 获取再次购买订单
    SubmitOrderVO getRepurchaseOrderDetail(Integer id);

//订单列表
    PageResult<OrderDetailVO> getOrderList(OrderQuery query);

// 取消订单
    OrderDetailVO cancelOrder(CancelGoodsQuery query);

    /**
     * 删除订单
     *
     * @param ids
     */
    void deleteOrder(List<Integer> ids,Integer userId);





}
