package ss2_array_loop;

import java.util.Arrays;

public class DemoArray {
    int[] arr = {1,4,6,7};
    int a; // a =0; Tương tự cho byte và short
    long b; //b = 0l;
    float c; // c= 0.0f
    boolean d; //d = false
    char e; // e = /u0000
    public static void main(String[] args) {
        DemoArray demoArray = new DemoArray();
//        System.out.println(Arrays.toString(demoArray.arr));
//        Arrays.sort(demoArray.arr);
        System.out.println(Arrays.stream(demoArray.arr).sum());
    }
}
