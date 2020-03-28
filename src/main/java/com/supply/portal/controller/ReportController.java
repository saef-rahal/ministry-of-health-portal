package com.supply.portal.controller;

import com.supply.portal.Service.ReportService;
import com.supply.portal.model.MasterReport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by saef rahal on 3/28/2020.
 */
@Controller
public class ReportController {

    ReportService reportService;

    @RequestMapping( value = "/index", method = RequestMethod.GET)
    public String getMasterReport(Model model) {
        model.addAttribute("reports",reportService.getMasterReport());
        return "index";
    }
}
