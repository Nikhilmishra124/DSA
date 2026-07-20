import java.util.Arrays;

public class ShalowCopyDeepCopy {
    public static void main(String[] args) {
        // shallow copy
        int[] arr = {45,25,985,165,25};
        int[] brr = arr; // brr is shalow coipy of arr ..
        brr[0] = 20;
        System.out.println(arr[0]);
        
        // deep copy
        int[] y = Arrays.copyOf(arr,arr.length); // deep copy
        y[0] = 100;
        System.out.println(y[0]);
        System.out.println(arr[0]);
    }
    
}
