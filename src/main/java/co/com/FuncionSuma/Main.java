package co.com.FuncionSuma;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        int  Valor1=0  ,Valor2=0 ,resultado=0 ;

        Scanner  teclado = new Scanner(System.in);

        System.out.println("Introduce  el primer  valor"  );

        Valor1 = teclado.nextInt();

        System.out.println("Introduce  el Segundo  valor"  );

        Valor2 = teclado.nextInt();

        resultado = Valor1 + Valor2;

        System.out.println("El resultado es " +  resultado );



    }



}


