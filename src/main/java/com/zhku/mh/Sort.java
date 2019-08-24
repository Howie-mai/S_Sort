package com.zhku.mh;

public class Sort {
    public void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     * 冒泡排序
     * @param arr
     * @return
     */
    public int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]) swap(arr,j,j+1);
            }
        }
        return arr;
    }
}
