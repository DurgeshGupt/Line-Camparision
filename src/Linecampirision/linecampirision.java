package Linecampirision;
import java.util.Scanner;

public class linecampirision {

        double line1;

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Welcome to get line");
            System.out.println("enter x1 axis");
            int x1 = sc.nextInt();
            System.out.println("enter x2 axis");
            int x2 = sc.nextInt();
            System.out.println("enter y1 axis");
            int y1 = sc.nextInt();
            System.out.println("enter y2 axis");
            int y2 = sc.nextInt();


            double line1 = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

            System.out.println("The length of line is" + line1 );


        }

    }

