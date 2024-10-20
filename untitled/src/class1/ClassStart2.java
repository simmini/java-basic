package class1;


//베열
public class ClassStart2 {
    public static void main(String[] args) {
        String []student1Name={"학생1","학생2"};
        int []student1Age={15,16};
        int []student1Grade={90,80};

        for(int i=0;i<student1Name.length;i++){
            System.out.println("이름:"+student1Name[i]+"나이:"+student1Age[i]+"성적"+student1Grade[i]);
        }

    }

}