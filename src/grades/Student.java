package grades;
import java.util.ArrayList;

public class Student {

    public static void main(String[] args) {
       Student student1 = new Student("Johnny");
       student1.addGrade(90);
       student1.addGrade(80);
       student1.addGrade(95);
        Student student2 = new Student("Ryan");
        student2.addGrade(90);
        student2.addGrade(70);
        student2.addGrade(85);
        Student student3 = new Student("George");
        student3.addGrade(88);
        student3.addGrade(95);
        student3.addGrade(70);
        Student student4 = new Student("Chris");
        student4.addGrade(95);
        student4.addGrade(83);
        student4.addGrade(86);


        System.out.println(student1.getName());
        System.out.println(student1.getGradeAverage());

    }

// --------PROPERTIES--------
    public String studentName;
    public ArrayList<Integer> grades;



//    -----STUDENT CONSTRUCTOR--------
    public Student(String name){
        this.studentName = name;
        this.grades = new ArrayList<>();
    }

//---------GETTERS AND SETTERS------------
    // returns the student's name
    public String getName() {
        return this.studentName;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
//------------CALCULATES GRADE AVG--------------
    // returns the average of the students grades
    public double getGradeAverage() {
        double sum = 0;
        for (double i : grades) {
            sum += i;

        }
        return sum / grades.size();
    }

}
