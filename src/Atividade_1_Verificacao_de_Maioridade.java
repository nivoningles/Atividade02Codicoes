import java.util.Scanner;

public class Atividade_1_Verificacao_de_Maioridade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = 0;

        System.out.print("Informe sua idade: ");
        idade = sc.nextInt();
        if (idade >= 18) {
            System.out.println("Você é maior de 18 anos");
        }else {
            System.out.println("Você não é maior de 18 anos");
        }



    }
}
