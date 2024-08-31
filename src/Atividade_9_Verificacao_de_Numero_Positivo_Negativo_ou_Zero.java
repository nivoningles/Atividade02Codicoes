import java.util.Locale;
import java.util.Scanner;

public class Atividade_9_Verificacao_de_Numero_Positivo_Negativo_ou_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Ver se o número é Positivo, Negativo ou Zero\nInforme um número: ");
        String numero = sc.next();
        numero = numero.replaceAll(",", ".");
        Double numeroDouble = Double.parseDouble(numero);

        if (numeroDouble >0) {
            System.out.println("O número é positivo");
        } else if (numeroDouble < 0) {
            System.out.println("O número é negativo");
        } else if (numeroDouble == 0) {
            System.out.println("O número é ZERO");
        }
    }
}
