/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Adresse;
import bean.Categorie;
import bean.Menu;
import bean.Owner;
import bean.Restaurant;
import java.time.LocalTime;
import java.util.List;

/**
 *
 * @author Boss
 */
public class RestaurantService extends AbstractFacade<Restaurant>{
    
    public RestaurantService() {
        super(Restaurant.class);
    }
    
    public void creerResto(String nom,LocalTime HOverture,LocalTime HFermeture,Boolean livraison,long PrixL ,float commission
                           ,Owner owner,Adresse adresse,Categorie specialite,Menu menu)
    {
     Restaurant restaurant = new Restaurant(nom, HOverture, HFermeture, livraison, PrixL, commission, adresse, owner, menu, specialite);
        create(restaurant);
        
    }
     public List<Restaurant> findByCriteria(Adresse adresse,Owner owner,Menu menu,Categorie specialite) {
        String query = "SELECT r FROM Restaurant r WHERE 1=1";
        if (adresse != null) {
            query += " AND r.adresse='" + adresse + "'";
        }
        if (owner != null) {
            query += " AND r.owner='" + owner + "'";
        }
        if (menu != null) {
            query += " AND r.menu ='" + menu +"'";
        }
        if (specialite != null) {
            query += " AND r.specialite ='" + specialite +"'";
        }
        return getEntityManager().createQuery(query).getResultList();

    }
}
