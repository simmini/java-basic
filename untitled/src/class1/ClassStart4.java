package class1;

//배열
public class ClassStart4 {
    public static void main(String[] args) {
        Student student1=new Student();
        student1.name="학생1";
        student1.age=15;
        student1.grade=90;

        Student student2=new Student();
        student2.name="학생2";
        student2.age=16;
        student2.grade=80;

        Student[] students=new Student[2];
        //자바의 대입은 항상 값을 복사하여 전달!!
        //값을 복사하여 전달 -=>인스턴스는 참조값이 들어있으므로 참조값이 복사됨!!!
        students[0]=student1;
        students[1]=student2;
        //배열에 있는 객체 접근
        System.out.println("이름:"+students[0].name+"나이:"+students[0].age+"성적"+students[0].grade);
        System.out.println("이름:"+students[1].name+"나이:"+students[1].age+"성적"+students[1].grade);


    }
}
