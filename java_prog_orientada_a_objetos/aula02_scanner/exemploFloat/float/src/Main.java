import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o valor de n1: ");
        int n1 = ler.nextInt();
        System.out.print("Digite o valor de n2: ");
        int n2 = ler.nextInt();
        System.out.print("Digite o valor de f1: ");
        float f1 = ler.nextFloat();
        System.out.print("Digite o valor de f2: ");
        float f2 = ler.nextFloat();
        System.out.println("Valor digitado para n1: " + n1);
        System.out.println("Valor digitado para n2: " + n2);
        System.out.println("Valor digitado para f1: " + f1);
        System.out.println("Valor digitado para f1: " + f2);
    }
}