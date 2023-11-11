package com.soft2242.shop.service.impl;

import com.soft2242.shop.entity.Goods;
import com.soft2242.shop.mapper.GoodsMapper;
import com.soft2242.shop.mapper.IndexRecommendMapper;
import com.soft2242.shop.mapper.IndexRecommendTabMapper;
import com.soft2242.shop.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
@Service
@AllArgsConstructor
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {
    private final IndexRecommendMapper indexRecommendMapper;
    private final IndexRecommendTabMapper indexRecommendTabMapper;

}
