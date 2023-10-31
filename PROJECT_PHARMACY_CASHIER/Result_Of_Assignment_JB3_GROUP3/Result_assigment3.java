/**
 * Result_assigment3
 */
import java.util.Scanner;
public class Result_assigment3 {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String nameOfmedic;
            int price, quantity;
            double totalOfmedic, purcahsePrice,totalOfPrice=0;

            System.out.println("Name of Medic:");
            nameOfmedic=sc.nextLine();

            System.out.println("Total medic:");
            totalOfmedic=sc.nextDouble();

            System.out.print("input price :");
            price=sc.nextInt();

            System.out.print("Input quantity :");
            quantity=sc.nextInt();

            totalOfPrice=price*quantity;
            purcahsePrice=totalOfPrice-totalOfmedic;

            System.out.println("Total Price:"+totalOfPrice);
        }
    }
}