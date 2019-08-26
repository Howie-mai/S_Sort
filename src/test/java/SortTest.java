import com.zhku.mh.Sort;
import org.junit.Test;

public class SortTest {
    private int[] arr=new int[]{56,54,78,41,562,51,89};
    private Sort sort=new Sort();

    public static void display(int arr[]){
        for (int data:arr) {
            System.out.print(data+"  ");
        }
        System.out.println(" ");
    }

    @Test
    public void TestBubbleSort(){
        display(arr);
        arr=sort.bubbleSort(arr);
        display(arr);
    }

    @Test
    public void TestSelectionSort(){
        display(arr);
        arr=sort.selectionSort(arr);
        display(arr);
    }

    @Test
    public void TestInsertionSort(){
        display(arr);
        arr=sort.insertionSore(arr);
        display(arr);
    }

    @Test
    public void TestShellSort(){
        display(arr);
        arr=sort.ShellSort(arr);
        display(arr);
    }

    @Test
    public void TestQuickSort(){
        display(arr);
        arr=sort.quickSort(arr,0,arr.length-1);
        display(arr);
    }
//    @Test
//    public void TestQuickSort2(){
//        display(arr);
//        arr=sort.quickSort2(arr,0,arr.length-1);
//        display(arr);
//    }


}
