package metodos;

public class NUMERO_PRIMO10 {

	
	
	
	
	public static void main(String[] args) {
        int numero = 19; 
        boolean resultado = ehPrimo(numero);
        if (resultado) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }
    }
    
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

