package com.soft2242.shop.service;

import com.soft2242.shop.entity.UserShippingAddress;
import com.baomidou.mybatisplus.extension.service.IService;
import com.soft2242.shop.vo.AddressVO;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sunyu
 * @since 2023-11-08
 */
public interface UserShippingAddressService extends IService<UserShippingAddress> {

    /**
     * 添加收货地址
     *
     * @param addressVO
     * @return
     */
    Integer saveShippingAddress(AddressVO addressVO);

    /**
     * 修改收货地址
     *
     * @param addressVO
     * @return
     */
    Integer editShippingAddress(AddressVO addressVO);

    /**
     * 收货地址列表
     *
     * @param userId
     * @return
     */
    List<AddressVO> getList(Integer userId);

    /**
     *收货地址详情
     *
     * @param id
     * @return
     */
    AddressVO getAddressInfo(Integer id);

    /**
     * 删除收货地址
     *
     * @param id
     */
    void removeShippingAddress(Integer id);

}
