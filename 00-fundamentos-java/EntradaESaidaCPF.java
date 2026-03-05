package CPF;/*
====================================================
Iniciando a programação em Java
====================================================
2/3 - Entrada e Saída CPF
====================================================

Desafio
Elabore um programa que possuas as características abaixo:
- Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
- Imprima os quatro grupos numéricos, sendo um valor por linha.

Entrada
A entrada consiste vários arquivos de teste e cada um possuindo uma linha com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD são números inteiros.

Saída
Para cada arquivo da entrada, tem que ter um arquivo de saída com quatro linhas, e em cada linha um número inteiro de acordo com procedimento 2 descrito no Desafio. Confira o exemplo abaixo:

--------------------------------------------
| Exemplos de Entrada  | Exemplos de Saída |
| 000.000.000-00       | 000               |
|                      | 000               |
|                      | 000               |
|                      | 00                |
--------------------------------------------

--------------------------------------------
| Exemplos de Entrada  | Exemplos de Saída |
| 320.025.102-01       | 320               |
|                      | 025               |
|                      | 102               |
|                      | 01                |
--------------------------------------------


SOLUÇÃO ABAIXO: */
import java.util.Scanner;
public class EntradaESaidaCPF {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       String CPF, s1, s2, s3, s4;
       System.out.println("Informe o CPF no formato XXX.YYY.ZZZ-DD:");
       CPF = sc.next();
       s1 = CPF.substring(0, 3);
       s2 = CPF.substring(4,7);
       s3 = CPF.substring(8,11);
       s4 = CPF.substring(12,14);
       System.out.println(s1);
       System.out.println(s2);
       System.out.println(s3);
       System.out.println(s4);
    }
}
/* Usando o substring é muito manual. O uso do split facilita essa separação, veja a versão 2 explicada*/