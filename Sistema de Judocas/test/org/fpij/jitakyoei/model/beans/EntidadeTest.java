/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 31756123
 */
public class EntidadeTest {
    
    private static Entidade entidade;
    private static Endereco endereco;
      
    @BeforeClass
    public static void setUpClass() {
        endereco = new Endereco();
        endereco.setBairro("Vila Galvão");
        endereco.setCep("007.88.999");
        endereco.setCidade("Guarulhos");
        endereco.setEstado("SP");
        endereco.setNumero("78");
        endereco.setRua("Rua Antonio Lacerda");
        
        entidade = new Entidade();
	entidade.setEndereco(endereco);
    }
        
    @AfterClass
    public static void tearDownClass() {
    }
    
    
    @Test
    public void RuaEntidadeIguaisTest() {
        assertTrue(entidade.getEndereco().getRua() == "Rua Antonio Lacerda");
        assertNotNull(entidade.getEndereco().getRua());
        
    }
    
    @Test
    public void NumeroDaEntidadeIguaisTest() {
        assertTrue(entidade.getEndereco().getNumero() == "78");
        assertNotNull(entidade.getEndereco().getNumero());
    }
    
    @Test
    public void BairroEntidadeIguaisTest() {
        assertTrue(entidade.getEndereco().getBairro() == "Vila Galvão");
        assertNotNull(entidade.getEndereco().getBairro());
    }
    
    @Test
    public void CidadeIguaisTest() {
        assertTrue(entidade.getEndereco().getCidade() == "Guarulhos");
        assertNotNull(entidade.getEndereco().getCidade());
    }
    
    @Test
    public void EstadoEntidadeIguaisTest() {
        assertTrue(entidade.getEndereco().getEstado() == "SP");
        assertNotNull(entidade.getEndereco().getEstado());
    }
    
    @Test
    public void CepEntidadeIgualTest() {
        assertTrue(entidade.getEndereco().getCep() == "007.88.999");
        assertNotNull(entidade.getEndereco().getCep());
        assertTrue(entidade.getEndereco().getCep().length() != 8);
        
    }
   
}
