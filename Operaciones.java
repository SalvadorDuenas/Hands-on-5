package SimpleRegresion;

import java.util.Scanner;
//SE DEFINES
public class Operaciones implements Interfaz {

    private double[][] x;
    private double[][] y;

    public Operaciones() {


        this.x = new double[3][17];
        this.y = new double[17][3];

    }


    public void Inicio() {
    x[1][1]= 41.9;
    x[1][2]= 43.3;
    }

    @Override
    public void Operandos() {
        Scanner sc = new Scanner(System.in);
        double Sumxi = 0.0;
        double Sumyi = 0.0;
        double Sumxy = 0.0;
        double Sumx2 = 0.0;
        double Promy = 0.0;
        double Promx = 0.0;
        double Beta0;
        double Beta1;
        double resultado;
        double f;


        Beta1 = (((n * Sumxy) - (Sumxi * Sumyi)) / (( * Sumx2) - (Sumxi * Sumxi)));
        Beta0 = (Promy - (Beta1 * Promx));
        
        System.out.println("Beta 1 es igual a:"+ Beta1 +"\n");
        System.out.println("Beta 0 es igual a:"+ Beta0 +"\n");
        
        System.out.println("Favor de ingresar un valor de X a calcular");
        f=sc.nextDouble();
        resultado=((Beta1*f)+Beta0);
        System.out.println("\nEl valor de Y en relacion a X es :"+resultado+"\n"); 
    }

}
