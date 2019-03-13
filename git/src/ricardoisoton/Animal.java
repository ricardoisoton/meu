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
public class Animal {
    
    public static void main(String[] args){
        // TODO code application logic here
        
        String tipo = "gato";
        String raca = "vira lata";
        String sexo = "fêmea.";
        String cor = "marrom";
        String tamanho = "médio";
        byte peso = 2;
        String habitat = "casa";
       
        System.out.println("O meu animal é um "+tipo+" de raça "+raca+" e "+sexo);
        System.out.println("Tem a pelagem "+cor+" de tamanho "+tamanho+" pesando "+peso+"Kg.");
        System.out.println ("E seu ambiente é "+habitat);
    }

}