import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n1, n2;
        float f1, f2;
        Scanner ler;
        ler = new Scanner(System.in);
        //Scanner ler = new Scanner(System.in)

        System.out.println("Digite o valor de n1: ");
        n1 = ler.nextInt();
        System.out.println("Digite o valor de n2: ");
        n2 = ler.nextInt();

        System.out.println("Digite o valor de f1: ");
        f1 = ler.nextFloat();

        System.out.println("Digite o valor de f2: ");
        f2 = ler.nextFloat();

        // CTRL + d (ele duplica linha)
        System.out.println("Valor digitado para n1: " + n1);
        System.out.println("Valor digitado para n2: " + n2);

        System.out.println("Valor digitado para f1: " + f1);
        System.out.println("Valor digitado para f1: " + f2);
    }

}
