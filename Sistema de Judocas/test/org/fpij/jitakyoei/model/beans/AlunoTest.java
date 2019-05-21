/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

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
public class AlunoTest {
    
    public AlunoTest() {
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
     * Test of getFiliado method, of class Aluno.
     */
    @Test
    public void testGetFiliado() {
        System.out.println("getFiliado");
        Aluno instance = new Aluno();
        Filiado expResult = null;
        Filiado result = instance.getFiliado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiliado method, of class Aluno.
     */
    @Test
    public void testSetFiliado() {
        System.out.println("setFiliado");
        Filiado filiado = null;
        Aluno instance = new Aluno();
        instance.setFiliado(filiado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntidade method, of class Aluno.
     */
    @Test
    public void testGetEntidade() {
        System.out.println("getEntidade");
        Aluno instance = new Aluno();
        Entidade expResult = null;
        Entidade result = instance.getEntidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEntidade method, of class Aluno.
     */
    @Test
    public void testSetEntidade() {
        System.out.println("setEntidade");
        Entidade entidade = null;
        Aluno instance = new Aluno();
        instance.setEntidade(entidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProfessor method, of class Aluno.
     */
    @Test
    public void testGetProfessor() {
        System.out.println("getProfessor");
        Aluno instance = new Aluno();
        Professor expResult = null;
        Professor result = instance.getProfessor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProfessor method, of class Aluno.
     */
    @Test
    public void testSetProfessor() {
        System.out.println("setProfessor");
        Professor professor = null;
        Aluno instance = new Aluno();
        instance.setProfessor(professor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Aluno.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Aluno instance = new Aluno();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Aluno.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Aluno instance = new Aluno();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Aluno.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Aluno instance = new Aluno();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyProperties method, of class Aluno.
     */
    @Test
    public void testCopyProperties() {
        System.out.println("copyProperties");
        Aluno other = null;
        Aluno instance = new Aluno();
        instance.copyProperties(other);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
