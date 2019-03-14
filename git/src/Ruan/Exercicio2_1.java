/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ruan;

/**
 *
 * @author 19121005
 */
public class Exercicio2_1 {
    public static void main(String[] args) {
        // Exercicio para calcular a idade atual com nascimento em 1945
        int ano=2019,nascimento=1945;
        int idade = ano - nascimento;
        System.out.println("Você Possui: " +idade+" anos.");
        
        // Exercicio para definir se voce é criança ou não
        if (idade <= 10) {
            System.out.println("Você é uma criança");
        }
        else{
            System.out.println("Você é um adulto");
        }
        
        /* Exercicio das maças : 2) As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, 
        e R$ 1,00 se forem compradas pelo menos 12. A Ana comprou 10, qual o custo total da compra? */
         int macas = 10;
         double valor = 1.30;
         double total = macas * valor;
         System.out.println("Ana comprou 10 maças no valor total de R$"+total);
         
         /*3)Um aluno teve as seguintes notas n1=6, n2=7 e n3=8.9. Para passar de ano, 
            a nota do semestre precisa ser maior ou igual a 7. Qual a média deste aluno? */
         
         double n1=6,n2=7,n3=8.9;
         double media = (n1+ n2+n3)/3;
         if (media >= 7) {
            System.out.println("Você passou de ano :D .Sua média é:"+media);
        }
         else{
             System.out.println("Você está reprovado:(");
         }
        
    }
}
