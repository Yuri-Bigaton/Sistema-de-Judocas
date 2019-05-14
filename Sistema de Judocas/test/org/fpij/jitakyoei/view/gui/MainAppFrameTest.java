/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.view.gui;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;
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
public class MainAppFrameTest {
    
    public MainAppFrameTest() {
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
     * Test of getMainPanel method, of class MainAppFrame.
     */
    @Test
    public void testGetMainPanel() {
        System.out.println("getMainPanel");
        MainAppFrame instance = new MainAppFrame();
        JPanel expResult = null;
        JPanel result = instance.getMainPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTabbedPane method, of class MainAppFrame.
     */
    @Test
    public void testGetTabbedPane() {
        System.out.println("getTabbedPane");
        MainAppFrame instance = new MainAppFrame();
        JTabbedPane expResult = null;
        JTabbedPane result = instance.getTabbedPane();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
