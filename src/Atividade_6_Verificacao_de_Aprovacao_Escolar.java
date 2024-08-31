import java.util.Locale;
import java.util.Scanner;

public class Atividade_6_Verificacao_de_Aprovacao_Escolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informar a nota do aluno: ");
        String entrada = sc.next();
        entrada = entrada.replace(",", ".");

        Double notaDoAluno = Double.parseDouble(entrada);
        
        if (notaDoAluno >= 7) {
            System.out.println("Aprovado");
        } else if (notaDoAluno >= 5 && notaDoAluno<7) {
            System.out.println("Está de Recuperação");
        } else if (notaDoAluno < 5 ) {
            System.out.println("Aluno esta Reprovado");
        }

    }
}
