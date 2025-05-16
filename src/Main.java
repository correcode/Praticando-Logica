import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double[] notas = new double[6];
        double soma = 0;

        for(int i = 0; i < 6; i++) {
            System.out.println("Digite as notas : " + (i+1) + " :");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }
        double media = soma / 6;
        if(media >= 6) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}