/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.ResultSet;
import java.util.List;
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
public class UsuarioDAOTest {

    public UsuarioDAOTest() {
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

    /**
     * Test of cambiarPassword method, of class UsuarioDAO.
     */
    @Test
    public void testCambiarPassword() {
        System.out.println("cambiarPassword");
        String usuario = "ANTHONY.CARLOS";
        String newPassword = "999999";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.cambiarPassword(usuario, newPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

    /**
     * Test of validarExistenciaUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testValidarExistenciaUsuario() {
        System.out.println("validarExistenciaUsuario");
        String usuario = "ANTHONY.CARLOS";
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "El usuario ingresado ya existe.";
        String result = instance.validarExistenciaUsuario(usuario);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registrarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testRegistrarUsuario() {
        System.out.println("registrarUsuario");
        String usuario = "MIGUEL.ANGEL";
        String password = "123456";
        String tipoUsuario = "Agricultor";
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "";
        String result = instance.registrarUsuario(usuario, password, tipoUsuario);
        assertEquals(expResult, result);
        
        String usuario2 = "EDWIN.JOSE";
        String password2 = "123456";
        String tipoUsuario2 = "Agrónomo";
        UsuarioDAO instance2 = new UsuarioDAO();
        String expResult2 = "";
        String result2 = instance2.registrarUsuario(usuario2, password2, tipoUsuario2);
        assertEquals(expResult2, result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registrarAgricultor method, of class UsuarioDAO.
     */
    @Test
    public void testRegistrarAgricultor() {
        System.out.println("registrarAgricultor");
        String nombres = "MIGUEL";
        String apellidos = "RAYMUNDO";
        String correo = "miguel@gmail.com";
        String ciudad = "Chimbote";
        String tipo = "Agricultor";
        String usuario = "MIGUEL.ANGEL";
        String password = "123456";
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "";
        String result = instance.registrarAgricultor(nombres, apellidos, correo, ciudad, tipo, usuario, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registrarAgronomo method, of class UsuarioDAO.
     */
    @Test
    public void testRegistrarAgronomo() {
        System.out.println("registrarAgronomo");
        String nombres = "EDWIN";
        String apellidos = "AYALA";
        String correo = "edwin@gmail.com";
        String ciudad = "LIMA";
        String tipo = "Agrónomo";
        String colegiatura = "COL-999";
        String usuario = "EDWIN.JOSE";
        String password = "123456";
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "";
        String result = instance.registrarAgronomo(nombres, apellidos, correo, ciudad, tipo, colegiatura, usuario, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarUsuario method, of class UsuarioDAO.
     */
    @Test
    public void testValidarUsuario() {
        System.out.println("validarUsuario");
        String user = "ANTHONY.CARLOS";
        String pass = "999999";
        UsuarioDAO instance = new UsuarioDAO();
        String expResult = "Agricultor";
        String result = instance.validarUsuario(user, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of recuperarContraseña method, of class UsuarioDAO.
     */
    @Test
    public void testRecuperarContraseña() {
        System.out.println("recuperarContrase\u00f1a");
        String usuarioCorreo = "miriancastaxeda.2014@gmail.com";
        UsuarioDAO instance = new UsuarioDAO();
        ResultSet expResult = null;
        ResultSet result = instance.recuperarContraseña(usuarioCorreo);
        if((result == expResult)){
            fail("The test case is a prototype.");
        }
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerPerfil method, of class UsuarioDAO.
     */
    @Test
    public void testObtenerPerfil() {
        System.out.println("obtenerPerfil");
        String usuarioSesion = "ANTHONY.CARLOS";
        UsuarioDAO instance = new UsuarioDAO();
        List<String> expResult = null;
        List<String> result = instance.obtenerPerfil(usuarioSesion);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if((result == expResult)){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of actualizarPerfil method, of class UsuarioDAO.
     */
    @Test
    public void testActualizarPerfil() {
        System.out.println("actualizarPerfil");
        int idUsuario = 0;
        String nombres = "ANTHONY";
        String apellidos = "MONTAÑEZ";
        String correo = "montanez.ayala@gmail.com";
        String ciudad = "CHIMBOTE";
        String tipo = "Agricultor";
        String colegiatura = "";
        String usuario = "ANTHONY.CARLOS";
        String password = "999999";
        UsuarioDAO instance = new UsuarioDAO();
        boolean expResult = true;
        boolean result = instance.actualizarPerfil(idUsuario, nombres, apellidos, correo, ciudad, tipo, colegiatura, usuario, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
