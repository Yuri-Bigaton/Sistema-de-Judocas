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
public class ProfessorEntidadeTest {
    
    private static Professor professor;
    private static Filiado filiadoProf;
    private static Entidade entidade;
    public ProfessorEntidadeTest() {
        
    }
    
    @BeforeClass
    public static void setUp() {
        professor = new Professor();
        professor.setFiliado(filiadoProf);
        
        
		
        
        
	filiadoProf = new Filiado();
        filiadoProf.setNome("Professor");
	filiadoProf.setCpf("036.464.453-27");
	filiadoProf.setId(3332L);
        
        entidade = new Entidade();
        entidade.setNome("Mackenzie");
        
        
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    

    @Test
    public void ProfessorEntidadeCorretosTest() {
        assertTrue(entidade.getNome() == "Mackenzie");
        assertTrue(filiadoProf.getCpf() == "036.464.453-27");

    }

    
}
