/*
====================================================
Iniciando a programação em Java
====================================================
1/3 - Exibindo Números Pares
====================================================

Desafios
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

Entrada
Você receberá 1 valor inteiro N, onde N > 0.

Saída
Exiba todos os números pares até o valor de entrada, sendo um em cada linha.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
| 6	             | 2                |
|                    | 4                |
|                    | 6                |
-----------------------------------------


SOLUÇÃO ABAIXO: */

import java.util.Scanner;
public class NumerosPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Informe uma número qualquer diferente e maior que 0: ");

            int N = sc.nextInt();
            if (N != 0 && N > 0){
                for (int i = 1; i <= N; i++){
                    if (i%2 == 0){
                        System.out.println(i);
                    }
                }
                System.out.println("Programa finalizado.");
            }else{
                System.out.println("Valor informado menor ou igual que 0.");
            }
        }
    }
}