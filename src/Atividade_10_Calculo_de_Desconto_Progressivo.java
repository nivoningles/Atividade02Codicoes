import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_10_Calculo_de_Desconto_Progressivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o valor total da compra: ");
        String valorTotal = sc.nextLine();
        valorTotal = valorTotal.replace(",", ".");
        Double valorTotalDouble = Double.parseDouble(valorTotal);
        Double valorDoDesconto = 0.0;
        Double valorFinal = 0.0;
        DecimalFormat df = new DecimalFormat("#.00");
        String valorFinalFormatado = "";
        String valorDoDescontoFormatado = "";
        String valorTotalDoubleFormatado = "";

        if (valorTotalDouble > 500) {
            valorDoDesconto = valorTotalDouble * 0.2;
            valorFinal = (valorTotalDouble - valorDoDesconto);
            valorFinalFormatado = df.format(valorFinal);
            valorDoDescontoFormatado = df.format(valorDoDesconto);
            valorTotalDoubleFormatado = df.format(valorTotalDouble);
            System.out.println("O valor da compra total foi R$"+valorTotalDoubleFormatado+" o desconto aplicado a compra foi 20% tendo um valor de desconto de R$"+valorDoDescontoFormatado+", assim sendo o valor final pago com desconto R$"+valorFinalFormatado);
        } else if (valorTotalDouble >= 200 && valorTotalDouble <= 500) {
            valorDoDesconto = valorTotalDouble * 0.1;
            valorFinal = (valorTotalDouble - valorDoDesconto);
            valorFinalFormatado = df.format(valorFinal);
            valorDoDescontoFormatado = df.format(valorDoDesconto);
            valorTotalDoubleFormatado = df.format(valorTotalDouble);
            System.out.println("O valor da compra total foi R$"+valorTotalDoubleFormatado+" o desconto aplicado a compra foi 10% tendo um valor de desconto de R$"+valorDoDescontoFormatado+", assim sendo o valor final pago com desconto R$"+valorFinalFormatado);
        } else if (valorTotalDouble >= 100 && valorTotalDouble <= 199.9) {
            valorDoDesconto = valorTotalDouble * 0.05;
            valorFinal = (valorTotalDouble - valorDoDesconto);
            valorFinalFormatado = df.format(valorFinal);
            valorDoDescontoFormatado = df.format(valorDoDesconto);
            valorTotalDoubleFormatado = df.format(valorTotalDouble);
            System.out.println("O valor da compra total foi R$"+valorTotalDoubleFormatado+" o desconto aplicado a compra foi 5% tendo um valor de desconto de R$"+valorDoDescontoFormatado+", assim sendo o valor final pago com desconto R$"+valorFinalFormatado);
        } else if (valorTotalDouble < 100) {
            valorTotalDoubleFormatado = df.format(valorTotalDouble);
            System.out.println("Pela compra ser um valor abaixo de R$100,00 não obteve desconto sendo assim o valor final e total R$"+valorTotalDoubleFormatado);
        }
    }
}
