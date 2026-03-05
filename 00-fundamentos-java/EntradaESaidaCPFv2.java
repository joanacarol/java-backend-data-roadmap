//Observado a solução do DIDIFIVE, verifiquei que a versão 1 está com uma solução muito manual e aprendi novos metódos para o problema usando split
package CPF;
import java.util.Scanner;
public class EntradaESaidaCPFv2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] cpf = sc.nextLine().split("[.-]");
        for(int i = 0; i < 4; i++){
            System.out.println(cpf[i]);
        }
    }
}
/*Exeplicando SPLIT
String[] cpf = sc.nextLine().split("[.-]");
1.Por que tem "[]" depois de STRING?
    Por que a saída é em vetores. CPF não é apenas uma string, após o split. Ele é separado em vetores.
    Todo dado em vetores deve ser declado com [] após assumir seu tipo (INT, STRING, DOUBLE,...)
    Visualmente ficaria assim -> CPF = [XXX, YYY, ZZZ, DD]
                                      [0], [1], [2], [3]*
2.entra o valor (nextLine), separa por caracteres os valores em vetores (split("[carac]")
 */
