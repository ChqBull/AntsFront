package com.jk.service;

import com.jk.bean.Areas;
import com.jk.bean.Cities;
import com.jk.bean.Provinces;

import java.util.HashMap;
import java.util.List;

public interface FrontdeskService {
    HashMap<String,Object> lineSearch(Integer page, Integer limit);

    List<Provinces> findProvinces();

    List<Cities> findCity(int provinceid);

    List<Areas> findArea(int cityid);
}
