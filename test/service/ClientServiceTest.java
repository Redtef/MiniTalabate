/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Boss
 */
public class ClientServiceTest {
    
    public ClientServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of creer method, of class ClientService.
     */
    @Test
    public void testCreer() {
        System.out.println("creer");
        String login = "test";
        String nom = "test";
        String prenom = "test";
        ClientService instance = new ClientService();
        int expResult = 1;
        int result = instance.creer(login, nom, prenom);
        assertEquals(expResult, result);
    }
    
}
