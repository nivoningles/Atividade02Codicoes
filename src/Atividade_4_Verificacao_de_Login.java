import java.util.Scanner;

public class Atividade_4_Verificacao_de_Login {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = "Nivon Ingles";
        String senha = "123456a";

        String nomeverific ="";
        String senhaverific ="";

        System.out.print("Informe Seu Nome: ");
        nomeverific = sc.nextLine();
        System.out.print("Informe Sua Senha: ");
        senhaverific = sc.nextLine();

        if (nomeverific.equals(nome) && senhaverific.equals(senha)) {
            System.out.println("Você esta liberado");
        }else{
            System.out.println("Usuario ou senha errado");
        }

        sc.close();


    }
}
