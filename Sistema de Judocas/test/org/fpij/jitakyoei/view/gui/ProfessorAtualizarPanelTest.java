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
public class ProfessorAtualizarPanelTest {
    
    public ProfessorAtualizarPanelTest() {
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
     * Test of getProfessorPanel method, of class ProfessorAtualizarPanel.
     */
    @Test
    public void testGetProfessorPanel() {
        System.out.println("getProfessorPanel");
        ProfessorAtualizarPanel instance = new ProfessorAtualizarPanel();
        ProfessorPanel expResult = null;
        ProfessorPanel result = instance.getProfessorPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtualizar method, of class ProfessorAtualizarPanel.
     */
    @Test
    public void testGetAtualizar() {
        System.out.println("getAtualizar");
        ProfessorAtualizarPanel instance = new ProfessorAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getAtualizar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelar method, of class ProfessorAtualizarPanel.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        ProfessorAtualizarPanel instance = new ProfessorAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
