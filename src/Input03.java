
import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        
        //Find and print the sum of three integers entered by the user
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o primeiro numero:");
        int    n1 = sc.nextInt();
        System.out.println("Digite o primeiro numero:");
        int    n2 = sc.nextInt();
        System.out.println("Digite o primeiro numero:");
        int    n3 = sc.nextInt();
        System.out.println("A soma dos números é igual a:" + (n1+n2+n3));
        sc.close();
        //Remember to close the Scanner
        
    }
}
