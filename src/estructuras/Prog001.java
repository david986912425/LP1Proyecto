
package estructuras;

import java.util.Scanner;

public class Prog001 {
    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int numero;
    System.out.print("numero: ");
    numero = Integer.valueOf(teclado.nextLine());
    if(numero%2==0){
        System.out.println("es par");
    }else{
        System.out.println("es impar");
    }
    teclado.close();
}
}
