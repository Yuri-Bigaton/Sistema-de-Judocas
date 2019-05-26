/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import org.fpij.jitakyoei.util.CorFaixa;
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
public class FaixaTest {
    
    public FaixaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    //Date dataEntrega = f.setDataEntrega(new Date());
    
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

    @Test
    public void CorDaFaixaTest(){
        assertEquals("Branca", CorFaixa.BRANCA.toString());
        assertEquals("Cinza", CorFaixa.CINZA.toString());
        assertEquals("Azul", CorFaixa.AZUL.toString());
        assertEquals("Laranja", CorFaixa.LARANJA.toString());
        assertEquals("Verde", CorFaixa.VERDE.toString());
        assertEquals("Roxa", CorFaixa.ROXA.toString());
        assertEquals("Marrom", CorFaixa.MARROM.toString());
        assertEquals("Preta 1º Dan", CorFaixa.PRETA1DAN.toString());
        assertEquals("Preta 2º Dan", CorFaixa.PRETA2DAN.toString());
        assertEquals("Preta 3º Dan", CorFaixa.PRETA3DAN.toString());
        assertEquals("Preta 4º Dan", CorFaixa.PRETA4DAN.toString());
        assertEquals("Preta 5º Dan", CorFaixa.PRETA5DAN.toString());
        assertEquals("Coral 6º Dan", CorFaixa.CORAL6DAN.toString());
        assertEquals("Coral 7º Dan", CorFaixa.CORAL7DAN.toString());
        assertEquals("Vermelha 8º Dan", CorFaixa.VERMELHA8DAN.toString());
        assertEquals("Vermelha 9º Dan", CorFaixa.VERMELHA9DAN.toString());
        assertEquals("Vermelha 10º Dan", CorFaixa.VERMELHA10DAN.toString());
        assertEquals("Amarela", CorFaixa.AMARELA.toString());
    }
    
    
}
