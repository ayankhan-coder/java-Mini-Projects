package projects;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PatientManagment {
    public static void main(String[] args) {

        Deque<String> patient = new ArrayDeque<>();
        Scanner sc = new Scanner(System.in);

        int choice=0;
        String name;

        while (true) {

            System.out.println("1-AddNormalPatient 2-AddEmergencyPatient 3-CheckPatient\n" +
                    "4-ViewNextPatient 5-ViewAll 6-TotalPatients 7-Exit");
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
                    System.out.print("Enter Patient Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    patient.addLast(name);
                    System.out.println("~~~~~ "+name+" Added ~~~~~\n");
                    break;

                case 2:
                    System.out.print("Enter Patient Name : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    patient.addFirst(name);
                    System.out.println("~~~~~ "+name+" Added ~~~~~\n");
                    break;

                case 3:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Patients ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ Checking Patient : " + patient.poll()+" ~~~~~\n");
                    }
                    break;

                case 4:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Customers ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+patient.peek()+" ~~~~~\n");
                    }
                    break;

                case 5:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Patients ~~~~~\n");
                    }else {
                        for (String customers : patient) {
                            System.out.println(customers+"\n");
                        }
                    }
                    break;

                case 6 :
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ "+patient.size()+" ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+patient.size()+" ~~~~~\n");
                    }
                    break;

                case 7:
                    return;

                default:
                    System.out.println("#$# Please Enter Correct Option Number #$#\n");

            }
        }
    }
}
