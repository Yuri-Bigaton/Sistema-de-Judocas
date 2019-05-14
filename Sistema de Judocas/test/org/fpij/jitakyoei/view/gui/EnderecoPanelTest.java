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
public class EnderecoPanelTest {
    
    public EnderecoPanelTest() {
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
     * Test of getRua method, of class EnderecoPanel.
     */
    @Test
    public void testGetRua() {
        System.out.println("getRua");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getRua();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class EnderecoPanel.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class EnderecoPanel.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class EnderecoPanel.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class EnderecoPanel.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class EnderecoPanel.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        EnderecoPanel instance = new EnderecoPanel();
        JTextField expResult = null;
        JTextField result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
