/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import org.fpij.jitakyoei.view.AlunoBuscarView;
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
public class AlunoBuscarPanelTest {
    
    public AlunoBuscarPanelTest() {
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
     * Test of registerView method, of class AlunoBuscarPanel.
     */
    @Test
    public void testRegisterView() {
        System.out.println("registerView");
        AlunoBuscarView alunoBuscarView = null;
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        instance.registerView(alunoBuscarView);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getView method, of class AlunoBuscarPanel.
     */
    @Test
    public void testGetView() {
        System.out.println("getView");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        AlunoBuscarView expResult = null;
        AlunoBuscarView result = instance.getView();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscaCamposPanel method, of class AlunoBuscarPanel.
     */
    @Test
    public void testGetBuscaCamposPanel() {
        System.out.println("getBuscaCamposPanel");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        BuscaCamposPanel expResult = null;
        BuscaCamposPanel result = instance.getBuscaCamposPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getScrollPane1 method, of class AlunoBuscarPanel.
     */
    @Test
    public void testGetScrollPane1() {
        System.out.println("getScrollPane1");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        JScrollPane expResult = null;
        JScrollPane result = instance.getScrollPane1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAlunoTable method, of class AlunoBuscarPanel.
     */
    @Test
    public void testGetAlunoTable() {
        System.out.println("getAlunoTable");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        JTable expResult = null;
        JTable result = instance.getAlunoTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of refresh method, of class AlunoBuscarPanel.
     */
    @Test
    public void testRefresh() {
        System.out.println("refresh");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        instance.refresh();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBuscar method, of class AlunoBuscarPanel.
     */
    @Test
    public void testGetBuscar() {
        System.out.println("getBuscar");
        AlunoBuscarPanel instance = new AlunoBuscarPanel();
        JButton expResult = null;
        JButton result = instance.getBuscar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
