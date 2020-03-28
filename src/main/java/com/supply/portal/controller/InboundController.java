package com.supply.portal.controller;

import com.google.gson.Gson;
import com.supply.portal.Repository.*;
import com.supply.portal.Service.ItemService;
import com.supply.portal.Service.ReportService;
import com.supply.portal.model.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.server.PathParam;
import java.util.List;

/**
 * Created by saef rahal on 3/26/2020.
 */
@Controller
public class InboundController {

    @Autowired
    InboundRepository inboundRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    ItemRepository itemRepository;

    @RequestMapping( value = "/inbound", method = RequestMethod.GET)
    public String getInbound(ModelMap modelMap){
        List<Category> categories = categoryRepository.findAll();
        List<Item> items = itemRepository.findAll();
        Inbound inbound = new Inbound();
        modelMap.addAttribute("inbound", inbound);
        modelMap.addAttribute("categories", categories);
        modelMap.addAttribute("items", items);
        return "inbound";
    }
    /*
    For Cascade Drop Down Consumed by JavaScript Method in the Inbound.jsp
    @ResponseBody
    @RequestMapping( value = "/itemByCategory", method = RequestMethod.POST)
    public List<Item> getItemByCategory(@RequestParam("id") long id){
        List<Item> items = itemRepository.findByCategory(id);
        return items;
    }
    */

    @RequestMapping( value = "/inbound", method = RequestMethod.POST)
    public String postInbound(ModelMap modelMap, @ModelAttribute Inbound inbound) {
        inboundRepository.save(inbound);
        return "index";
    }

}
