package gabrielsoares;

import Yan.*;

public class Aula3_2 {
    
    public static void main(String[] args){
        
        String nome = "Yan Vieira Fortes";
        String idade = "19";
        String cpf = "043.780.260-40";
        String tipo = "Corrente";
        String endereco = "Av. José Aloísio Filho 411";
        String agencia = "447";
        
        double depInicial = 500.00;
        double valor = 500.00;
        
        System.out.println("Crie Sua Conta Aqui");
        System.out.println("Nome Completo: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("Tipo de conta: " + tipo);
        System.out.println("Endereço: " + endereco);
        System.out.println("Agencia: " + agencia);
        System.out.println("Seu primeiro depósito é de: " + depInicial);
        System.out.println("Seu saldo:" + valor);
        
        //--------------------------------------------------------------------//
        
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        
        c = 65 ; // O char se converte para um numero inteiro
        
        System.out.println("=============================");
        System.out.println("char");
        System.out.println("=============================");
        System.out.println("valor de c como char = " + c);
        System.out.printf("valor de c como numero = %d\n",(int)c);
        System.out.println("=============================");
        
        b = 10;
        s = b;
        i = s;
        
        System.out.println("=============================");
        System.out.println("inteiros");
        System.out.println("=============================");
        System.out.println("i = s = b = " +i);
        
        i = i * 100;
        System.out.println("novo valor de i = " +i);
        
        b = (byte)i;
        System.out.println("novo valor de b = "+b);
        
        /* Porque o valor é -24?
        Saida de impressão:
        novo valor de b = -24 */
        
        
             
        
        
        
    }
    
}
