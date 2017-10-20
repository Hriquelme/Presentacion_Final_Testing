/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author carl
 */
public class validadoresTest {
    
    public validadoresTest() {
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
     * Test of validadores method, of class validadores.
     */
    @Test
    public void testValidadores() {
        System.out.println("validadores");
        validadores instance = new validadores();
        //instance.validadores();
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of quitaEspacios method, of class validadores.
     */
 

    /**
     * Test of sacapuntos method, of class validadores.
     */

    /**
     * Test of sacaComas method, of class validadores.
     */
    

    /**
     * Test of quitarGuiones method, of class validadores.
     */
    @Test

  
    
    
   /**
     * se realizan la evaluacion de validacion de rut quitando los espacio, puntos y comas que puede haber en el rut y luego
     * lo verifica si esta correcto.
     */
   // en este test realizaremos los caso limites que se implemento en el programa anterior.
    
    public void testValidadorRut() {
        int cont=0;
        String rut = "18676359-9"; //rut valido
     
        validadores instance = new validadores();
     
    while (cont<2){    
        
        if (instance.validadorRut(rut)==true){
        
           System.out.println("validador Rut sin punto: "+instance.validadorRut(rut));
            
            rut = "18.676.359-9";
            cont++;
        }else {
            
        fail("The test case is a prototype.");
        cont++;
        }
    }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    
    @Test
    public void testInvRut() {
 
       int cont=0;
        String rut = "16349-9"; //rut invalido
            
    
        validadores instance = new validadores();
 
      while (cont<2){
          
        if (instance.validadorRut(rut)==false){
        
            System.out.println("test de rut invalido: "+instance.validadorRut(rut));
              rut = "1 8   6  76 359 k"; //rut invalido
               cont++;
        }else {
           fail("The test case is a prototype.");
        
             }
        
        // TODO review the generated test code and remove the default call to fail.
        }
    }

    @Test
    public void testInvRut2() {
 
       int cont=0;
        String rut = "1-9"; //rut invalido
            
    
        validadores instance = new validadores();
 
      while (cont<2){
          
        if (instance.validadorRut(rut)==false){
        
            System.out.println("test de rut invalido: "+instance.validadorRut(rut));
              rut = "15-2"; //rut invalido
               cont++;
        }else {
           fail("The test case is a prototype.");
        
             }
        
        // TODO review the generated test code and remove the default call to fail.
        }
    }
    
    
    
    
    /**
     * se utilizara los casos limites del programa anterior.
     */
    @Test
   
    public void testValidateMontoLiquido() {
       int cont=0;
        String monto = "500.000";
        validadores instance = new validadores();
        String expResult = "500000";
        while (cont<2){
        String result = instance.validateMontoLiquido(monto);
        if (!result.equals(expResult)){
        
                 fail("The test case is a prototype.");
        }else {
         
            
              System.out.println("monto resultado: "+result);
            monto="100.000.000";
            expResult="100000000";
            cont++;
        }
      }
        // TODO review the generated test code and remove the default call to fail.
       //
    }
    
    @Test
    public void testInValidateMontoLiquido() {
        int cont=0;
        String monto = "aaaaaa";
       
        
        validadores instance = new validadores();
        String expResult = "500.000";
        
        while (cont<3){
        
        String result = instance.validateMontoLiquido(monto);
        if(expResult.equals(result)){
        
            fail("The test case is a prototype.");  
            
        }else{
            System.out.println("el test monto invalido a resultado");
             monto = "40.000";
             expResult = "40000";
           
             if(cont==1){
             monto = "100.000.001";
             expResult = "100000001";
             }  cont++;
            }
        
        // TODO review the generated test code and remove the default call to fail.
        
        
        }
    
    }
    
}
