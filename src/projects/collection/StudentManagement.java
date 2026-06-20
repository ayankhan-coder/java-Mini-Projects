package projects.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> students = new ArrayList<>();
        students.add("ayan");
        students.add("ali");
        students.add("ismail");

        int option = 0;

        while (true) {

            System.out.println(
                    "1-AddStudent 2-RemoveStudent 3-FindStudent 4-ViewAllStudents\n" +
                            "5-TotalStudents 6-UpdateStudentName 7-Exit"
            );

            System.out.println("--------------------------------------------------------------------------------");

            System.out.print("$ Enter Your option : ");

            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("~~~~~~ Enter Correct Option Number ~~~~~~\n");
                sc.nextLine();
                continue;

            }

            switch (option) {
                case 1:
                    System.out.println("$ Enter Student name to Add :");
                    sc.nextLine();
                    String addName = sc.nextLine();
                    students.add(addName);
                    System.out.println("~~~~~~ NAME ADDED ~~~~~~\n");
                    break;

                case 2:
                    System.out.println("$ Enter The Name to Delete :");
                    sc.nextLine();
                    String deleteName = sc.nextLine();
                    if (students.contains(deleteName)) {
                        students.remove(deleteName);
                        System.out.println("~~~~~~ NAME DELETED ~~~~~~\n");
                    } else {
                        System.out.println("~~~~~~ Name Does not Exists ~~~~~~\n");
                    }
                    break;

                case 3:
                    System.out.println("$ Enter Name To Search : ");
                    sc.nextLine();
                    String nameSearch = sc.nextLine();
                    boolean search = students.contains(nameSearch);
                    if (search == true) {
                        System.out.println(
                                "~~~~~~ "+nameSearch + " Exists At Positon " +
                                        students.indexOf(nameSearch)+"~~~~~~~"
                        );

                    } else {
                        System.out.println("~~~~~~ "+nameSearch + " Does not Exists"+" ~~~~~~\n");
                    }
                    break;

                case 4:
                    System.out.println("~~~~~~ Students List ~~~~~~");
                    for (String element:students){
                        System.out.println(students.indexOf(element)+". "+element);
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("~~~~~~ "+students.size() + " Students Exists ~~~~~~\n");
                    break;

                case 6:
                    System.out.print("$ Old Student Name : ");
                    sc.nextLine();
                    String oldName = sc.nextLine();
                    System.out.print("$ New Student Name : ");
                    String newName = sc.nextLine();
                    if (students.contains(oldName)) {
                        students.set(
                                students.indexOf(oldName),
                                newName
                        );
                        System.out.println("~~~~~~ UPDATED SUCCESSFUL ~~~~~~\n");
                    } else {
                        System.out.println("~~~~~~ That old name does not exists ~~~~~~\n");
                    }
                    break;

                case 7:
                    return;

                default:
                    System.out.println("~~~~~~ INVALID OPTION ~~~~~~\n");
            }
        }
    }
}
