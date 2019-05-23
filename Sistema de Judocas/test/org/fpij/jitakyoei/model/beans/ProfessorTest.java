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
 * @author 31756123
 */
public class ProfessorTest {
    
    private static Filiado filiadoProfessor;
    
    public ProfessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        filiadoProfessor = new Filiado();
        filiadoProfessor.setId(12344L);
        filiadoProfessor.setNome("Aline");
        filiadoProfessor.setRegistroCbj("");
	filiadoProfessor.setDataNascimento(new Date());
        filiadoProfessor.setDataCadastro(new Date());
        filiadoProfessor.setTelefone1("2");
        filiadoProfessor.setTelefone2("1");
        filiadoProfessor.setEmail("email@email.com");
        filiadoProfessor.setCpf("0");
        filiadoProfessor.setObservacoes("Obs");
        
        
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
     * Test of equals method, of class Professor.
     */
    @Test
    public void IDFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getId() == 12344L);
        
    }
    
    @Test
    public void NomeFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getNome() == "Aline");
        
    }
    
    @Test
    public void DataNascimentoFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getDataNascimento() == new Date());
        
    }
    
    @Test
    public void DataCastroFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getDataCadastro() == new Date());
        
    }
    
    @Test
    public void Telefone1FiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getTelefone1() == "Mackenzie");
        
    }
    
    @Test
    public void Telefone2FiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getTelefone2() == "Mackenzie");
        
    }
    
    @Test
    public void EmailFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getEmail() == "Mackenzie");
        
    }
    
    @Test
    public void CpfFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getCpf() == "Mackenzie");
        
    }
    
    @Test
    public void ObservacaoFiliadoProfessorIguaisTest() {
        assertTrue(filiadoProfessor.getObservacoes() == "Mackenzie");
        
    }
    
    
    

    
}
