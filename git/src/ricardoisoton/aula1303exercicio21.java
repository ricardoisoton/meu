package ricardoisoton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19113081
 */
public class aula1303exercicio21 {
public static void main (String[] args) {
    /*
    uma pessoa que nasces em 1945, hoje possui quantos anos?
    Faça um programa para resolver esse problema
    se a quantidade de anos for menor que 10 então criança senão adulto
    */
    int a = 1945;
    int b = 2019, soma, multi, div, resto, sub;
    sub = b-a;
    int c = sub;
    
    if (c==10)
        {
        System.out.println ("Criança");    
        }
        else
        {
        System.out.println ("Adulto");    
        }
}    
}
