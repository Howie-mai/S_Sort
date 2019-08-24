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
}
