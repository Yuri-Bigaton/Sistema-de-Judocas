/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JTextField;
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
public class BuscaCamposPanelTest {
    
    public BuscaCamposPanelTest() {
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
     * Test of getRegistroFpij method, of class BuscaCamposPanel.
     */
    @Test
    public void testGetRegistroFpij() {
        System.out.println("getRegistroFpij");
        BuscaCamposPanel instance = new BuscaCamposPanel();
        JTextField expResult = null;
        JTextField result = instance.getRegistroFpij();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class BuscaCamposPanel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        BuscaCamposPanel instance = new BuscaCamposPanel();
        JTextField expResult = null;
        JTextField result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
