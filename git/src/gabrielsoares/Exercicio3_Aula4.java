/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabrielsoares;

/**
 *
 * @author gabriel
 */
public class Exercicio3_Aula4 {
   public static void main (String[]args){
       float menos_1duzia = 1.30f;
       int duzia = 12;
       int qtd_comprada = 10;
       float valor = 0f;
       if (qtd_comprada<12) {
           valor = menos_1duzia*qtd_comprada;
           System.out.println(+qtd_comprada+" macas custam: R$ "+valor);
       }
       if (qtd_comprada>=12){
           valor = duzia*qtd_comprada;
           System.out.println(+qtd_comprada+" macas custam: R$ "+valor);
       }
   } 
}
