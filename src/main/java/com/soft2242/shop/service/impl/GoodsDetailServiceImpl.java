package com.soft2242.shop.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.soft2242.shop.common.exception.ServerException;
import com.soft2242.shop.convert.UserOrderDetailConvert;
import com.soft2242.shop.entity.GoodsDetail;
import com.soft2242.shop.entity.UserOrder;
import com.soft2242.shop.entity.UserOrderGoods;
import com.soft2242.shop.entity.UserShippingAddress;
import com.soft2242.shop.mapper.GoodsDetailMapper;
import com.soft2242.shop.mapper.UserOrderGoodsMapper;
import com.soft2242.shop.mapper.UserShippingAddressMapper;
import com.soft2242.shop.service.GoodsDetailService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft2242.shop.vo.OrderDetailVO;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
@Service
public class GoodsDetailServiceImpl extends ServiceImpl<GoodsDetailMapper, GoodsDetail> implements GoodsDetailService {


}
