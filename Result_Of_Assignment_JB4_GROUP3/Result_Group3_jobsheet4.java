/**
 * Result_assigment3
 */
import java.util.Scanner;
public class Result_assigment3 {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in); {
            String nameOfmedic;
            int price, quantity;
            double totalOfmedic, purcahsePrice,totalOfPrice=0;

            System.out.println("Name of Medic:");
            nameOfmedic=input.nextLine();

            System.out.println("Total medic:");
            totalOfmedic=input.nextDouble();

            System.out.print("input price :");
            price=input.nextInt();

            System.out.print("Input quantity :");
            quantity=input.nextInt();

            totalOfPrice=price*quantity;
            purcahsePrice=totalOfPrice-totalOfmedic;

            System.out.println("Total Price:"+totalOfPrice);
        }
    }
}