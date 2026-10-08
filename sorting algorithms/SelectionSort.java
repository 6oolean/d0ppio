import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args){
        int[] a = {9,6,7,8,9,0,5,4,3,3,3,1,2};
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a){
        for(int i=0; i<a.length; i++){
            int minIndex = i;
            for(int j=i+1; j<a.length; j++){
                if(a[j] < a[minIndex])
                    minIndex = j;
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
}