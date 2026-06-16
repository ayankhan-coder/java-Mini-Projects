package projects;
// PATIENT MANAGEMENT USING PRIORITY QUEUE*/

import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PatientManagement2 {
    public static void main(String[] args) {
        PriorityQueue<String> patient = new PriorityQueue<>();
        Scanner sc = new Scanner(System.in);

        patient.add("3-khan");
        patient.add("1-ayan");
        patient.add("2-ahmed");

        int choice=0;
        int priority;
        String name;

        while (true) {

            System.out.println("1-AddPatient 2-CheckPatient 3-ViewNextPatient\n" +
                    "4-ViewAll 5-TotalPatients 6-Exit");
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
                    System.out.print("Enter Priority : ");
                    priority = sc.nextInt();
                    patient.add(priority+"-"+name);
                    System.out.println("~~~~~ "+priority+"-"+name+" Added ~~~~~\n");
                    break;

                case 2:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Patients ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ Checking Patient : " + patient.poll()+" ~~~~~\n");
                    }
                    break;

                case 3:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Patients ~~~~~\n");
                    }else {
                        System.out.println("~~~~~ "+patient.peek()+" ~~~~~\n");
                    }
                    break;

                case 4:
                    if (patient.isEmpty()){
                        System.out.println("~~~~~ No Patients ~~~~~\n");
                    }else {
                        for (String customers : patient) {
                            System.out.println(customers+"\n");
                        }
                    }
                    break;

                case 5:
                    System.out.println("~~~~~ "+patient.size()+" ~~~~~\n");
                    break;

                case 6:
                    return;

                default:
                    System.out.println("#$# Please Enter Correct Option Number #$#\n");


            }
        }
    }
}
