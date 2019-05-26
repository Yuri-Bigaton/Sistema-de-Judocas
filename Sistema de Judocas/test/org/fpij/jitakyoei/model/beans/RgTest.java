/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31756123
 */
public class RgTest {
    
    public RgTest() {
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

    @Test
    public void RgIgualTest() {
        Rg r = new Rg("50.127.233-1", "SP");
        assertTrue(r.getNumero() == "50.127.233-1");
        System.out.println(r.getNumero());
        
    }

    
    @Test
    public void OrgaoExpedidorIgualTest() {
        Rg g = new Rg("50.127.233-1", "SP");
        assertTrue(g.getOrgaoExpedidor() == "SP");
        System.out.println(g.getOrgaoExpedidor());
    }
    
}
