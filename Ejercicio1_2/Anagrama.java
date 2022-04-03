package Ejercicio1_2;
import java.util.Scanner;
import java.util.Arrays;

public class Anagrama {
	
	public Anagrama(){
		
	}
	
	
	public static boolean anagrama(String s1, String s2) {

        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
		
        Arrays.sort(array1);
        Arrays.sort(array2);
        return new String(array1).equals(new String(array2));
    }
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Cadena 1: ");
		String s1 = sc.nextLine();
		System.out.print("Cadena 2: ");
		String s2 = sc.nextLine();
		
		if (anagrama(s1,  s2))
			System.out.println("Es anagrama");
		 else 
		   System.out.println("NO es anagrama") ;
	}
}
