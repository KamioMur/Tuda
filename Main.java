import java.lang.String;
import java.util.Arrays;
public class Main {

    public static void main(String[] args)
    {
        int[] num = { 3,6,1,7,2,8,10,4,9,5};
        String num2 = Arrays.toString(num);
        System.out.println("Исходный массив: " + num2);
        shellSort(num);

        for (int h : num)
            System.out.print(h + " ");
        System.out.print("- отсортированный массив");
    }
    public static void shellSort(int[] numbers){
        int j;
        for( int gap = numbers.length / 2; gap > 0; gap /= 2 ){
            for(int i=gap;i<numbers.length;i++){
                int temp = numbers[i];
                for (j = i; j >= gap && numbers[j - gap] > temp; j -= gap)
                {
                    numbers[j] = numbers[j - gap];
                }
                numbers[j] = temp;
            }   }  
 } }
