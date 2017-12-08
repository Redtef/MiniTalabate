/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author delll
 */

@Entity
public class Food implements Serializable {

    @Id
    private Long id;
    @ManyToOne
    private Menu menu;
    private String nom;
    private float prix;
    @ManyToOne
    private Categorie categorie;
    @OneToMany
    private List<Ingredient> ingredients;
    @OneToMany(mappedBy = "food")
    private List<Supplement> supplements;
//    @OneToMany
//    private List<ChoixSupplement> choixSupplements;
   
    
    

    

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public Food() {
    }

    public String getId() {
        return nom;
    }

    public void setId(String id) {
        this.nom = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nom != null ? nom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the nom fields are not set
        if (!(object instanceof Food)) {
            return false;
        }
        Food other = (Food) object;
        if ((this.nom == null && other.nom != null) || (this.nom != null && !this.nom.equals(other.nom))) {
            return false;
        }
        return true;
    }

       
    
}
