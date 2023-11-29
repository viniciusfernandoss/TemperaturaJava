import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.println(" Conversor de Temperatura ");
        System.out.println("--------------------------");

        double f, k, re, ra;

        String sn = "s";
        System.out.print("Escreva a temperatura em celsius: ");
        double c = leia.nextDouble();

        System.out.println("Agora escolha em qual quer converter: ");
        System.out.println("[1] para Fahrenheit\n[2] para Kelvin\n[3] para Réumur\n[4] para Rankine.");
        byte escolha = leia.nextByte();

        switch (escolha) {
            case 1:
                f = c * 1.8 + 32;
                System.out.printf("A temperatura em Fahrenheit é: %.2f", f);
                break;
            case 2:
                k = c + 273.15;
                System.out.printf("A temperatura em Kelvin é: %.3f", k);
                break;
            case 3:
                re = c * 0.8;
                System.out.printf("A temperatura em Réumur é: %.4f", re);
                break;
            case 4:
                ra = c * 1.8 + 32 + 459.67;
                System.out.printf("A temperatura em Rankine é: %.5f", ra);
                break;
            default:
                System.out.println("Você não digitou um número entre 1 e 4!");
        }
    }
}
