package chapterFive;

/**
 * @author 江峰
 * @create 2018-12-17 20:13
 */
public class ArraysOfPrimitives {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2;
        // 进行的是引用传递。
        arr2 = arr1;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr2[i] + 1;
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("arr1[ " + i + " ] = " + arr1[i]);
        }
    }
}
