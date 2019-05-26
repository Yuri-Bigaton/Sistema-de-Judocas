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
    
    private static Professor prof ;
    private static Filiado filiadoProfessor;
    
    public ProfessorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        filiadoProfessor = new Filiado();
        filiadoProfessor.setId(12344L);
        filiadoProfessor.setNome("Ana Claudia");
        filiadoProfessor.setRegistroCbj("Registro");
	filiadoProfessor.setDataNascimento(new Date());
        filiadoProfessor.setDataCadastro(new Date());
        filiadoProfessor.setTelefone1("(11)9985-7787");
        filiadoProfessor.setTelefone2("(11)8977-5958");
        filiadoProfessor.setEmail("ana.claudia@gmail.com");
        filiadoProfessor.setCpf("088.655.585-44");
        filiadoProfessor.setObservacoes("Obs");
        
        prof = new Professor();
        prof.setFiliado(filiadoProfessor);
                      
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    
    @Test
    public void IDFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getId() == 12344L);
        assertNotNull(prof.getFiliado().getId());
    }
    
    @Test
    public void NomeFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getNome() == "Ana Claudia");
        assertNotNull(prof.getFiliado().getNome());
        
    }
    
    @Test
    public void DataNascimentoFiliadoProfessorTest() {
        assertNotNull(prof.getFiliado().getDataNascimento());
    }
    
    @Test
    public void DataCastroFiliadoProfessorTest() {
        assertNotNull(prof.getFiliado().getDataCadastro());
    }
    
    @Test
    public void Telefone1FiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getTelefone1() == "(11)9985-7787");
        assertNotNull(prof.getFiliado().getTelefone1());
        assertTrue(prof.getFiliado().getTelefone1().length() != 11);
        
    }
    
    @Test
    public void Telefone2FiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getTelefone2() == "(11)8977-5958");
        assertNotNull(prof.getFiliado().getTelefone2());
        assertTrue(prof.getFiliado().getTelefone2().length() != 11);
    }
    
    @Test
    public void EmailFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getEmail() == "ana.claudia@gmail.com");
        assertNotNull(prof.getFiliado().getEmail());
    }
    
    @Test
    public void CpfFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getCpf() == "088.655.585-44");
        assertNotNull(prof.getFiliado().getCpf());
        assertTrue(prof.getFiliado().getCpf().length() != 11);
    }
    
    @Test
    public void ObservacaoFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getObservacoes() == "Obs");
        assertNotNull(prof.getFiliado().getObservacoes());
    }
    
    @Test
    public void RegistroCbjFiliadoProfessorTest() {
        assertTrue(prof.getFiliado().getRegistroCbj() == "Registro");
        assertNotNull(prof.getFiliado().getRegistroCbj());
        
    }
    

    
}
