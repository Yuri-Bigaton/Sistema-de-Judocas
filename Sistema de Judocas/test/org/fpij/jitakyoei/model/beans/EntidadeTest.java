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
 * @author 31702554
 */
public class EntidadeTest {
    
    private static Endereco endereco;
    public EntidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        endereco = new Endereco();
        endereco.setBairro("gru");
        endereco.setCep("33");
        endereco.setCidade("gruc");
        endereco.setEstado("SP");
        endereco.setNumero("78");
        endereco.setRua("Rua");
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
     * Test of equals method, of class Entidade.
     */

    
    @Test
    public void RuaEntidadeIguaisTest() {
        assertTrue(endereco.getRua() == "Mackenzie");
        
    }
    
    @Test
    public void NumeroDaEntidadeIguaisTest() {
        assertTrue(endereco.getNumero() == "Mackenzie");
        
    }
    
    @Test
    public void BairroEntidadeIguaisTest() {
        assertTrue(endereco.getBairro() == "Mackenzie");
        
    }
    
    @Test
    public void CidadeIguaisTest() {
        assertTrue(endereco.getCidade() == "Sao Paulo");
        
    }
    
    @Test
    public void EstadoEntidadeIguaisTest() {
        assertTrue(endereco.getEstado() == "Mackenzie");
        
    }
    
    @Test
    public void CepEntidadeIgualTest() {
        assertTrue(endereco.getCep() == "20");
        
    }
   
}
