package com.supply.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by saef rahal on 3/28/2020.
 */
@Controller
public class ReportController {

    @RequestMapping( value = "/index", method = RequestMethod.GET)
    public String getMasterReport(ModelMap modelMap) {
        return "index";
    }
}
