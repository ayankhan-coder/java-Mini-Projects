package projects.collection;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ContactBook_HashMap {
    public static void main(String[] args) {
        HashMap<String ,String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        String name;
        String number;

        map.put("ayan","9620147892");
        map.put("ahmed","4520147892");
        map.put("khan","8450147892");

        while (true) {
            System.out.println("1-addContact 2-SearchContact 3-Delete 4-ViewAllContacts 5-Exit");
            System.out.println("--------------------------------------------------");

            System.out.print("$ Enter Option Number : ");

            try {
                option = sc.nextInt();

            }catch (InputMismatchException e){
                System.out.println("Please Enter Correct Option Number\n");
                sc.nextLine();
                continue;
            }

            switch (option) {

                case 1:
                    System.out.print("$ Enter Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("$ Enter Number : ");
                    number = sc.nextLine();
                    if (map.containsKey(name)){
                        System.out.println("~~~~~~ Contact Already Exists ~~~~~~\n");
                    }else {
                        map.put(name, number);
                        System.out.println("~~~~~~ Contact Added ~~~~~~\n");
                    }
                    break;

                case 2:
                    System.out.print("$ Enter Name to Search : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    if (map.containsKey(name)) {
                        System.out.println(name + " -> " + map.get(name)+"\n");
                    } else {
                        System.out.println("~~~~~~ Contact Does not Exists ~~~~~~\n");
                    }
                    break;

                case 3:
                    System.out.print("$ Enter Name to Delete : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    if (map.containsKey(name)){
                        map.remove(name);
                        System.out.println("~~~~~~ Contact Deleted ~~~~~~\n");
                    }else {
                        System.out.println("~~~~~~ Contact Does not Exits ~~~~~~\n");
                    }
                    break;

                case 4:
                    if (map.isEmpty()){
                        System.out.println("~~~~~~ No Contacts Found ~~~~~~\n");
                    }else {
                        for (Map.Entry<String, String> e : map.entrySet()) {
                            System.out.println(e.getKey() + " -> " + e.getValue());
                        }
                        System.out.println();
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("~~~~~~ Invalid Option Number ~~~~~~\n");

            }
        }

    }
}
