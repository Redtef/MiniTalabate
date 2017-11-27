/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Restaurant;

/**
 *
 * @author Boss
 */
public class RestaurantService extends AbstractFacade<Restaurant>{
    
    public RestaurantService() {
        super(Restaurant.class);
    }
    
}
