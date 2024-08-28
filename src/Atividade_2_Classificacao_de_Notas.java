import java.util.Locale;
import java.util.Scanner;

public class Atividade_2_Classificacao_de_Notas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe a nota do Aluno: ");
        Double nota = 0.0;
        nota = sc.nextDouble();

        if (nota >= 9.){
            System.out.println("Nota Exelente");
        }else if (nota >= 7.){
            System.out.println("Nota Boa");
        }else if (nota >= 5.){
            System.out.println("Nota Satisfatória");
        }else if (nota < 5.){
            System.out.println("Nota Insatisfatoria");
        }



    }
}
