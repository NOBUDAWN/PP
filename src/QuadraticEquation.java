import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A, B, C;
        double Dis; //дискриминант прям просит употребить нормальный ООП//
        double route1, route2; //in internet many people in. them declare them in if-else, maube ur mistake//
        System.out.println(" WE WORKS WITH STANDART QUADRATIC EQUATIONS: \n\n ax^2 + bx + c = 0 \n\n PRESS ENTER TO CONTINUE");
        System.out.println("Введите коэффициент A");
        A = scanner.nextDouble();
        System.out.println("Введите коэффициент B");
        B = scanner.nextDouble();
        System.out.println("Введите коэффициент C");
        C = scanner.nextDouble();
        Dis = (B * B) - (4 * A * C);

        if(Dis>0){
            route1 = (-B-Math.sqrt(Dis))/(2*A);
            route2 = (-B+Math.sqrt(Dis))/(2*A);
            System.out.println("ROUTES OF EQUATION \n FIRST:"+route1+"SECOND"+route2); //" SECOND: "+route2//
        }
        else if (Dis==0){
            route1=-B/(2*A);
            System.out.println("ROUTE OF EQUATION: "+route1);
        } else{
            System.out.println("THIS EQUATION HAS NO ROUTES");
        }

    }
}




