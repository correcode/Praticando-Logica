
public class Main {
    public static void main(String[] args) {

        String palavra1 = "casa";
        String palavra2 = "arara";

        System.out.println(palavra1 + " e palindroma ? " + ehPalindromo(palavra1));
        System.out.println(palavra2 + " e palindroma ? " + ehPalindromo(palavra2));

    }
    public static boolean ehPalindromo(String texto) {

        int esquerdo = 0;
        int direito = texto.length() -1;

        while(esquerdo < direito) {
            if(texto.charAt(esquerdo) != texto.charAt(direito)) {
                return false;
            }
            esquerdo++;
            direito--;
        }
        return true;
    }
}