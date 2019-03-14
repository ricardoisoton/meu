package Yan;

public class Aula04Ex3 {
    
    public static void main(String[] args) {
        
        int a = 2019;
        int b = 1945;
        int c = a - b;
        
        if(10 == c){
            System.out.println("É Criança");
        }else{
            System.out.println("É Adulto");
        }
        
        System.out.println("Hoje a pessoa possui: " + c + " anos.");
        
        System.out.println("--------------------------------------");
        
        double a1 = 1.30;
        double a2 = 1.00;
        double a3 = 10.0;
        
        System.out.println("Custo total das compras foi: R$" + a1 * a3);
        
        double n1 = 6.0;
        double n2 = 7.0;
        double n3 = 8.9;
        
        double result = (n1 + n2 + n3) / 3;
        
        System.out.println("Sua média foi de" + result);
        
        if(result == result){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        
        
       
    }
    
}
