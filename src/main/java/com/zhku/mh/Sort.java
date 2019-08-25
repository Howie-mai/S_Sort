package com.zhku.mh;

public class Sort {
    public void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    /**
     * 冒泡排序
     * 最佳情况：T(n) = O(n)   最差情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     * @param arr
     * @return
     */
    public int[] bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]) swap(arr,j,j+1);
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * 每趟选出无序区的最小，与无序区的第一位进行交换
     * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
     * @param arr
     * @return
     */
    public int[] selectionSort(int arr[]){
        for (int i=0;i<arr.length;i++){
            int index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index]) index=j;
            }
            swap(arr,i,index);
        }
        return arr;
    }

    public int[] insertionSore(int arr[]){
        int current,index;
        for(int i=0;i<arr.length-1;i++){
            current=arr[i+1]; //需要比较后插入的值
            index=i;//用于跟current比较的值的下标 （排序好的区域的最大下标）
            while(index>=0 && arr[index]>current){
                arr[index+1]=arr[index]; //数组的值往后移动，留出一个空位让current插入
                index--; // 寻找插入的位置
            }
            arr[index+1]=current;// 在比current小的值后面插入current
        }
        return arr;
    }

    /**
     * 希尔排序
     * 优先比较较远的数据
     * @param arr
     * @return
     */
    public int[] ShellSort(int arr[]){
        int len=arr.length;
        int temp,gap=len/2; //初始增量
        while (gap>0){
            for(int i=gap;i<len;i++){ //若长度为10 则可以分为5组 按下标为0，5 1，6...分组来比较
                temp=arr[i]; //获取较远的数据值
                int index=i-gap; //让下标对应 gap=后下标-前下标
                while (index>=0 && arr[index]>temp){
                    arr[index+gap]=arr[index];  //把大数的值往后调
                    index-=gap;// 交换数据
                }
                arr[index+gap]=temp; //i=index+gap;
            }
            gap/=2;
        }
        return arr;
    }

    public int[]
}
