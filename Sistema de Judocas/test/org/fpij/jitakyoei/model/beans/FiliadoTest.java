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
    
    private static Filiado fil;
    private static Rg rg;
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
        
        fil = new Filiado();
        fil.setNome("Aline");
	fil.setDataNascimento(new Date());
	fil.setDataCadastro(new Date());
	fil.setCpf("008.009.010-22");
        fil.setTelefone1("(11)9998-7645");
        fil.setTelefone2("(11)9495-7788");
        fil.setRegistroCbj("Registro");
        fil.setObservacoes("Observação");
	fil.setEmail("aline@gmail.com");
        fil.setRg(rg);
        
        rg = new Rg();
        rg.setNumero("55.125.447-7");
        rg.setOrgaoExpedidor("SP");
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void NomeFiliadoTest() {
        assertEquals("Aline",fil.getNome());
        assertNotNull(fil.getNome());
    }
    
    @Test
    public void CpfFiliadoTest() {
        assertEquals("008.009.010-22",fil.getCpf());
        assertNotNull(fil.getCpf());
        assertTrue(fil.getCpf().length() != 11);
    }

    @Test
    public void Telefone1FiliadoTest() {
        assertEquals("(11)9998-7645",fil.getTelefone1());
        assertNotNull(fil.getTelefone1());
        assertTrue(fil.getTelefone1().length() != 10);
    }
    
    @Test
    public void Telefone2FiliadoTest() {
        assertEquals("(11)9495-7788",fil.getTelefone2());
        assertNotNull(fil.getTelefone2());
        assertTrue(fil.getTelefone2().length() != 10);
    }
    
    @Test
    public void DataNascimentoFiliadoTest() {
        //assertEquals("Sun May 26 13:17:31 BRT 2019",aluno.getFiliado().getDataNascimento());
        assertNotNull(fil.getDataNascimento());
    }
    
    @Test
    public void DataCadastroFiliadoTest() {
        //assertEquals(new Date(),aluno.getFiliado().getDataCadastro());
        assertNotNull(fil.getDataCadastro());
        
    }
    
    @Test
    public void RegistroCbsFiliadoTest() {
        assertEquals("Registro",fil.getRegistroCbj());
        assertNotNull(fil.getRegistroCbj());
    }
    
    @Test
    public void ObservacoesFiliadoTest() {
        assertEquals("Observação",fil.getObservacoes());
        assertNotNull(fil.getObservacoes());
    }
    
    @Test
    public void NumeroRgFiliadoTest() {
        assertEquals("55.125.447-7",fil.getRg().getNumero());
        assertNotNull(fil.getRg().getNumero());
    }
    
    @Test
    public void OrgaoExpeditorRgFiliadoTest() {
        assertEquals("SP",fil.getRg().getOrgaoExpedidor());
        assertNotNull(fil.getRg().getOrgaoExpedidor());
    }
    
    
    
}
