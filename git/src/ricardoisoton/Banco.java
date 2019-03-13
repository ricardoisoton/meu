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
public class Banco {
    public static void main(String[] args){
        // TODO code application logic here

        String cliente = "Luis Carlos";
        String agencia = "0454";
        long conta = 77198;
        byte verificador = 0;
        double valor = 200.50;
        String situacao = "depositado";
        
        System.out.println ("Cliente: "+cliente);
        System.out.println ("Agencia: "+agencia);
        System.out.println ("Conta Poupança: "+conta+"-"+verificador);
        System.out.println ("Valor a ser depositado: R$ "+valor);
        System.out.println ("Status: "+situacao);
    }
}
