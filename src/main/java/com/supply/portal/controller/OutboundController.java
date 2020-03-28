package com.supply.portal.controller;

import com.supply.portal.Repository.*;
import com.supply.portal.Service.ReportService;
import com.supply.portal.model.*;
import org.apache.jasper.tagplugins.jstl.core.Out;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Controller
public class OutboundController {

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

    @RequestMapping( value = "/outbound", method = RequestMethod.GET)
    public String getOutbound(ModelMap modelMap) {

        Outbound outbound = new Outbound();
        List<State> states = stateRepository.findAll();
        List<Hospital> hospitals = hospitalRepository.findAll();
        List<Category> categories = categoryRepository.findAll();
        List<Item> items = itemRepository.findAll();
        modelMap.addAttribute("states", states);
        modelMap.addAttribute("hospitals", hospitals);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("items", items);
        modelMap.addAttribute("outbound", outbound);
        return "outbound";
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

    @RequestMapping( value = "/outbound", method = RequestMethod.POST)
    public String postInbound(ModelMap modelMap, @ModelAttribute Outbound outbound) {
        outboundRepository.save(outbound);
        return "index";
    }

}
