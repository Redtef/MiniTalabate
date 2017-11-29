/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Client;

/**
 *
 * @author Boss
 */
public class ClientService extends AbstractFacade<Client>{

    public ClientService() {
        super(Client.class);
    }
    
    public int creer(String login , String nom , String prenom ){
        Client client = new Client(login, nom, prenom) ;
//        client.setLogin(login);
//        client.setNom(nom);
//        client.setPrenom(prenom);
        create(client);
        return 1;
    }
    
}
