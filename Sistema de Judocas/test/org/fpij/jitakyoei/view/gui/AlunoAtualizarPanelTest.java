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
public class AlunoAtualizarPanelTest {
    
    public AlunoAtualizarPanelTest() {
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
     * Test of getAlunoPanel method, of class AlunoAtualizarPanel.
     */
    @Test
    public void testGetAlunoPanel() {
        System.out.println("getAlunoPanel");
        AlunoAtualizarPanel instance = new AlunoAtualizarPanel();
        AlunoPanel expResult = null;
        AlunoPanel result = instance.getAlunoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAtualizar method, of class AlunoAtualizarPanel.
     */
    @Test
    public void testGetAtualizar() {
        System.out.println("getAtualizar");
        AlunoAtualizarPanel instance = new AlunoAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getAtualizar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCancelar method, of class AlunoAtualizarPanel.
     */
    @Test
    public void testGetCancelar() {
        System.out.println("getCancelar");
        AlunoAtualizarPanel instance = new AlunoAtualizarPanel();
        JButton expResult = null;
        JButton result = instance.getCancelar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
