package metodos;

public class ANO_BISSEXTO05 {

	
	public static boolean verificarAnoBissexto(int ano) {
       
        return (ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0));
    }

    public static void main(String[] args) {
        int ano = 2020; 
        if (verificarAnoBissexto(ano)) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

