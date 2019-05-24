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
import static org.junit.Assert.*;

/**
 *
 * @author 31756123
 */
public class AlunoTest {
    
   private static Aluno aluno;
	private static Entidade entidade;
	private static Endereco endereco;
	private static Filiado fil;
	private static Filiado filiadoProf;
	private static Professor professor;
	
	@BeforeClass
	public static void setUp(){
		
		fil = new Filiado();
		fil.setNome("Aécio");
		fil.setCpf("036.464.453-27");
		fil.setDataNascimento(new Date());
		fil.setDataCadastro(new Date());
		fil.setId(1332L);
		
		endereco = new Endereco();
		endereco.setBairro("Dirceu");
		endereco.setCep("64078-213");
		endereco.setCidade("Teresina");
		endereco.setEstado("PI");
		endereco.setRua("Rua Des. Berilo Mota");
		
		filiadoProf = new Filiado();
		filiadoProf.setNome("Professor Antonio");
		filiadoProf.setCpf("036.444.453-27");
		filiadoProf.setDataNascimento(new Date());
		filiadoProf.setDataCadastro(new Date());
		filiadoProf.setId(3332L);
		filiadoProf.setEndereco(endereco);
		
		professor = new Professor();
		professor.setFiliado(filiadoProf);
		
		entidade = new Entidade();
		entidade.setEndereco(endereco);
		entidade.setNome("Academia 1");
		entidade.setTelefone1("(086)1234-5432");
		
		aluno = new Aluno();
		aluno.setFiliado(fil);
		aluno.setProfessor(professor);
		aluno.setEntidade(entidade);
    }
    @AfterClass
    public static void tearDownClass() {
    }
    /**
    @Test
    public void CpfInseridoCorretoTest() {
        assertEquals("036.464.453-27", fil.getCpf());
    }
    **/
    
    @Test
    public void NomeAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getFiliado().getNome());
    }
    
    @Test
    public void CpfAlunoFiliadoTest() {
        assertEquals("036.464.453-27",aluno.getFiliado().getCpf());
        assertNotNull(aluno.getFiliado().getCpf());
        assertTrue(aluno.getFiliado().getCpf().length() != 11);
    }
    
    @Test
    public void DataNascimentoAlunoFiliadoTest() {
        assertEquals(new Date(),aluno.getFiliado().getDataNascimento());
    }
    
    @Test
    public void DataCadastroAlunoFiliadoTest() {
        assertEquals(new Date(),aluno.getFiliado().getDataCadastro());
    }
    
    @Test
    public void IdAlunoFiliadoTest() {
        assertEquals("1332L",aluno.getFiliado().getId());
    }
    
    //Aluno -> Professor
    @Test
    public void NomeProfessorDoAlunoFiliadoTest() {
        assertEquals("Professor Antonio",aluno.getProfessor().getFiliado().getNome());
    }
    
    @Test
    public void CpfProfessorDoAlunoFiliadoTest() {
        assertEquals("036.444.453-27",aluno.getProfessor().getFiliado().getCpf());
    }
    
    @Test
    public void DataNascimentoProfessorDoAlunoFiliadoTest() {
        assertEquals(new Date(),aluno.getProfessor().getFiliado().getDataNascimento());
    }
    
    @Test
    public void DataCadastroProfessorDoAlunoFiliadoTest() {
        assertEquals(new Date(),aluno.getProfessor().getFiliado().getDataCadastro());
    }
    
    @Test
    public void IdProfessorDoAlunoFiliadoTest() {
        assertEquals("3332L",aluno.getProfessor().getFiliado().getId());
    }
    
    @Test
    public void BairroProfessorDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getProfessor().getFiliado().getEndereco().getBairro());
    }
    
    @Test
    public void CidadeProfessorDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getProfessor().getFiliado().getEndereco().getCidade());
    }
    
    @Test
    public void EstadoProfessorDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getProfessor().getFiliado().getEndereco().getEstado());
    }
    
    @Test
    public void RuaProfessorDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getProfessor().getFiliado().getEndereco().getRua());
    }
    
    //Aluno -> Entidade
    @Test
    public void BairroEntidadeDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getEntidade().getEndereco().getBairro());
    }
    
    @Test
    public void CidadeEntidadeDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getEntidade().getEndereco().getCidade());
    }
    
    @Test
    public void EstadoEntidadeDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getEntidade().getEndereco().getEstado());
    }
    
    @Test
    public void RuaEntidadeDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getEntidade().getEndereco().getRua());
    }
    
    @Test
    public void NomeEntidadeDoAlunoFiliadoTest() {
        assertEquals("Academia 1",aluno.getEntidade().getNome());
    }
    
    @Test
    public void TelefoneEntidadeDoAlunoFiliadoTest() {
        assertEquals("Aécio",aluno.getEntidade().getTelefone1());
    }
    
}
