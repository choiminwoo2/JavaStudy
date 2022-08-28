package stream;


import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        int[] intArr = {2,1,3};
        Sorts selectionSort = new Sorts();
        IntStream intStream = Arrays.stream(intArr);
        Arrays.stream(intArr).sorted().filter(num -> num == 2).forEach(System.out::print);
        intStream.sorted().filter(i -> i == 2).forEach(System.out::println);
        selectionSort.selectionSort(intArr);
        for(int a : intArr){
            if(a == 2){
                System.out.print(a);
            }
        }
    }
}
class Sorts{
    public void selectionSort(int[] arr){

        for(int i =0; i< arr.length; i++){
            int minIdx = arr[i];
            for(int j = 0; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    minIdx = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;


        }

    }
}
