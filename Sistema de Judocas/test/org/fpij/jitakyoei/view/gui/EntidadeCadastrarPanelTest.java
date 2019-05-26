/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
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
public class EntidadeCadastrarPanelTest {
    
    public EntidadeCadastrarPanelTest() {
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
     * Test of getEntidadePanel method, of class EntidadeCadastrarPanel.
     */
    @Test
    public void testGetEntidadePanel() {
        System.out.println("getEntidadePanel");
        EntidadeCadastrarPanel instance = new EntidadeCadastrarPanel();
        EntidadePanel expResult = null;
        EntidadePanel result = instance.getEntidadePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadastrarEntidade method, of class EntidadeCadastrarPanel.
     */
    @Test
    public void testGetCadastrarEntidade() {
        System.out.println("getCadastrarEntidade");
        EntidadeCadastrarPanel instance = new EntidadeCadastrarPanel();
        JButton expResult = null;
        JButton result = instance.getCadastrarEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelar method, of class EntidadeCadastrarPanel.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        EntidadeCadastrarPanel instance = new EntidadeCadastrarPanel();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
