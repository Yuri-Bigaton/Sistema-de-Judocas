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
public class EntidadeAtualizarPanelTest {
    
    public EntidadeAtualizarPanelTest() {
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
     * Test of getEntidadePanel method, of class EntidadeAtualizarPanel.
     */
    @Test
    public void testGetEntidadePanel() {
        System.out.println("getEntidadePanel");
        EntidadeAtualizarPanel instance = new EntidadeAtualizarPanel();
        EntidadePanel expResult = null;
        EntidadePanel result = instance.getEntidadePanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtualizarEntidade method, of class EntidadeAtualizarPanel.
     */
    @Test
    public void testGetAtualizarEntidade() {
        System.out.println("getAtualizarEntidade");
        EntidadeAtualizarPanel instance = new EntidadeAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getAtualizarEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelar method, of class EntidadeAtualizarPanel.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        EntidadeAtualizarPanel instance = new EntidadeAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
