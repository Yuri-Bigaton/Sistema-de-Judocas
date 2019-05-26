/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
import javax.swing.JTable;
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
public class ProfessorBuscarPanelTest {
    
    public ProfessorBuscarPanelTest() {
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
     * Test of getBuscaCamposPanel method, of class ProfessorBuscarPanel.
     */
    @Test
    public void testGetBuscaCamposPanel() {
        System.out.println("getBuscaCamposPanel");
        ProfessorBuscarPanel instance = new ProfessorBuscarPanel();
        BuscaCamposPanel expResult = null;
        BuscaCamposPanel result = instance.getBuscaCamposPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessores method, of class ProfessorBuscarPanel.
     */
    @Test
    public void testGetProfessores() {
        System.out.println("getProfessores");
        ProfessorBuscarPanel instance = new ProfessorBuscarPanel();
        JTable expResult = null;
        JTable result = instance.getProfessores();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscar method, of class ProfessorBuscarPanel.
     */
    @Test
    public void testGetBuscar() {
        System.out.println("getBuscar");
        ProfessorBuscarPanel instance = new ProfessorBuscarPanel();
        JButton expResult = null;
        JButton result = instance.getBuscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
