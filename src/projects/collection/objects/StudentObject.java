package projects.collection.objects;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    String name;
    int rollNum;
    int marks;

}public class StudentObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "ayan";
        student1.rollNum = 9;
        student1.marks = 85;

        student2.name = "akmal";
        student2.rollNum = 18;
        student2.marks = 55;

        student3.name = "hussain";
        student3.rollNum= 8;
        student3.marks = 90;

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        int option = 0;
        String name;
        int rollNum;
        int marks;

        while (true) {

            System.out.println(
                    "1-AddStudent 2-SearchStudent 3-DeleteStudent 4-UpdateStudent 5-ViewAll 6:TotalStudents 7-Exit\n"
            );

            System.out.println(
                    "--------------------------------------------------------------------------------"
            );

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
                    try {

                        System.out.print("$ Enter projects.collection.objects.Student Name To Add : ");
                        sc.nextLine();
                        name = sc.nextLine();
                        System.out.print("$ Enter projects.collection.objects.Student Age : ");
                        rollNum = sc.nextInt();
                        System.out.print("$ Enter projects.collection.objects.Student Marks : ");
                        marks = sc.nextInt();
                        Student s = new Student();
                        s.name = name;
                        s.rollNum = rollNum;
                        s.marks = marks;
                        students.add(s);
                        System.out.println("~~~~~~ projects.collection.objects.Student Added ~~~~~~\n");
                    }catch (Exception e){
                        System.out.println("~~~~~~ INVALID INFORMATION ~~~~~~\n");
                        sc.nextLine();
                        continue;
                    }
                    break;

                case 2:
                    boolean find = false;
                    System.out.print("Enter projects.collection.objects.Student Name to Search : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    for (Student s : students){
                        if (s.name.equalsIgnoreCase(name)) {
                            System.out.println(
                                    "Name : " + s.name +
                                            " RollNum : " + s.rollNum +
                                            " Marks : " + s.marks + "\n"

                            );
                            find = true;
                            break;
                        }

                    }
                    if (!find){
                        System.out.println("~~~~~~ Name Does not Exists ~~~~~~\n");
                    }
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("$ Enter projects.collection.objects.Student Name to Delete : ");
                    sc.nextLine();
                    name = sc.nextLine();
                    for (int i=0; i<students.size(); i++){
                        if (students.get(i).name.equalsIgnoreCase(name)){
                            students.remove(i);
                            found = true;
                            System.out.println("~~~~~~ projects.collection.objects.Student Deleted ~~~~~~\n");
                        }
                    }
                    if (!found){
                        System.out.println("~~~~~~ Name Does not Exists ~~~~~~\n");
                    }
                    break;

                case 4:
                    boolean flag = false;
                    try {
                        System.out.print("$ Enter projects.collection.objects.Student Name to Update : " );
                        sc.nextLine();
                        name = sc.nextLine();
                        for (Student s : students) {
                            if (s.name.equalsIgnoreCase(name)) {
                                System.out.print("$ Enter New Name : " );
                                name = sc.nextLine();
                                System.out.print("$ Enter rollNum : " );
                                rollNum = sc.nextInt();
                                System.out.println("$ Enter Marks : " );
                                marks = sc.nextInt();
                                s.name = name;
                                s.rollNum = rollNum;
                                s.marks = marks;
                                flag = true;
                                System.out.println("~~~~~~ projects.collection.objects.Student Updated ~~~~~~\n");
                                break;


                            }
                        }

                    }catch (Exception e){
                        System.out.println("~~~~~~ INVALID INFORMATION ~~~~~~\n");
                        sc.nextLine();
                        continue;
                    }
                    if (!flag){
                        System.out.println("~~~~~~ projects.collection.objects.Student DoesNot Exists ~~~~~~\n");

                    }
                    break;

                case 5:
                    for (Student st : students){
                        System.out.println(
                                "Name : " + st.name +
                                        " RollNum : " + st.rollNum +
                                        " Marks : " + st.marks +"\n"
                        );
                    }
                    break;

                case 6:
                    System.out.println("~~~~~~ "+students.size()+" ~~~~~~\n");
                    break;

                case 7:
                    return;

                default:
                    System.out.println("~~~~~~ INVALID OPTION ~~~~~~\n");

            }
        }

    }
}
