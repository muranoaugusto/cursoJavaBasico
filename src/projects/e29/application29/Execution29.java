package projects.e29.application29;
import java.util.Scanner;

public class Execution29 {

    int intN1, intN2;
    double doubleN1;

        
    public void setNumbersInt() {

        Scanner scNI = new Scanner(System.in);
    
        System.out.println("Insira o primeiro valor:");
        intN1 = scNI.nextInt();
        System.out.println("Insira o segundo valor:");
        intN2 = scNI.nextInt();
        scNI.close();
        }

        public int getNumbersIntN1() {

        return intN1;
    
        }

        public int getNumbersIntN2() {

        return intN2;
    
        }


        public void setNumbersDouble() {

        Scanner scND = new Scanner(System.in);
    
        System.out.println("Insira o raio do círculo:");
        doubleN1 = scND.nextDouble();
        scND.close();
        }

        public double getNumbersDouble1() {

        return doubleN1;
    
        }
}
