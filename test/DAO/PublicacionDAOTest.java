/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Modelo.Publicacion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amontanez
 */
public class PublicacionDAOTest {

    public PublicacionDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
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
    public void testBuscarPublicacion() {
        System.out.println("buscarPublicacion");
        //String buscar = "";
        String buscar = "plag";
        System.out.println("Buscando publicaciones ...");
        Integer idPublicacion = 0;
        PublicacionDAO instance = new PublicacionDAO();
        List<Publicacion> expResult = new ArrayList<>();
        List<Publicacion> result = instance.buscarPublicacion(buscar, idPublicacion);
        if(result.size() > 0){
            System.out.println(result);
            
        }
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
