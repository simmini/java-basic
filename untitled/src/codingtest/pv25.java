package codingtest;

public class pv25 {
    //옹알이
    public static  int solution(String[] babbling) {
        int answer = 0;
        String str[]={"aya", "ye", "woo", "ma"};
//동일한거 있어 그걸 지워
        for(int i=0;i<babbling.length;i++){

                if(babbling[i].contains("ayaaya")||babbling[i].contains("yeye")
                        ||babbling[i].contains("woowoo")||babbling[i].contains("mama")){
                    continue;
                }
                babbling[i]=babbling[i].replace("aya","");
                babbling[i]=babbling[i].replace("ye","");
                babbling[i]=babbling[i].replace("woo","");
                babbling[i]=babbling[i].replace("ma","");

            if(babbling[i].trim().length()==0){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
       String str[]= {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

       int a =solution(str);
        System.out.println("a = " + a);

    }
}
