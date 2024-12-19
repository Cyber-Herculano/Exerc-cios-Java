
package exercicio.estruturasequencial;

import java.util.Scanner;


public class EstruturaSequencial {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int valor1 , valor2 , soma;
        System.out.println("digite o valor 1");
        valor1 = sc.nextInt();
        System.out.println("digite o valor 2");
        valor2 = sc.nextInt();
        soma = valor1 + valor2;
        System.err.println("A soma dos valores 1 e 2 é" + soma );
    
    
        sc.close();
    }
}
