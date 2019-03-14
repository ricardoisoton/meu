/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stefano;

/**
 *
 * @author 19121054
 */
public class OperadoresMatematicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int soma= 0;
   int mult= 0;
   int a= 40;
   int b= 20;
   
   int div=0;
   int resto=0; 
   int sub =0; 
   
   String nome = "";
   
    soma = a + b;
    mult = a * b;
    div   = a/ b;
    resto =  a%b;
    sub   = b-a;
    
    
    
    System.out.println(soma);
    System.out.println(mult);
    System.out.println (div); 
    System.out.println (resto);
    System.out.println (sub);  
    if (2==2)
    {    
     System.out.println("E verdade") ;    
    }    
    else
    {    
     System.out.println("E Falso") ;
    }
  
      
    
    
    
    
    
    }
    
}