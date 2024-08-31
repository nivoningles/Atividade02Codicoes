import java.util.Locale;
import java.util.Scanner;

public class Atividade_8_Classificacao_de_Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o valor da temperatura em Gruas Celsius: ");
        String temperatuera = sc.nextLine();
        Double temperaturaDouble= Double.parseDouble(temperatuera);

        if (temperaturaDouble > 30){
            System.out.println("Temperatura está Quente");
        } else if (temperaturaDouble >= 15 && temperaturaDouble <= 30) {
            System.out.println("Temperatura está Agradável");
        } else if (temperaturaDouble < 15) {
            System.out.println("Temperatura está Fria");
        }

    }
}
