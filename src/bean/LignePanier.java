/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Boss
 */
@Entity
public class LignePanier implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private Food food;
    private int qte;
    @ManyToOne
    private Panier cart;
    @OneToOne
    private ChoixSupplement choixSupplement;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Panier getCart() {
        return cart;
    }

    public void setCart(Panier cart) {
        this.cart = cart;
    }

    public LignePanier(Long id) {
        this.id = id;
    }

    public LignePanier(Food food, int qte, Panier cart, ChoixSupplement choixSupplement) {
        this.food = food;
        this.qte = qte;
        this.cart = cart;
        this.choixSupplement = choixSupplement;
    }

    public LignePanier() {
    }

    public ChoixSupplement getChoixSupplement() {
        return choixSupplement;
    }

    public void setChoixSupplement(ChoixSupplement choixSupplement) {
        this.choixSupplement = choixSupplement;
    }

    public LignePanier(Food food, int qte) {
        this.food = food;
        this.qte = qte;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LignePanier)) {
            return false;
        }
        LignePanier other = (LignePanier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "LignePanier{" + "id=" + id + ", food=" + food + ", qte=" + qte + '}';
    }

    
    
   

}
