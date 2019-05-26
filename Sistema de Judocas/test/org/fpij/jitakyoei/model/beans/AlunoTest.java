/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import org.fpij.jitakyoei.util.DatabaseManager;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 *
 * @author 31756123
 */
public class AlunoTest {
    
   private static Aluno aluno;
	private static Entidade entidade;
	private static Endereco endereco;
        private static Endereco enderecoPro;
	private static Filiado fil;
	private static Filiado filiadoProf;
	private static Professor professor;
	
	@BeforeClass
	public static void setUp(){
		
		fil = new Filiado();
		fil.setNome("Aline");
		fil.setCpf("008.009.010-22");
		fil.setDataNascimento(new Date());
		fil.setDataCadastro(new Date());
                fil.setTelefone1("(11)9985-7780");
                fil.setTelefone2("(11)8977-5950");
                fil.setEmail("aline@gmail.com");
		fil.setId(1234L);
		
		endereco = new Endereco();
		endereco.setBairro("Vila Galvão");
		endereco.setCep("070.08-003");
		endereco.setCidade("Guarulhos");
		endereco.setEstado("SP");
		endereco.setRua("Rua Antonio Gomes");
                
                enderecoPro = new Endereco();
		enderecoPro.setBairro("Vila Galvão");
		enderecoPro.setCep("070.08-001");
		enderecoPro.setCidade("Guarulhos");
		enderecoPro.setEstado("SP");
		enderecoPro.setRua("Rua Marcelle Arruda");
		
		filiadoProf = new Filiado();
		filiadoProf.setNome("Yuri");
		filiadoProf.setCpf("006.004.003-27");
                filiadoProf.setTelefone1("(11)9985-7787");
                filiadoProf.setTelefone2("(11)8977-5958");
                filiadoProf.setEmail("ana.claudia@gmail.com");
		filiadoProf.setDataNascimento(new Date());
		filiadoProf.setDataCadastro(new Date());
		filiadoProf.setId(5422L);
		filiadoProf.setEndereco(enderecoPro);
		
		professor = new Professor();
		professor.setFiliado(filiadoProf);
		
		entidade = new Entidade();
		entidade.setEndereco(endereco);
		entidade.setNome("Academia 1");
		entidade.setTelefone1("(086)1234-5123");
		
		aluno = new Aluno();
		aluno.setFiliado(fil);
		aluno.setProfessor(professor);
		aluno.setEntidade(entidade);
    }
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void NomeAlunoFiliadoTest() {
        assertEquals("Aline",aluno.getFiliado().getNome());
        assertNotNull(aluno.getFiliado().getNome());
    }
    
    @Test
    public void CpfAlunoFiliadoTest() {
        assertEquals("008.009.010-22",aluno.getFiliado().getCpf());
        assertNotNull(aluno.getFiliado().getCpf());
        assertTrue(aluno.getFiliado().getCpf().length() != 11);
    }
    
    @Test
    public void DataNascimentoAlunoFiliadoTest() {
        //assertEquals("Sun May 26 13:17:31 BRT 2019",aluno.getFiliado().getDataNascimento());
        assertNotNull(aluno.getFiliado().getDataNascimento());
    }
    
    @Test
    public void DataCadastroAlunoFiliadoTest() {
        //assertEquals(new Date(),aluno.getFiliado().getDataCadastro());
        assertNotNull(aluno.getFiliado().getDataCadastro());
        
    }
    
    @Test
    public void Telefone1FiliadoAlunoTest() {
        assertTrue(aluno.getFiliado().getTelefone1() == "(11)9985-7780");
        assertNotNull(aluno.getFiliado().getTelefone1());
        assertTrue(aluno.getFiliado().getTelefone1().length() != 11);
        
    }
    
    @Test
    public void Telefone2FiliadoAlunoTest() {
        assertTrue(aluno.getFiliado().getTelefone2() == "(11)8977-5950");
        assertNotNull(aluno.getFiliado().getTelefone2());
        assertTrue(aluno.getFiliado().getTelefone2().length() != 11);
    }
    
    @Test
    public void EmailFiliadoAlunoTest() {
        assertTrue(aluno.getFiliado().getEmail() == "aline@gmail.com");
        assertNotNull(aluno.getFiliado().getEmail());
    }
    
    @Test
    public void IdAlunoFiliadoTest() {
        assertTrue(aluno.getFiliado().getId() == 1234L);
        assertNotNull(aluno.getFiliado().getId());
    }
    
    //Aluno -> Professor
    @Test
    public void NomeProfessorDoAlunoFiliadoTest() {
        assertEquals("Yuri",aluno.getProfessor().getFiliado().getNome());
        assertNotNull(aluno.getProfessor().getFiliado().getNome());
    }
    
