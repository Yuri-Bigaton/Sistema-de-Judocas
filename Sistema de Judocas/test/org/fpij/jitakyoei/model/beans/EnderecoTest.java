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
        endereco.setRua("Rua Antonio");
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void BairroCorretoTest() {
        assertTrue(endereco.getBairro() == "ZL");
        
    }
    
    @Test
    public void CepCorretoTest() {
        assertTrue(endereco.getCep() == "070.04-070");
        
    }
    
    @Test
    public void CidadeCorretaTest() {
        assertTrue(endereco.getCidade() == "GRU");
        
    }
    
    @Test
    public void EstadoCorretoTest() {
        assertTrue(endereco.getEstado() == "SP");
        
    }
    
    @Test
    public void NumeroCorretoTest() {
        assertTrue(endereco.getNumero() == "04");
        
    }
    
    @Test
    public void RuaCorretaTest() {
        assertTrue(endereco.getRua() == "Rua Antonio");
        
    }
}
