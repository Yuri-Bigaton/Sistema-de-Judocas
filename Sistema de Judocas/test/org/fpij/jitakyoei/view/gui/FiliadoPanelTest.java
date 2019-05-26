/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
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
public class FiliadoPanelTest {
    
    public FiliadoPanelTest() {
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
     * Test of getEnderecoPanel method, of class FiliadoPanel.
     */
    @Test
    public void testGetEnderecoPanel() {
        System.out.println("getEnderecoPanel");
        FiliadoPanel instance = new FiliadoPanel();
        EnderecoPanel expResult = null;
        EnderecoPanel result = instance.getEnderecoPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFaixasTable method, of class FiliadoPanel.
     */
    @Test
    public void testGetFaixasTable() {
        System.out.println("getFaixasTable");
        FiliadoPanel instance = new FiliadoPanel();
        JTable expResult = null;
        JTable result = instance.getFaixasTable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataEntregaDataChooser method, of class FiliadoPanel.
     */
    @Test
    public void testGetDataEntregaDataChooser() {
        System.out.println("getDataEntregaDataChooser");
        FiliadoPanel instance = new FiliadoPanel();
        JDateChooser expResult = null;
        JDateChooser result = instance.getDataEntregaDataChooser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimentoDataChooser method, of class FiliadoPanel.
     */
    @Test
    public void testGetDataNascimentoDataChooser() {
        System.out.println("getDataNascimentoDataChooser");
        FiliadoPanel instance = new FiliadoPanel();
        JDateChooser expResult = null;
        JDateChooser result = instance.getDataNascimentoDataChooser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class FiliadoPanel.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistroCbj method, of class FiliadoPanel.
     */
    @Test
    public void testGetRegistroCbj() {
        System.out.println("getRegistroCbj");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getRegistroCbj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class FiliadoPanel.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class FiliadoPanel.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class FiliadoPanel.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrgaoExpedidor method, of class FiliadoPanel.
     */
    @Test
    public void testGetOrgaoExpedidor() {
        System.out.println("getOrgaoExpedidor");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getOrgaoExpedidor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone1 method, of class FiliadoPanel.
     */
    @Test
    public void testGetTelefone1() {
        System.out.println("getTelefone1");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getTelefone1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone2 method, of class FiliadoPanel.
     */
    @Test
    public void testGetTelefone2() {
        System.out.println("getTelefone2");
        FiliadoPanel instance = new FiliadoPanel();
        JTextField expResult = null;
        JTextField result = instance.getTelefone2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCorFaixa method, of class FiliadoPanel.
     */
    @Test
    public void testGetCorFaixa() {
        System.out.println("getCorFaixa");
        FiliadoPanel instance = new FiliadoPanel();
        JComboBox expResult = null;
        JComboBox result = instance.getCorFaixa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdicionarFaixa method, of class FiliadoPanel.
     */
    @Test
    public void testGetAdicionarFaixa() {
        System.out.println("getAdicionarFaixa");
        FiliadoPanel instance = new FiliadoPanel();
        JButton expResult = null;
        JButton result = instance.getAdicionarFaixa();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacoes method, of class FiliadoPanel.
     */
    @Test
    public void testGetObservacoes() {
        System.out.println("getObservacoes");
        FiliadoPanel instance = new FiliadoPanel();
        JTextArea expResult = null;
        JTextArea result = instance.getObservacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
