/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Boss
 */
@Entity
public class Restaurant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String nom;
    private LocalTime heureOuverture;
    private LocalTime heureFermeture;
    private Boolean livraison;
    private long prixLivraison;
    private float commission;
    @OneToOne
    private Adresse adresse;
    @ManyToOne
    private Owner owner;
    @OneToOne
    private Menu menu; 
//    @OneToMany(mappedBy = "resto")
//    private List<Supplement> ingredients;
    @OneToOne
    private Categorie specialite;

    public Restaurant() {
    }

    public Restaurant(String nom, LocalTime heureOuverture, LocalTime heureFermeture, Boolean livraison, long prixLivraison, float commission, Adresse adresse, Owner owner, Menu menu, Categorie specialite) {
        this.nom = nom;
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
        this.livraison = livraison;
        this.prixLivraison = prixLivraison;
        this.commission = commission;
        this.adresse = adresse;
        this.owner = owner;
        this.menu = menu;
        this.specialite = specialite;
    }

    public Restaurant(LocalTime heureOuverture, LocalTime heureFermeture, Boolean livraison, long prixLivraison, float commission) {
        this.heureOuverture = heureOuverture;
        this.heureFermeture = heureFermeture;
        this.livraison = livraison;
        this.prixLivraison = prixLivraison;
        this.commission = commission;
    }

    public LocalTime getHeureOuverture() {
        return heureOuverture;
    }

    public void setHeureOuverture(LocalTime heureOuverture) {
        this.heureOuverture = heureOuverture;
    }

    public LocalTime getHeureFermeture() {
        return heureFermeture;
    }

    public void setHeureFermeture(LocalTime heureFermeture) {
        this.heureFermeture = heureFermeture;
    }

    public Boolean getLivraison() {
        return livraison;
    }

    public void setLivraison(Boolean livraison) {
        this.livraison = livraison;
    }

    public long getPrixLivraison() {
        return prixLivraison;
    }

    public void setPrixLivraison(long prixLivraison) {
        this.prixLivraison = prixLivraison;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nom != null ? nom.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the nom fields are not set
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.nom == null && other.nom != null) || (this.nom != null && !this.nom.equals(other.nom))) {
            return false;
        }
        return true;
    }


}
