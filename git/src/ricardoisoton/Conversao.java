/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ricardoisoton;

/**
 *
 * @author 19113081
 */
public class Conversao {
    public static void main(String[] args){
    
    boolean bo;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    
    c = 65;
    System.out.println ("=============================");
    System.out.println ("char");
    //Note a diferença entre impressão das duas linhas abaixo*/
    System.out.println ("valor de c como char = "+c);
    System.out.printf ("valor de c como numero = %d \n",(short)c);
    System.out.println ("=============================");
    
    b = 10;
    s = b;
    i = s;
    
    System.out.println("=========");
    System.out.println("inteiros");
    System.out.println("=========");
    System.out.println("i = s = b = "+i);
    
    i = i*100;
    System.out.println("Novo valor de i = "+i);
    
    b = (byte)i;
    System.out.println("novo valor de b = "+b);
    //Porque o valor é - 24?
    System.out.println ("Saída de impressão");
    System.out.println ("----------------------");
    
    System.out.println ("");
    
}
}