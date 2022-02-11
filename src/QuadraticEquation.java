import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        calculation clcl = new calculation();
        System.out.println(" WE WORKS WITH STANDARD QUADRATIC EQUATIONS: \n\n ax^2 + bx + c = 0 \n\n PRESS ENTER TO CONTINUE");
        System.out.println("Enter the value of A:");
        clcl.setA(scanner.nextDouble());
        System.out.println("Enter the value of B:");
        clcl.setB(scanner.nextDouble());
        System.out.println("Enter the value of C:");
        clcl.setC(scanner.nextDouble());
        clcl.calcRoutes();

    }
}

class calculation {
    private double a, b, c;

    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

    void calcRoutes (){
        double dis = (b * b) - (4 * a * c);
        double route1;
        if (dis>0){
            route1 = (-b-Math.sqrt(dis))/(2*a);
            double route2 = (-b + Math.sqrt(dis)) / (2 * a);
            System.out.println("ROUTES OF EQUATION \n FIRST:"+ route1 +"SECOND"+ route2);
        }
        else if (dis==0){
            route1 =-b/(2*a);
            System.out.println("ROUTE OF EQUATION: "+ route1);
        } else{
            System.out.println("THIS EQUATION HAS NO ROUTES");}
    }
}
