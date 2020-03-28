package com.supply.portal.Service;

import com.supply.portal.model.Item;

import java.util.List;

/**
 * Created by saef rahal on 3/27/2020.
 */
public interface ItemService {
    public List<Item> findByCategory(long id);

    public Item findById(long id);
}
