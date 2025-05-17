public class Main {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Numeros Primos: ");
        for(int numero : numeros) {
            if(ehPrimo(numero)){
                System.out.println(numero + " ");
            }
        }
    }
    public static boolean ehPrimo(int n){
        if(n <= 1) return false;

        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}