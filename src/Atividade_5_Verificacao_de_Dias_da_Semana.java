import java.util.Scanner;

public class Atividade_5_Verificacao_de_Dias_da_Semana {
    public static void main(String[] args) {

        System.out.print("\nInforme um numero de 1 a 7 para saber qual numero corresponde a cada dia da samena: ");
        Scanner sc = new Scanner(System.in);
        Integer diaDaSemana = sc.nextInt();

        switch (diaDaSemana) {

            case 1:
                System.out.println("Dia da senama é Domingo");
                break;
            case 2:
                System.out.println("Dia da semana é Segunda-Feira");
                break;
            case 3:
                System.out.println("Dia da semana é Terça-Feira");
                break;
            case 4:
                System.out.println("Dia da semana é Quarta-Feira");
                break;
            case 5:
                System.out.println("Dia da semana é Quinta-Feira");
                break;
            case 6:
                System.out.println("Dia da semana é Sexta-Feira");
                break;
            case 7:
                System.out.println("Dia da semana é Sabado");
                break;
            default:
                System.out.println("Número digita é incorreto");


        }

    }
}
