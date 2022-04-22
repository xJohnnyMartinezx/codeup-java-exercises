package grades;

import util.Input;

import java.util.HashMap;

import java.util.Objects;


public class GradesApplication {

    //    ---------MAIN METHOD---------
    public static void main(String[] args) {


        HashMap<String, Double> students = new HashMap<>();
//        HashMap<String, Student> students = new HashMap<>();


        Student student1 = new Student("Johnny");
//        System.out.println(student1.getName());
        student1.addGrade(90);
        student1.addGrade(80);
        student1.addGrade(95);

        Student student2 = new Student("Ryan");
        student2.addGrade(70);
        student2.addGrade(85);
        student2.addGrade(63);

        Student student3 = new Student("George");
        student3.addGrade(89);
        student3.addGrade(45);
        student3.addGrade(52);

        Student student4 = new Student("Chris");
        student4.addGrade(85);
        student4.addGrade(76);
        student4.addGrade(88);

//        String student1gh = "jusername";
//        students.put(student1gh, student1);
//
//        students.get(student1gh).getGradeAverage();


        students.put("jusername", student1.getGradeAverage());
        students.put("ryusername", student2.getGradeAverage());
        students.put("geousername", student3.getGradeAverage());
        students.put("chrisusername", student4.getGradeAverage());

        System.out.println(students);


        Input userSelection = new Input();
//        int num;

//        do {

            System.out.println("Please enter a username from the list below...\n jusername || ryusername || geousername || chrisusername");


        String userInput = userSelection.scanner.next();

//            String sName = student1.getName();


            students.forEach((key, value) -> {
                if (Objects.equals(userInput, key)) {
                    System.out.println("UserName: " + key + "\n" + "Grade: " + value);
                }
            });
            for (int i = 0; i < students.size(); i++) {
                students.forEach((key, value) -> {
                    if (!Objects.equals(userInput, key)) {
                        System.out.println("User not found");
                    }
                });

        }
    }
}


