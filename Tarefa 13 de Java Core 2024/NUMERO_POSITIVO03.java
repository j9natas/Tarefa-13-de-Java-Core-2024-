package metodos;

public class NUMERO_POSITIVO03 {

	
	
	 public static void main(String[] args) {
	     
	        int numero = -1;
	        String resultado = verificarNumero(numero);
	        System.out.println(resultado);
	    }

	    public static String verificarNumero(int numero) {
	        if (numero > 0) {
	            return "O número é positivo.";
	        } else if (numero < 0) {
	            return "O número é negativo.";
	        } else {
	            return "O número é zero.";
	        }
	    }
	}
	
	
	
	

