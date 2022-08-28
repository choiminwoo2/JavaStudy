package extendsStudy.algo;

import java.util.ArrayList;

public class MergeMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,10,15};
        int[] arr2 = new int[]{2,4,9,100};
        Merge merge = new Merge();
        int[] result = merge.combineMerge(arr1,arr2);
        for(int a :result ){
            System.out.println(a);
        }
    }
}

class Merge {
   private int[] arr;

    public Merge(int[] arr) {
        this.arr = arr;
    }
    public Merge() {
    }
    public void devideMerge(){

    }
    public int[] combineMerge(int[] arr1,int[] arr2){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arrayList = new int[(arr1.length + arr2.length)];
        while(i < arr1.length && j <arr2.length){
                if(arr1[i] > arr2[j] ){
                    arrayList[index]= arr2[j];
                    j++;
                }else{
                    arrayList[index] = arr1[i];
                    i++;
                }
                index++;
        }
        while(i < arr1.length){
            arrayList[index] = arr1[i];
            i++;
            index++;
        }
        while(j < arr2.length){
            arrayList[index] = arr2[j];
            j++;
            index++;
        }
        return arrayList;
    }
}
