import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Digite a quantidade de metros para a conversão: ");
            float metros = sc.nextFloat();
            float centímetros = metros * 100;
            System.out.printf("%.1f cm",centímetros);
        }
    }
}
