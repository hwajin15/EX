package com.JEONG.restaurant.application;

import com.JEONG.restaurant.domain.MenuItem;
import com.JEONG.restaurant.domain.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuItemService {

    private MenuItemRepository menuItemRepository;
    @Autowired
    public MenuItemService(MenuItemRepository menuItemRepository){
        this.menuItemRepository = menuItemRepository;
    }


    public void bulkUpdate(Long restaurantId, List<MenuItem> menuItems) {
        for (MenuItem menuItem : menuItems){
            menuItem.setRestaurantId(restaurantId); //레스토랑과 연결
            menuItemRepository.save(menuItem);
        }

    }
}
