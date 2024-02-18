import java.util.Scanner;

public class BodyMassIndexCalculator{
   static float height;
   static  float weight;
   static float icm;
    public static void ReadWeightAndHeight(){ 
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese su peso: ");
         weight = in.nextFloat();
        System.out.print("Ingrese su estatura: ");
         height = in.nextFloat();
    }
        public static  void CalculateBodyMassindex(){
         icm = weight / (height*height);
        }
         public static  void ShowBodyMassIndex(){  
            System.out.println(  " Su indice de masa corporal es " + icm  );
           
         }
}