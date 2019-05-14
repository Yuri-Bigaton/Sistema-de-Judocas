/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

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
public class EntidadePanelTest {
    
    public EntidadePanelTest() {
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
     * Test of getEnderecoPanel method, of class EntidadePanel.
     */
    @Test
    public void testGetEnderecoPanel() {
        System.out.println("getEnderecoPanel");
        EntidadePanel instance = new EntidadePanel();
        EnderecoPanel expResult = null;
        EnderecoPanel result = instance.getEnderecoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class EntidadePanel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        EntidadePanel instance = new EntidadePanel();
        JTextField expResult = null;
        JTextField result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCnpj method, of class EntidadePanel.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        EntidadePanel instance = new EntidadePanel();
        JTextField expResult = null;
        JTextField result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone1 method, of class EntidadePanel.
     */
    @Test
    public void testGetTelefone1() {
        System.out.println("getTelefone1");
        EntidadePanel instance = new EntidadePanel();
        JTextField expResult = null;
        JTextField result = instance.getTelefone1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone2 method, of class EntidadePanel.
     */
    @Test
    public void testGetTelefone2() {
        System.out.println("getTelefone2");
        EntidadePanel instance = new EntidadePanel();
        JTextField expResult = null;
        JTextField result = instance.getTelefone2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
