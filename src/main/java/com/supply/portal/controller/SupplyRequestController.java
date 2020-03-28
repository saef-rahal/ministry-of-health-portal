package com.supply.portal.controller;

import com.supply.portal.Repository.*;
import com.supply.portal.Service.ReportService;
import com.supply.portal.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
@Controller
public class SupplyRequestController {

    @Autowired
    OutboundRepository outboundRepository;

    @Autowired
    StateRepository stateRepository;

    @Autowired
    HospitalRepository hospitalRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    ReportRepository reportRepository;


    JdbcTemplate jdbcTemplate;

    @RequestMapping( value = "/supply-request", method = RequestMethod.GET)
    public String getSupplyRequest(ModelMap modelMap) {

        Report report = new Report();
        List<State> states = stateRepository.findAll();
        List<Hospital> hospitals = hospitalRepository.findAll();
        List<Category> categories = categoryRepository.findAll();
        List<Item> items = itemRepository.findAll();
        modelMap.addAttribute("states", states);
        modelMap.addAttribute("hospitals", hospitals);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("items", items);
        modelMap.addAttribute("report", report);
        return "supply-request";
    }

    /*

    //For Cascade Drop Down Consumed by JavaScript Method in the Inbound.jsp
    @ResponseBody
    @RequestMapping( value = "/hospitalByState", method = RequestMethod.POST)
    public List<Hospital> getHospitalByState(@RequestParam("id") long id){
        List<Hospital> hospitals = hospitalRepository.findByState(id);
        return hospitals;
    }


    //For Cascade Drop Down Consumed by JavaScript Method in the Inbound.jsp
    @ResponseBody
    @RequestMapping( value = "/itemByCategory", method = RequestMethod.POST)
    public List<Item> getItemByCategory(@RequestParam("id") long id){
        List<Item> items = itemRepository.findByCategory(id);
        return items;
    }

    */

    @RequestMapping( value = "/supply-request", method = RequestMethod.POST)
    public String postSupplyRequest(ModelMap modelMap, @ModelAttribute Report report) {
        reportRepository.save(report);
        return "index";
    }

}
