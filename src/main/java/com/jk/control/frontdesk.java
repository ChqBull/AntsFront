package com.jk.control;


import com.jk.bean.Areas;
import com.jk.bean.Cities;
import com.jk.bean.Provinces;
import com.jk.service.FrontdeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class frontdesk {
    @Autowired
    private FrontdeskService frontdeskService;

    @RequestMapping("dd")
    public String dd(){
        return "ant";
    }

    @RequestMapping("ee")
    public String ee(){
        return "linemanager";
    }

    @RequestMapping("ff")
    public String ff(){
        return "editLine";
    }
    @RequestMapping("gg")
    public String gg(){
        return "addedService";
    }

    @RequestMapping("lineSearch")
    @ResponseBody
    public HashMap<String,Object> lineSearch(Integer page,Integer limit){
        return frontdeskService.lineSearch(page,limit);


    }
    @RequestMapping("findProvinces")
    @ResponseBody
    public List<Provinces> findProvinces(){
        return frontdeskService.findProvinces();
    }

    @RequestMapping("findCity")
    @ResponseBody
    public List<Cities> findCity(int provinceid){
        return frontdeskService.findCity(provinceid);
    }

    @RequestMapping("findArea")
    @ResponseBody
    public List<Areas> findArea(int cityid){
        return frontdeskService.findArea(cityid);
    }


}
