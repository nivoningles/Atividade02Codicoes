import java.util.Scanner;

public class Atividade_3_Par_ou_Impar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer numero = 0;
        System.out.print("Informe o numero para verificação: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero é Par");
        }else{
            System.out.println("O numero é Impar");
        }



    }
}
