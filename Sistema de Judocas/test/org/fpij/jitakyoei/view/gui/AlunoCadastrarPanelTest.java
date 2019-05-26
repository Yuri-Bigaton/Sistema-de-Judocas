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
public class AlunoCadastrarPanelTest {
    
    public AlunoCadastrarPanelTest() {
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
     * Test of getAlunoPanel method, of class AlunoCadastrarPanel.
     */
    @Test
    public void testGetAlunoPanel() {
        System.out.println("getAlunoPanel");
        AlunoCadastrarPanel instance = new AlunoCadastrarPanel();
        AlunoPanel expResult = null;
        AlunoPanel result = instance.getAlunoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCadastrar method, of class AlunoCadastrarPanel.
     */
    @Test
    public void testGetCadastrar() {
        System.out.println("getCadastrar");
        AlunoCadastrarPanel instance = new AlunoCadastrarPanel();
        JButton expResult = null;
        JButton result = instance.getCadastrar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelar method, of class AlunoCadastrarPanel.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        AlunoCadastrarPanel instance = new AlunoCadastrarPanel();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
