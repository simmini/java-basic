package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1",15,90);
      /* 1.
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;*/

        //2. initStudent(student1,"학생1",15,90);

        Student student2 = createStudent("학생2",16,80);

        /*System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적: " + student2.grade);*/
        printStudent(student1);
        printStudent(student2);


    }

    static Student createStudent(String name,int age,int grade){
        Student student = new Student();
        student.name=name;
        student.age=age;
        student.grade=grade;
        return student;
    }
    static void printStudent(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
