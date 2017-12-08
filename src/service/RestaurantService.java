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
import java.math.BigDecimal;
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
    
    public void creerResto(String nom,LocalTime HOverture,LocalTime HFermeture,Boolean livraison,BigDecimal PrixL ,BigDecimal commission
                           ,Owner owner,Adresse adresse,Categorie specialite,Menu menu)
    {
     Restaurant restaurant = new Restaurant(nom, HOverture, HFermeture, livraison, PrixL, commission, adresse
                                         , owner, menu, specialite);
        create(restaurant);
        
    }
    
    public int modifierResto(String nom,LocalTime HOverture,LocalTime HFermeture,Boolean livraison,Long PrixL ,Float commission
                           ,Categorie specialite){
         String query = "UPDATE Restaurant r SET ";
            if (HOverture != null) {
            query += " r.heureOverture = '" + HOverture + "'";
        }
               if (HFermeture != null) {
            query += " r.heureFermeture = '" + HFermeture + "'";
        }
                   if (livraison != null) {
            query += " r.livraison = '" + livraison + "'";
        }
                    if (PrixL != null) {
            query += " r.prixLivraison = '" + PrixL + "'";
        }
                       if (commission != null) {
            query += " r.commission = '" + commission + "'";
        }
                         if (specialite != null) {
            query += " r.specialite = '" + specialite + "'";
        }
         query+= "where nom ='"+ nom +"'";
         return getEntityManager().createQuery(query).executeUpdate();
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
