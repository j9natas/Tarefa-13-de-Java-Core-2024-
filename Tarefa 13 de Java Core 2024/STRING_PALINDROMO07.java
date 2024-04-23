package metodos;

public class STRING_PALINDROMO07 {
	
	public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        int left = 0;
        int right = str.length() - 1;
        
     
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        
        return true;
    }
    
    public static void main(String[] args) {
        String palavra = "OVO"; 
        if (isPalindrome(palavra)) {
            System.out.println(palavra + " é um palíndromo.");
        } else {
            System.out.println(palavra + " não é um palíndromo.");
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
