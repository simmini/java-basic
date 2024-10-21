package access.ex;

public class MaxCount {

    private int count;//클래스에서 기본형은 0으로 초기값가지므로 0으로 초기화안해줘도됨/참조형 타입같은 경우 기본형으로 null
    private int max;

    public MaxCount(int max){
        this.max=max;
    }
    public void increment(){
       //검증로직
        if(max<=count){
           System.out.println("최대값을 초과할 수 없습니다.");
            return;
       }
       //실행로직
       count++;
    }

    public int getCount(){
        return this.count;
    }
}

