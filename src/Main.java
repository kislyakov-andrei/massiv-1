import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Task 1
        System.out.println("Task 1");
        int i;
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] doubleMassiv = {1.57, 7.654, 9.968};
        int[] mySelf = {2, 3, 5, 7, 9, 12, 14};

// Task 2
        System.out.println("Task 2");
        for (i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
        for (i = 0; i < doubleMassiv.length; i++) {
            if (i == doubleMassiv.length - 1) {
                System.out.println(doubleMassiv[i]);
                break;
            }
            System.out.print(doubleMassiv[i] + ", ");
        }
        for (i = 0; i < mySelf.length; i++) {
            if (i == mySelf.length - 1) {
                System.out.println(mySelf[i]);
                break;
            }
            System.out.print(mySelf[i] + ", ");
        }
        // Task 3
        System.out.println("Task 3");
        for ( i=arr.length-1; i>=0;i--){
            if (i== 0){
                System.out.println(arr[i]);
                break;}
            System.out.print(arr[i]+", ");}
        for ( i=doubleMassiv.length-1; i>=0;i--){
            if (i== 0){
                System.out.println(doubleMassiv[i]);
                break;}
            System.out.print(doubleMassiv[i]+", ");}
        for ( i=mySelf.length-1; i>=0;i--){
            if (i== 0){
                System.out.println(mySelf[i]);
                break;}
            System.out.print(mySelf[i]+", ");}
// Task 4
        System.out.println("Task 4");
        for (i=0; i<= arr.length-1;i++){
            if (arr[i]%2!=0){ arr[i]++;}
        }
        System.out.println(Arrays.toString(arr));
        // I wanted to create one more cycle with another operator, i hope it isn't mistake
        i=0;
        while (i<= mySelf.length-1) {

            if (mySelf[i] % 2 != 0) {
                mySelf[i]++;}
            i++;
        }


        System.out.println(Arrays.toString(mySelf));
    }
}