package Pedro;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pedro
 */
public class ContaCorrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //*Atributos da classe carro
        double creditos=6;
        double debitos=9;
        double saldo=3;
        String nome_cliente ="Pedro";
        String agencia="3070";
        String conta="164334";
        String cpf_cliente="00928829006";
        System.out.println("CPF do cliente="+cpf_cliente+" ");
        System.out.println("nome do cliente é="+nome_cliente+" ");
        System.out.println("Conta="+conta+" ");
        System.out.println("Agencia="+agencia+" ");
        System.out.println("débitos="+debitos+" ");
        System.out.println("creditos="+creditos+" ");
        System.out.println("Saldo="+saldo+" ");
        boolean bo;
        char c;
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        c=65;
        System.out.println("============");
        System.out.println("char");
        // note a difertença entre a impressãp dad duas linhas abaixo. */
        System.out.println("valor de c como char="+c);
        System.out.printf("Valor de c como numero =%d \n",(byte)c);
        System.out.println("-------------------");
        b=10;
        s=b;
        i=s;
        System.out.println("======================================");
        System.out.println("inteiros");
        System.out.println("=======================================");
        System.out.println("i=s=b="+i);
        i*=100;//i=i*100; */
        System.out.println("novo valor de i="+i);
        b=(byte)i;
        System.out.println("novo valor de b="+b);
        // porque o valor é -24?
        
        
                
    }
    
}
