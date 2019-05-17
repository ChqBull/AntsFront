package com.jk.mapper;

import com.jk.bean.Areas;
import com.jk.bean.Cities;
import com.jk.bean.OrderBean;
import com.jk.bean.Provinces;

import java.util.List;

public interface FrontdeskMapper {
    Integer count();

    List<OrderBean> list(Integer page, Integer limit);

    List<Provinces> findProvinces();

    List<Cities> findCity(int provinceid);

    List<Areas> findArea(int cityid);
}
