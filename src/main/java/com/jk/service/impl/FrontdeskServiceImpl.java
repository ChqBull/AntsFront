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
        List<OrderBean> list = frontdeskMapper.list(page,limit);
        HashMap<String,Object> map= new HashMap<>();
        map.put("count",count);
        map.put("data",list);
        map.put("code",0);
        return map;
    }

    @Override
    public List<Provinces> findProvinces() {

        return frontdeskMapper.findProvinces();
    }

    @Override
    public List<Cities> findCity(int provinceid) {
        return frontdeskMapper.findCity(provinceid);
    }

    @Override
    public List<Areas> findArea(int cityid) {
        return frontdeskMapper.findArea(cityid);
    }
}
