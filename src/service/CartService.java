/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Cart;

/**
 *
 * @author Boss
 */
public class CartService extends AbstractFacade<Cart> {

    public CartService() {
        super(Cart.class);
    }
    
}
