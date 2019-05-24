/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31718671
 */
public class FiliadoTest {
    
    public FiliadoTest() {
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
     * Test of toString method, of class Filiado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Filiado.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Filiado instance = new Filiado();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Filiado.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Filiado instance = new Filiado();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Filiado.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Filiado instance = new Filiado();
        Long expResult = null;
        Long result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Filiado.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Long id = null;
        Filiado instance = new Filiado();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Filiado.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Filiado.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Filiado instance = new Filiado();
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRegistroCbj method, of class Filiado.
     */
    @Test
    public void testGetRegistroCbj() {
        System.out.println("getRegistroCbj");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getRegistroCbj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRegistroCbj method, of class Filiado.
     */
    @Test
    public void testSetRegistroCbj() {
        System.out.println("setRegistroCbj");
        String registroCbj = "";
        Filiado instance = new Filiado();
        instance.setRegistroCbj(registroCbj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataNascimento method, of class Filiado.
     */
    @Test
    public void testGetDataNascimento() {
        System.out.println("getDataNascimento");
        Filiado instance = new Filiado();
        Date expResult = null;
        Date result = instance.getDataNascimento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataNascimento method, of class Filiado.
     */
    @Test
    public void testSetDataNascimento() {
        System.out.println("setDataNascimento");
        Date dataNascimento = null;
        Filiado instance = new Filiado();
        instance.setDataNascimento(dataNascimento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDataCadastro method, of class Filiado.
     */
    @Test
    public void testGetDataCadastro() {
        System.out.println("getDataCadastro");
        Filiado instance = new Filiado();
        Date expResult = null;
        Date result = instance.getDataCadastro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDataCadastro method, of class Filiado.
     */
    @Test
    public void testSetDataCadastro() {
        System.out.println("setDataCadastro");
        Date dataCadastro = null;
        Filiado instance = new Filiado();
        instance.setDataCadastro(dataCadastro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEndereco method, of class Filiado.
     */
    @Test
    public void testGetEndereco() {
        System.out.println("getEndereco");
        Filiado instance = new Filiado();
        Endereco expResult = null;
        Endereco result = instance.getEndereco();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEndereco method, of class Filiado.
     */
    @Test
    public void testSetEndereco() {
        System.out.println("setEndereco");
        Endereco endereco = null;
        Filiado instance = new Filiado();
        instance.setEndereco(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone1 method, of class Filiado.
     */
    @Test
    public void testGetTelefone1() {
        System.out.println("getTelefone1");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getTelefone1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone1 method, of class Filiado.
     */
    @Test
    public void testSetTelefone1() {
        System.out.println("setTelefone1");
        String telefone1 = "";
        Filiado instance = new Filiado();
        instance.setTelefone1(telefone1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTelefone2 method, of class Filiado.
     */
    @Test
    public void testGetTelefone2() {
        System.out.println("getTelefone2");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getTelefone2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefone2 method, of class Filiado.
     */
    @Test
    public void testSetTelefone2() {
        System.out.println("setTelefone2");
        String telefone2 = "";
        Filiado instance = new Filiado();
        instance.setTelefone2(telefone2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Filiado.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class Filiado.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        Filiado instance = new Filiado();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRg method, of class Filiado.
     */
    @Test
    public void testGetRg() {
        System.out.println("getRg");
        Filiado instance = new Filiado();
        Rg expResult = null;
        Rg result = instance.getRg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRg method, of class Filiado.
     */
    @Test
    public void testSetRg() {
        System.out.println("setRg");
        Rg rg = null;
        Filiado instance = new Filiado();
        instance.setRg(rg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCpf method, of class Filiado.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getCpf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCpf method, of class Filiado.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        String cpf = "";
        Filiado instance = new Filiado();
        instance.setCpf(cpf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFaixas method, of class Filiado.
     */
    @Test
    public void testGetFaixas() {
        System.out.println("getFaixas");
        Filiado instance = new Filiado();
        List<Faixa> expResult = null;
        List<Faixa> result = instance.getFaixas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFaixas method, of class Filiado.
     */
    @Test
    public void testSetFaixas() {
        System.out.println("setFaixas");
        List<Faixa> faixas = null;
        Filiado instance = new Filiado();
        instance.setFaixas(faixas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObservacoes method, of class Filiado.
     */
    @Test
    public void testGetObservacoes() {
        System.out.println("getObservacoes");
        Filiado instance = new Filiado();
        String expResult = "";
        String result = instance.getObservacoes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setObservacoes method, of class Filiado.
     */
    @Test
    public void testSetObservacoes() {
        System.out.println("setObservacoes");
        String observacoes = "";
        Filiado instance = new Filiado();
        instance.setObservacoes(observacoes);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of copyProperties method, of class Filiado.
     */
    @Test
    public void testCopyProperties() {
        System.out.println("copyProperties");
        Filiado f = null;
        Filiado instance = new Filiado();
        instance.copyProperties(f);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
