package Ejercicio1_3;
    
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class Cifrado {
    
    private static String cifrar(String texto, String clave) {
        String cifrado = "";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] Array_texto = texto.toCharArray();
        for (char a : Array_texto) {
            int pos = abc.indexOf(a);
            cifrado += clave.charAt(pos);
        }
         // Opción PRO
        String cifrado2 = "";
        List<String> List_abc = Arrays.asList(abc.split(""));
        List<String> List_texto = Arrays.asList(texto.split(""));
        List<String> List_clave = Arrays.asList(clave.split(""));
        for (String a : List_texto) {
            int pos1 = List_abc.indexOf(a);
            cifrado2 += List_clave.get(pos1);    
        } 
        return cifrado;
    }

    public static void main(String args[]){
        String palabra_cifrada = cifrar("abade","zaxbycmmmmmmmmmmmmmmmmmmmm");
        System.out.println(palabra_cifrada);
    }
}
