package metodos;

public class VERIFICAR01 {

	
	 public static boolean verificarParidade(int numero) {
	        if (numero % 2 == 0) {
	            return true; 
	        } else {
	            return false; 
	        }
	    }
	
	
	
	 public static void main(String[] args) {
	        int numero = 6;
	        if (verificarParidade(numero)) {
	            System.out.println(numero + " é par.");
	        } else {
	            System.out.println(numero + " é ímpar.");
	        }
	    }
	}
	
	
	
