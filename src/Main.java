public class Main {
    public static void main(String[] args) {


        int[] numeros = {1,3,5,7,9};
        boolean temPar = false;

        System.out.println("Numeros pares na lista: ");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println("Numero: " + numero);
                temPar = true;
            }
        }
        if (!temPar){
            System.out.println("Nao ha numeros pares na lista.");
        }
    }
}