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
public class aula1303exercicio22 {
public static void main (String[] args) {
    /*
    As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia,
    e R$ 1,00 se forem compradas pelo menos 12. A Ana comprou 10,
    qual o custo total da compra?
    */
    int a = 12;
    int b = 10;
    float macaduzia = 1.00f;
    float macamenosduzia = 1.30f, soma, multi, div, resto, sub;
    multi = b*macamenosduzia;
    float c = multi;
    
    if (c == 12.00)
    {
    System.out.println ("O custo foi" +c);
    }
    else
    {
    System.out.println ("O custo foi " +multi);
    }
}    
}
