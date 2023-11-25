package com.soft2242.shop.service.impl;

import com.soft2242.shop.entity.UserOrder;
import com.soft2242.shop.entity.UserOrderGoods;
import com.soft2242.shop.mapper.UserOrderGoodsMapper;
import com.soft2242.shop.service.UserOrderGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soft2242.shop.vo.UserOrderVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class UserOrderGoodsServiceImpl extends ServiceImpl<UserOrderGoodsMapper, UserOrderGoods> implements UserOrderGoodsService {
    @Override
    public void batchUserOrderGoods(List<UserOrderGoods> list) {
        saveBatch(list);
    }
}
