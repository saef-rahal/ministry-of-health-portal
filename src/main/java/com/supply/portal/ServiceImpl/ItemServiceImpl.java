package com.supply.portal.ServiceImpl;

import com.supply.portal.Repository.ItemRepository;
import com.supply.portal.Service.ItemService;
import com.supply.portal.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public List<Item> findByCategory(long id) {
        return itemRepository.findByCategory(id);
    }

    @Override
    public Item findById(long id) {
        return itemRepository.findById(id);
    }
}
