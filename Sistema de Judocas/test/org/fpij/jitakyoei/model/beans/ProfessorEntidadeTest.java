/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
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
public class ProfessorEntidadeTest {
    
    private static Professor prof ;
    private static Filiado filiadoProfessor;
    private static Entidade entidade;
    private static ProfessorEntidade profEnt;
    private static Endereco endereco;
    public ProfessorEntidadeTest() {
        
    }
    
    @BeforeClass
    public static void setUp() {
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
        
        
        endereco = new Endereco();
        endereco.setBairro("ZN");
        endereco.setCep("070.93-070");
        endereco.setCidade("GRU");
        endereco.setEstado("SP");
        endereco.setNumero("4");
        endereco.setRua("Rua Antonio Cabral");
        
        entidade = new Entidade();
	entidade.setEndereco(endereco);
        
        prof= new Professor();
	prof.setFiliado(filiadoProfessor);
        
        
        profEnt = new ProfessorEntidade(prof,entidade);
        profEnt.setEntidade(entidade);
        profEnt.setProfessor(prof);
    
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    @Test
    public void IDProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getId() == 12344L);
        assertNotNull(profEnt.getProfessor().getFiliado().getId());
    }
    
    @Test
    public void NomeFiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getNome() == "Ana Claudia");
        assertNotNull(profEnt.getProfessor().getFiliado().getNome());
        
    }
    
    @Test
    public void DataNascimentoFiliadoProfessorEntidadeTest() {
        assertNotNull(profEnt.getProfessor().getFiliado().getDataNascimento());
    }
    
    @Test
    public void DataCastroFiliadoProfessorEntidadeTest() {
        assertNotNull(profEnt.getProfessor().getFiliado().getDataCadastro());
    }
    
    @Test
    public void Telefone1FiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getTelefone1() == "(11)9985-7787");
        assertNotNull(profEnt.getProfessor().getFiliado().getTelefone1());
        assertTrue(profEnt.getProfessor().getFiliado().getTelefone1().length() != 11);
        
    }
    
    @Test
    public void Telefone2FiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getTelefone2() == "(11)8977-5958");
        assertNotNull(profEnt.getProfessor().getFiliado().getTelefone2());
        assertTrue(profEnt.getProfessor().getFiliado().getTelefone2().length() != 11);
    }
    
    @Test
    public void EmailFiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getEmail() == "ana.claudia@gmail.com");
        assertNotNull(profEnt.getProfessor().getFiliado().getEmail());
    }
    
    @Test
    public void CpfFiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getCpf() == "088.655.585-44");
        assertNotNull(profEnt.getProfessor().getFiliado().getCpf());
        assertTrue(profEnt.getProfessor().getFiliado().getCpf().length() != 11);
    }
    
    @Test
    public void ObservacaoFiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getObservacoes() == "Obs");
        assertNotNull(profEnt.getProfessor().getFiliado().getObservacoes());
    }
    
    @Test
    public void RegistroCbjFiliadoProfessorEntidadeTest() {
        assertTrue(profEnt.getProfessor().getFiliado().getRegistroCbj() == "Registro");
        assertNotNull(profEnt.getProfessor().getFiliado().getRegistroCbj());
        
    }
    
    @Test
    public void BairroCorretoTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getBairro() == "ZN");
        assertNotNull(profEnt.getEntidade().getEndereco().getBairro());
        
    }
    
    @Test
    public void CepCorretoTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getCep() == "070.93-070");
        assertNotNull(profEnt.getEntidade().getEndereco().getCep());
        assertTrue(profEnt.getEntidade().getEndereco().getCep().length() != 8);
        
    }
    
    @Test
    public void CidadeCorretaTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getCidade() == "GRU");
        assertNotNull(profEnt.getEntidade().getEndereco().getCidade());
        
    }
    
    @Test
    public void EstadoCorretoTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getEstado() == "SP");
        assertNotNull(profEnt.getEntidade().getEndereco().getEstado());
        
    }
    
    @Test
    public void NumeroCorretoTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getNumero() == "4");
        assertNotNull(profEnt.getEntidade().getEndereco().getNumero());
        
    }
    
    @Test
    public void RuaCorretaTest() {
        assertTrue(profEnt.getEntidade().getEndereco().getRua() == "Rua Antonio Cabral");
        assertNotNull(profEnt.getEntidade().getEndereco().getRua());
        
    }

    
}
