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
public class EnderecoTest {
    
    private static Endereco endereco;
    public EnderecoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
        endereco = new Endereco();
        endereco.setBairro("ZN");
        endereco.setCep("070.93-070");
        endereco.setCidade("GRU");
        endereco.setEstado("SP");
        endereco.setNumero("4");
        endereco.setRua("Rua Antonio Cabral");
    }
    
 
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void BairroCorretoTest() {
        assertTrue(endereco.getBairro() == "ZN");
        assertNotNull(endereco.getBairro());
        
    }
    
    @Test
    public void CepCorretoTest() {
        assertTrue(endereco.getCep() == "070.93-070");
        assertNotNull(endereco.getCep());
        assertTrue(endereco.getCep().length() != 8);
        
    }
    
    @Test
    public void CidadeCorretaTest() {
        assertTrue(endereco.getCidade() == "GRU");
        assertNotNull(endereco.getCidade());
        
    }
    
    @Test
    public void EstadoCorretoTest() {
        assertTrue(endereco.getEstado() == "SP");
        assertNotNull(endereco.getEstado());
        
    }
    
    @Test
    public void NumeroCorretoTest() {
        assertTrue(endereco.getNumero() == "4");
        assertNotNull(endereco.getNumero());
        
    }
    
    @Test
    public void RuaCorretaTest() {
        assertTrue(endereco.getRua() == "Rua Antonio Cabral");
        assertNotNull(endereco.getRua());
        
    }
}
