package static2.ex;

public class MathArrayUtils {

    public static int max(int[] values) {
        int max=values[0];
        for (int i=1;i<values.length;i++){
            if(values[i]>max){
                max=values[i];
            }
        }
        return max;


    }

    public static int min(int[] values) {
        int min=values[0];
        for (int i=1;i<values.length;i++){
            if(values[i]<min){
                min=values[i];
            }
        }
        return min;

    }

    public static double average(int[] values) {

        return (double) sum(values)/values.length;
    }

    public static int sum(int[] values) {
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];
        }
        return sum;
    }

}
