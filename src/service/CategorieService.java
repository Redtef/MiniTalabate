/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Categorie;

/**
 *
 * @author Boss
 */
public class CategorieService extends AbstractFacade<Categorie>{

    public CategorieService() {
        super(Categorie.class);
    }
    
    public int test(int a){
        return a+1 ;
       
    }
    
}
