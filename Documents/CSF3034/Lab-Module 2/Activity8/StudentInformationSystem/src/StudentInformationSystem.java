public class StudentInformationSystem {

    public static void main(String[] args) {

        String studentName = "Akeil Hadif Bin Khairul Anuar";
        String studentID = "S85720";

        int mark1 = 95;
        int mark2 = 99;

        int total = mark1 + mark2;

        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentID);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Marks: " + total);
        if(total >= 100){
    System.out.println("Result: PASS");
}
else{
    System.out.println("Result: FAIL");
}
    }
}