    @Test
    public void CpfProfessorDoAlunoFiliadoTest() {
        assertEquals("006.004.003-27",aluno.getProfessor().getFiliado().getCpf());
        assertNotNull(aluno.getProfessor().getFiliado().getCpf());
        assertTrue(aluno.getProfessor().getFiliado().getCpf().length() != 11);
    }
    
    @Test
    public void DataNascimentoProfessorDoAlunoFiliadoTest() {
        //assertEquals(new Date(),aluno.getProfessor().getFiliado().getDataNascimento());
        assertNotNull(aluno.getProfessor().getFiliado().getDataNascimento());
        
    }
    
    @Test
    public void DataCadastroProfessorDoAlunoFiliadoTest() {
        //assertEquals(new Date(),aluno.getProfessor().getFiliado().getDataCadastro());
        assertNotNull(aluno.getProfessor().getFiliado().getDataCadastro());
    }
    
    @Test
    public void Telefone1FiliadoProfessorTest() {
        assertTrue(aluno.getProfessor().getFiliado().getTelefone1() == "(11)9985-7787");
        assertNotNull(aluno.getProfessor().getFiliado().getTelefone1());
        assertTrue(aluno.getProfessor().getFiliado().getTelefone1().length() != 11);
        
    }
    
    @Test
    public void Telefone2FiliadoProfessorTest() {
        assertTrue(aluno.getProfessor().getFiliado().getTelefone2() == "(11)8977-5958");
        assertNotNull(aluno.getProfessor().getFiliado().getTelefone2());
        assertTrue(aluno.getProfessor().getFiliado().getTelefone2().length() != 11);
    }
    
    @Test
    public void EmailFiliadoProfessorTest() {
        assertTrue(aluno.getProfessor().getFiliado().getEmail() == "ana.claudia@gmail.com");
        assertNotNull(aluno.getProfessor().getFiliado().getEmail());
    }
    
    @Test
    public void IdProfessorDoAlunoFiliadoTest() {
        assertTrue(aluno.getProfessor().getFiliado().getId() == 5422L);
        assertNotNull(aluno.getProfessor().getFiliado().getId());
    }
    
    @Test
    public void BairroProfessorDoAlunoFiliadoTest() {
        assertEquals("Vila Galvão",aluno.getProfessor().getFiliado().getEndereco().getBairro());
        assertNotNull(aluno.getProfessor().getFiliado().getEndereco().getBairro());
    }
    
    @Test
    public void CidadeProfessorDoAlunoFiliadoTest() {
        assertEquals("Guarulhos",aluno.getProfessor().getFiliado().getEndereco().getCidade());
        assertNotNull(aluno.getProfessor().getFiliado().getEndereco().getCidade());
        
    }
    
    @Test
    public void EstadoProfessorDoAlunoFiliadoTest() {
        assertEquals("SP",aluno.getProfessor().getFiliado().getEndereco().getEstado());
        assertNotNull(aluno.getProfessor().getFiliado().getEndereco().getEstado());
    }
    
    @Test
    public void RuaProfessorDoAlunoFiliadoTest() {
        assertEquals("Rua Marcelle Arruda",aluno.getProfessor().getFiliado().getEndereco().getRua());
        assertNotNull(aluno.getProfessor().getFiliado().getEndereco().getRua());
    }
    
    //Aluno -> Entidade
    @Test
    public void BairroEntidadeDoAlunoFiliadoTest() {
        assertEquals("Vila Galvão",aluno.getEntidade().getEndereco().getBairro());
        assertNotNull(aluno.getEntidade().getEndereco().getBairro());
    }
    
    @Test
    public void CidadeEntidadeDoAlunoFiliadoTest() {
        assertEquals("Guarulhos",aluno.getEntidade().getEndereco().getCidade());
        assertNotNull(aluno.getEntidade().getEndereco().getCidade());
    }
    
    @Test
    public void EstadoEntidadeDoAlunoFiliadoTest() {
        assertEquals("SP",aluno.getEntidade().getEndereco().getEstado());
        assertNotNull(aluno.getEntidade().getEndereco().getEstado());
    }
    
    @Test
    public void RuaEntid11adeDoAlunoFiliadoTest() {
        assertEquals("Rua Antonio Gomes",aluno.getEntidade().getEndereco().getRua());
        assertNotNull(aluno.getEntidade().getEndereco().getRua());
    }
    
    @Test
    public void NomeEntidadeDoAlunoFiliadoTest() {
        assertEquals("Academia 1",aluno.getEntidade().getNome());
        assertNotNull(aluno.getEntidade().getNome());
    }
    
    @Test
    public void TelefoneEntidadeDoAlunoFiliadoTest() {
        assertEquals("(086)1234-5123",aluno.getEntidade().getTelefone1());
        assertNotNull(aluno.getEntidade().getTelefone1());
        assertTrue(aluno.getEntidade().getTelefone1().length() != 8);
    }
    
}
