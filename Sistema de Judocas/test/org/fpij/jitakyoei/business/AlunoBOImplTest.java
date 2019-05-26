/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.business;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Aluno;
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
public class AlunoBOImplTest {
    
    public AlunoBOImplTest() {
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
     * Test of createAluno method, of class AlunoBOImpl.
     */
    @Test
    public void testCriandoAluno() throws Exception {
        
    }

    /**
     * Test of updateAluno method, of class AlunoBOImpl.
     */
    @Test
    public void testUpdateAluno() throws Exception {
        System.out.println("updateAluno");
        Aluno aluno = null;
        AlunoBOImpl instance = null;
        instance.updateAluno(aluno);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of searchAluno method, of class AlunoBOImpl.
     */
    @Test
    public void testSearchAluno() throws Exception {
        System.out.println("searchAluno");
        Aluno aluno = null;
        AlunoBOImpl instance = null;
        List<Aluno> expResult = null;
        List<Aluno> result = instance.searchAluno(aluno);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listAll method, of class AlunoBOImpl.
     */
    @Test
    public void testListAll() throws Exception {
        System.out.println("listAll");
        AlunoBOImpl instance = null;
        List<Aluno> expResult = null;
        List<Aluno> result = instance.listAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
