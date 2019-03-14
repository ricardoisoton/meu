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
public class Exercicio5_Aula4 {
    public static void main (String[]args){
        float n1 = 6f;
        float n2 = 7f;
        float n3 = 8.9f;
        float media = 0f;
        media = n1+n2+n3/3;
        if (media<7) {
            System.out.println("Aluno reprovado, sua média foi: "+media);
        } else {
            System.out.println("Aluno aprovado, sua média foi: "+media);
        }
        
    }
}
