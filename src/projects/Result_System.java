package projects;
import java.util.Scanner;

class StudentMarks{

    private String name;
    private long registerNumber;
    private String dateOfBirth;
    private String[] subjects = {
            "English","Hindi","Kannada",
            "Maths","Science","Social"
    };

    private int[] internalMarks = {25,20,20,20,20,20};
    private int[] externalMarks;

    public StudentMarks(String name, long registerNumber,
                        String dateOfBirth, int[] externalMarks) {
        this.name = name;
        this.registerNumber = registerNumber;
        this.dateOfBirth = dateOfBirth;
        this.externalMarks = externalMarks;
    }
    boolean login(long registerNumber,String dateOfBirth){
        return this.registerNumber == registerNumber &&
                this.dateOfBirth.equals(dateOfBirth);
    }

    int calculateTotal(){
        int total = 0;
        for (int i=0;i<subjects.length;i++){
            total += internalMarks[i] + externalMarks[i];
        }
        return total;
    }

    double calculatePercentage(){
        return calculateTotal() / 625d *100;
    }

    boolean isPass(){
        for (int mark : externalMarks){
            if (mark < 35){
                return false;
            }
        }
        return true;
    }

    String calculateGrade(){
        double percentage = calculatePercentage();
        if (percentage >= 90){
            return "A+";
        }
        else if (percentage >= 75) {
            return "A";
        }
        else if (percentage >= 60) {
            return "B";
        }
        else if (percentage >= 50) {
            return "C";
        }
        else {
            return "D";
        }
    }

    void printResult() {
        System.out.println("\n========= STUDENT RESULT =========");
        System.out.println("Name        : " + name);
        System.out.println("Register No : " + registerNumber);
        System.out.println("-----------------------------------------------------");
        System.out.println("Subject\t\tInternal\tExternal\tTotal");

        for (int i = 0; i < subjects.length; i++) {
            int total = internalMarks[i] + externalMarks[i];
            System.out.println(
                    subjects[i] + "\t\t" +
                            internalMarks[i] + "\t\t\t" +
                            externalMarks[i] + "\t\t\t" +
                            total
            );
        }
        System.out.println("-----------------------------------------------------");
        System.out.println("TOTAL MARKS\t\t" + calculateTotal());
        System.out.println("Percentage\t\t" + calculatePercentage());
        System.out.println("Grade\t\t\t" + calculateGrade());
    }
}
public class Result_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] externalMarks = {94, 44, 67, 46, 50, 77};
        StudentMarks studentMarks = new StudentMarks(
                "Ayan",
                9620,
                "10",
                externalMarks);
        System.out.println("ENTER STUDENT DETAILS TO SEE RESULT");

        System.out.print("Enter Register Number : ");
        long regNum = sc.nextLong();

        sc.nextLine();

        System.out.print("Enter Date Of Birth : ");
        String dob = sc.nextLine();

        if (studentMarks.login(regNum, dob)) {

            studentMarks.printResult();

        } else {

            System.out.println("Incorrect Information");
        }
    }
}
