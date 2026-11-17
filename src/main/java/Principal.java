import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medias med = new Medias();

        System.out.println("Digite a N1 do boletin: ");
        double N1 = Double.parseDouble(sc.nextLine());
        med.setN1(N1);
        
        System.out.println("Digite a N2 do boletin: ");
        double N2 = Double.parseDouble(sc.nextLine());
        med.setN2(N2);
        
        System.out.println("Digite a N3 do boletin: ");
        double N3 = Double.parseDouble(sc.nextLine());
        med.setN3(N3);
        

        System.out.println("A Media das suas notas e: " + med.getMedia());
    }
}
