import java.util.Scanner;

public class ICM{
    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese su peso");
        float weight = in.nextFloat();
        System.out.println("Ingrese su estatura");
        float height = in.nextFloat();

        float icm = weight / (height*height);
        System.out.println("Su indice de masa corporal es " + icm);
    }
}