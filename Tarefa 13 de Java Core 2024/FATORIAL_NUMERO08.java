package metodos;

public class FATORIAL_NUMERO08 {

	
	public class Fatorial {
	    public static int calcularFatorial(int numero) {
	        if (numero == 0 || numero == 1) {
	            return 1;
	        } else {
	            int resultado = 1;
	            for (int i = 2; i <= numero; i++) {
	                resultado *= i;
	            }
	            return resultado;
	        }
	    }

	    public static void main(String[] args) {
	        int numero = 5; 
	        int fatorial = calcularFatorial(numero);
	        System.out.println("O fatorial de " + numero + " é: " + fatorial);
	    }
	
	
	
	
	
	
	}
}
	
	
	

