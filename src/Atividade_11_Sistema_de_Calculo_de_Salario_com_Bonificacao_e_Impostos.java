import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Atividade_11_Sistema_de_Calculo_de_Salario_com_Bonificacao_e_Impostos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o salario bruto do funcionario: ");
        String salario = sc.next();
        System.out.print("Informe os anos trabalhados do funcionario: ");
        String anosTrabalhados = sc.next();
        anosTrabalhados = anosTrabalhados.replaceAll(",", ".");
        Double salarioDouble = Double.parseDouble(salario);
        Double anosTrabalhadosDouble = Double.parseDouble(anosTrabalhados);
        DecimalFormat df = new DecimalFormat("#.00");
        DecimalFormat df2 = new DecimalFormat("#.0");
        Double salarioComBunus = 0.0;
        Double salarioComImposto = 0.0;
        Double valorSoDoDescontoImposto = 0.0;
        Double valorSoDoDescontoSalario = 0.0;
        String salarioDoubleFormatado = "";
        String valorSoDoDescontoSalarioFormatado = "";
        String anosTrabalhadosDoubleFormatado = "";
        String salarioComBunusFormatado = "";
        String salarioComImpostoFormatado = "";
        String valorSoDoDescontoImpostoFormatado = "";


        if (anosTrabalhadosDouble > 10){
            salarioComBunus=salarioDouble*0.1;
            valorSoDoDescontoSalario=salarioComBunus;
            salarioComBunus=salarioComBunus+salarioDouble;
                if (salarioComBunus >= 5000){
                    salarioComImposto=salarioComBunus*0.27;
                    valorSoDoDescontoImposto=salarioComImposto;
                    salarioComImposto=salarioComBunus-salarioComImposto;
                    salarioDoubleFormatado = df.format(salarioDouble);
                    valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                    anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                    salarioComBunusFormatado = df.format(salarioComBunus);
                    salarioComImpostoFormatado = df.format(salarioComImposto);
                    valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                    System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 10% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 27% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
                } else if (salarioComBunus >= 3000 && salarioComBunus<=4999.99) {
                    salarioComImposto=salarioComBunus*0.18;
                    valorSoDoDescontoImposto=salarioComImposto;
                    salarioComImposto=salarioComBunus-salarioComImposto;
                    salarioDoubleFormatado = df.format(salarioDouble);
                    valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                    anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                    salarioComBunusFormatado = df.format(salarioComBunus);
                    salarioComImpostoFormatado = df.format(salarioComImposto);
                    valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                    System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 10% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 18% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
                } else if (salarioComBunus<3000) {
                    salarioComImposto=salarioComBunus*0.1;
                    valorSoDoDescontoImposto=salarioComImposto;
                    salarioComImposto=salarioComBunus-salarioComImposto;
                    salarioDoubleFormatado = df.format(salarioDouble);
                    valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                    anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                    salarioComBunusFormatado = df.format(salarioComBunus);
                    salarioComImpostoFormatado = df.format(salarioComImposto);
                    valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                    System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 10% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 10% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
                }

        } else if (anosTrabalhadosDouble >= 5 && anosTrabalhadosDouble <=10) {
            salarioComBunus=salarioDouble*0.05;
            valorSoDoDescontoSalario=salarioComBunus;
            salarioComBunus=salarioComBunus+salarioDouble;
            if (salarioComBunus >= 5000){
                salarioComImposto=salarioComBunus*0.27;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 5% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 27% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            } else if (salarioComBunus >= 3000 && salarioComBunus<=4999.99) {
                salarioComImposto=salarioComBunus*0.18;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 5% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 18% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            } else if (salarioComBunus<3000) {
                salarioComImposto=salarioComBunus*0.1;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("O valor bruto do salário foi R$"+salarioDoubleFormatado+" o bônus recebido foi 5% total de R$ "+valorSoDoDescontoSalarioFormatado+" por "+anosTrabalhadosDoubleFormatado+" anos trabalhados e o salario bruto com bônus foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 10% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            }

        } else if (anosTrabalhadosDouble < 5) {
            salarioComBunus=salarioDouble;
            valorSoDoDescontoSalario=salarioComBunus;
            if (salarioComBunus >= 5000){
                salarioComImposto=salarioComBunus*0.27;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("Por ter trabalhado menos de 5 anos não obteve bônus então o salário bruto foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 27% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            } else if (salarioComBunus >= 3000 && salarioComBunus<=4999.99) {
                salarioComImposto=salarioComBunus*0.18;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("Por ter trabalhado menos de 5 anos não obteve bônus então o salario bruto foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 18% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            } else if (salarioComBunus<3000) {
                salarioComImposto=salarioComBunus*0.1;
                valorSoDoDescontoImposto=salarioComImposto;
                salarioComImposto=salarioComBunus-salarioComImposto;
                salarioDoubleFormatado = df.format(salarioDouble);
                valorSoDoDescontoSalarioFormatado = df.format(valorSoDoDescontoSalario);
                anosTrabalhadosDoubleFormatado = df2.format(anosTrabalhadosDouble);
                salarioComBunusFormatado = df.format(salarioComBunus);
                salarioComImpostoFormatado = df.format(salarioComImposto);
                valorSoDoDescontoImpostoFormatado = df.format(valorSoDoDescontoImposto);
                System.out.println("Por ter trabalhado menos de 5 anos não obteve bônus então o salario bruto foi R$"+salarioComBunusFormatado+"\ne o valor liquido foi R$"+salarioComImpostoFormatado+" pois teve um desconto de 10% de imposto sendo o total de imposto R$"+valorSoDoDescontoImpostoFormatado);
            }

        }
    }
}
