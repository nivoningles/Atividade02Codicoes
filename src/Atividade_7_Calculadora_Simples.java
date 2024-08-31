import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_7_Calculadora_Simples {
    public static void main(String[] args) {
        System.out.print("As operações matemáticas são:\n1.(Adição)\n2.(Subtração)\n3.(Multiplicação)\n4.(Divisão)\nInforme o número ou o nome da operação matemática desejada: ");
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String operacao = sc.next();
        String primeiro ="";
        String segundo ="";
        Double primeiroDouble = 0.0;
        Double segundoDouble = 0.0;
        Double resultado = 0.0;
        String resultadoFormatado ="";
        DecimalFormat df = new DecimalFormat("#,###.00");

        switch (operacao) {
            case "1":
            case "Adição":
            case "adição":
                System.out.println("\nA operação escolhida foi Adição");
                System.out.print("Informe o valor do primeiro número: ");
                primeiro = sc.next();
                primeiro = primeiro.replace(",", ".");
                primeiroDouble = Double.parseDouble(primeiro);
                System.out.print("Informe o valor do segundo número: ");
                segundo = sc.next();
                segundo = segundo.replace(",", ".");
                segundoDouble = Double.parseDouble(segundo);
                resultado = primeiroDouble + segundoDouble;
                System.out.println("Resultado de "+primeiroDouble+" + "+segundoDouble+" ="+ resultado);
                break;
            case "2":
            case "Subtração":
            case "subtração":
                System.out.println("\nA operação escolhida foi Subtração");
                System.out.print("Informe o valor do primeiro número: ");
                primeiro = sc.next();
                primeiro = primeiro.replace(",", ".");
                primeiroDouble = Double.parseDouble(primeiro);
                System.out.print("Informe o valor do segundo número: ");
                segundo = sc.next();
                segundo = segundo.replace(",", ".");
                segundoDouble = Double.parseDouble(segundo);
                resultado = primeiroDouble - segundoDouble;
                System.out.println("Resultado de "+primeiroDouble+" - "+segundoDouble+" =" + resultado);
                break;
            case "3":
            case "Multiplicação":
            case "multiplicação":
                System.out.println("\nA operação escolhida foi Multiplicação");
                System.out.print("Informe o valor do primeiro número: ");
                primeiro = sc.next();
                primeiro = primeiro.replace(",", ".");
                primeiroDouble = Double.parseDouble(primeiro);
                System.out.print("Informe o valor do segundo número: ");
                segundo = sc.next();
                segundo = segundo.replace(",", ".");
                segundoDouble = Double.parseDouble(segundo);
                resultado = primeiroDouble * segundoDouble;
                resultadoFormatado =df.format(resultado);
                System.out.println("Resultado de "+primeiroDouble+" X "+segundoDouble+" =" + resultadoFormatado);
                break;
            case "4":
            case "Divisão":
            case "divisão":
                System.out.println("\nA operação escolhida foi Divisão(A/B)");
                System.out.print("Informe o valor do primeiro número: ");
                primeiro = sc.next();
                primeiro = primeiro.replace(",", ".");
                primeiroDouble = Double.parseDouble(primeiro);
                System.out.print("Informe o valor do segundo número: ");
                segundo = sc.next();
                if (segundo.equals("0")){
                    System.out.println("Informe um valor diferente de ZERO");
                }else{
                    segundo = segundo.replace(",", ".");
                    segundoDouble = Double.parseDouble(segundo);
                    resultado = primeiroDouble / segundoDouble;
                    resultadoFormatado =df.format(resultado);
                    System.out.println("Resultado de "+primeiroDouble+" / "+segundoDouble+" =" + resultadoFormatado);
                }







        }





    }
}
