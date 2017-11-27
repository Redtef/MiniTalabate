/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Food;

/**
 *
 * @author Boss
 */
public class FoodService extends AbstractFacade<Food>{

    public FoodService() {
        super(Food.class);
    }
    
}
