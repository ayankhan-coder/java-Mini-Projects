package projects.collection;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Browse_History {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        Scanner sc = new Scanner(System.in);

        history.push("github.com");
        history.push("java docs");
        System.out.println(history);

        int choice = 0;
        String name;

        while (true) {
            System.out.println("1-visitWebsite 2-Back 3-CurrentWebsite\n" +
                    "4-ViewHistory 5-TotalWebsites 6-Exit");
            System.out.println("------------------------------------");

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
                    System.out.print("$ Enter Website Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    history.push(name);
                    System.out.println("~~~~~ "+name+" ~~~~~\n");
                    break;

                case 2:
                    try {

                        if (history.isEmpty()) {
                            System.out.println("~~~~~ History Is Clear ~~~~~\n");
                        } else {
                            history.pop();
                            System.out.println("~~~~~ "+history.peek()+" ~~~~~\n");
                        }
                    }catch (Exception e){
                        System.out.println("~~~~~ History Cleared ~~~~~\n");
                    }
                    break;

                case 3:
                    if (history.isEmpty()) {
                        System.out.println("~~~~~ History Is Clear ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+history.peek()+" ~~~~~\n");
                    }
                    break;

                case 4:
                    if (history.isEmpty()) {
                        System.out.println("~~~~~ History Is Clear ~~~~~\n");
                    }else {
                        for (int i=history.size()-1; i>=0; i--){
                            System.out.println("~~~~~~ "+history.get(i)+ " ~~~~~~\n");
                        }
                    }
                    break;
                case 5:

                    if (history.isEmpty()) {
                        System.out.println("~~~~~ History Is Clear ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+history.size()+" ~~~~~\n");
                    }
                    break;

                case 6 :
                    return;

                default:
                    System.out.println("#$# Please Enter Correct Option Number #$#\n");

            }
        }

    }
}
