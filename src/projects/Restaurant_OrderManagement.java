package projects;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Restaurant_OrderManagement {
    public static void main(String[] args) {
        Queue<String> customer = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int choice=0;
        String name;

        customer.add("Anil");
        customer.add("Rakesh");

        while (true) {

            System.out.println("1-TakeOrder 2-ServeCustomer 3-ViewNext 4-ViewAll 5-ViewTotal 6-Exit");
            System.out.println("-------------------------------------------------------------------");
            System.out.print("$ Enter The Option Number : ");

            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("#$# Please Enter Correct Option Number #$#\n");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("$ Enter Customer Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    customer.add(name);
                    System.out.println("~~~~~ Order Taken Successful ~~~~~\n");
                    break;

                case 2:
                    if (customer.isEmpty()){
                        System.out.println("~~~~~ No Customers ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ Serving Order To : " + customer.poll()+" ~~~~~\n");
                    }
                    break;

                case 3:
                    if (customer.isEmpty()){
                        System.out.println("~~~~~ No Customers ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+customer.peek()+" ~~~~~\n");
                    }
                    break;

                case 4:
                    if (customer.isEmpty()){
                        System.out.println("~~~~~ No Customers ~~~~~\n");
                    }else {
                        for (String customers : customer) {
                            System.out.println(customers+"\n");
                        }
                    }
                    break;

                case 5:
                    System.out.println(customer.size()+"\n");
                    break;

                case 6:
                    return;

                default:
                    System.out.println("#$# Please Enter Correct Option Number #$#\n");

            }
        }

    }
}
