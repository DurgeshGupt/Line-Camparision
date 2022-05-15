package Linecampirision;
import java.util.Scanner;

public class linecampirision {

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter firstline x1 axis");
            int x1 = sc.nextInt();
            System.out.println("enter firstline x2 axis");
            int x2 =sc.nextInt();
            System.out.println("enter firstline y1 axis");
            int y1 = sc.nextInt();
            System.out.println("enter firstline y2 axis");
            int y2 = sc.nextInt();
            System.out.println("enter secondline x1 axis");
            int a1 = sc.nextInt();
            System.out.println("enter secondline x2 axis");
            int a2 =sc.nextInt();
            System.out.println("enter secondline y1 axis");
            int b1 = sc.nextInt();
            System.out.println("enter secondline y2 axis");
            int b2 = sc.nextInt();

            double line1 = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));

            double line2 = Math.sqrt((a2-a1)*(a2-a1) + (b2-b1)*(b2-b1));

            if(line1 == line2)
            {
                System.out.println("lines are equal");
            }
            else
                System.out.println("lines are not equal");


        }
    }


