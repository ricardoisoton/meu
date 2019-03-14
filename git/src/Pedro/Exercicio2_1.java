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
public class Exercicio2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ano_nascimento=1945,ano_atual=2019,idade=0,diferenca_idade=0,adulto=0,crianca=0,quantidade_macas=10,nota1=6,nota2=7;
        double soma=0,nota3=8.9,media=0;
        idade=ano_atual-ano_nascimento;
        System.out.print("a idade é="+idade+" anos");
        if(idade<=10)
        {
            System.out.print("é criança");
        }
        else
        {
            System.out.print("\n é adulto\n ");
        }
        if(quantidade_macas<12)
        {
            soma= quantidade_macas*1.30;
            
        }
        if(quantidade_macas>=12)
        {
            soma= quantidade_macas*1;
            
        }
        System.out.println(" o preço das maças é"+soma+"");
        media=(nota1+nota2+nota3)/3;
        System.out.println(" a media é"+media+"");
        
    }
    
    
}
