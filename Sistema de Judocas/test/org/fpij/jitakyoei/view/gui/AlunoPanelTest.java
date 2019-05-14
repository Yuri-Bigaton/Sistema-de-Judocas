/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JComboBox;
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
public class AlunoPanelTest {
    
    public AlunoPanelTest() {
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
     * Test of getFiliadoPanel method, of class AlunoPanel.
     */
    @Test
    public void testGetFiliadoPanel() {
        System.out.println("getFiliadoPanel");
        AlunoPanel instance = new AlunoPanel();
        FiliadoPanel expResult = null;
        FiliadoPanel result = instance.getFiliadoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class AlunoPanel.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        AlunoPanel instance = new AlunoPanel();
        JComboBox expResult = null;
        JComboBox result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class AlunoPanel.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        AlunoPanel instance = new AlunoPanel();
        JComboBox expResult = null;
        JComboBox result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
