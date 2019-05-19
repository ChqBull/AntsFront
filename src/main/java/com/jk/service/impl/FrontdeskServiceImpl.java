package com.jk.service.impl;

import com.jk.bean.Areas;
import com.jk.bean.Cities;
import com.jk.bean.OrderBean;
import com.jk.bean.Provinces;
import com.jk.mapper.FrontdeskMapper;
import com.jk.service.FrontdeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class FrontdeskServiceImpl implements FrontdeskService {
    @Autowired
    FrontdeskMapper frontdeskMapper;


    @Override
    public HashMap<String, Object> lineSearch(Integer page, Integer limit) {
        Integer count =frontdeskMapper.count();
        List<OrderBean> orderBeans = frontdeskMapper.list(page,limit);
        HashMap<String,Object> map= new HashMap<>();
        map.put("count",count);
        map.put("data",orderBeans);
        map.put("code",0);
        return map;
    }

    @Override
    public List<Provinces> findProvinces() {
        List<Provinces> list = frontdeskMapper.findProvinces();
        return list;
    }

    @Override
    public List<Cities> findCity(int provinceid) {
        System.out.println();
        return frontdeskMapper.findCity(provinceid);
    }

    @Override
    public List<Areas> findArea(int cityid) {
        System.out.println();
        return frontdeskMapper.findArea(cityid);
    }

    @Override
    public OrderBean editLine(Integer id) {
        OrderBean orderBean= frontdeskMapper.editLine(id);
        return orderBean;
    }

    @Override
    public List listData() {
        List list =  frontdeskMapper.listData();
        return list;
    }
}
