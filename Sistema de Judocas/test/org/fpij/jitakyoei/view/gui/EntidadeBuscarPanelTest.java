/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
import javax.swing.JTable;
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
public class EntidadeBuscarPanelTest {
    
    public EntidadeBuscarPanelTest() {
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
     * Test of getTblEntidades method, of class EntidadeBuscarPanel.
     */
    @Test
    public void testGetTblEntidades() {
        System.out.println("getTblEntidades");
        EntidadeBuscarPanel instance = new EntidadeBuscarPanel();
        JTable expResult = null;
        JTable result = instance.getTblEntidades();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class EntidadeBuscarPanel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        EntidadeBuscarPanel instance = new EntidadeBuscarPanel();
        JTextField expResult = null;
        JTextField result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBtnBuscar method, of class EntidadeBuscarPanel.
     */
    @Test
    public void testGetBtnBuscar() {
        System.out.println("getBtnBuscar");
        EntidadeBuscarPanel instance = new EntidadeBuscarPanel();
        JButton expResult = null;
        JButton result = instance.getBtnBuscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
