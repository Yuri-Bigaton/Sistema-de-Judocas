/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
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
public class ProfessorPanelTest {
    
    public ProfessorPanelTest() {
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
     * Test of getFiliadoPanel method, of class ProfessorPanel.
     */
    @Test
    public void testGetFiliadoPanel() {
        System.out.println("getFiliadoPanel");
        ProfessorPanel instance = new ProfessorPanel();
        FiliadoPanel expResult = null;
        FiliadoPanel result = instance.getFiliadoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidadesTable method, of class ProfessorPanel.
     */
    @Test
    public void testGetEntidadesTable() {
        System.out.println("getEntidadesTable");
        ProfessorPanel instance = new ProfessorPanel();
        JTable expResult = null;
        JTable result = instance.getEntidadesTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdicionarEntidade method, of class ProfessorPanel.
     */
    @Test
    public void testGetAdicionarEntidade() {
        System.out.println("getAdicionarEntidade");
        ProfessorPanel instance = new ProfessorPanel();
        JButton expResult = null;
        JButton result = instance.getAdicionarEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class ProfessorPanel.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        ProfessorPanel instance = new ProfessorPanel();
        JComboBox expResult = null;
        JComboBox result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
