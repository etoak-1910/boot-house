package com.etoak.mapper;

import com.etoak.bean.House;
import com.etoak.bean.HouseVo;

import java.util.List;

public interface HouseMapper {
    /**
     * 添加房源信息
     * @param house
     * @return
     */
    int addHouse(House house);

    List<HouseVo> queryList(HouseVo houseVo);

    int updateHouse(House house);
}
