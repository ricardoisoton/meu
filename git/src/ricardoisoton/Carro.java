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
public class Carro {
    
    public static void main(String[] args){
        // TODO code application logic here

        String marca = "Ford";
        String modelo = "Fusion";
        String cor = "chumbo";
        String combustivel = "flex";
        String situacao = "pago";
        short ano = 2018;
        int quitado = 2019;
        
        System.out.println ("Vendo carro "+marca+"/"+modelo+" de cor "+cor+" ano "+ano);
        System.out.println ("Ipva "+quitado+" está "+situacao+"economico pois é "+combustivel);
        System.out.println ("");
    }
}