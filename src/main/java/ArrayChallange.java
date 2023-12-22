import java.util.Scanner;

public class ArrayChallange {
    public static boolean ArrayChallenge(int[] arr) {
        int maxNumber = 0;
        int totalNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxNumber){
                maxNumber = arr[i];
            }

            totalNumber += arr[i];
        }

        System.out.println("totalNumber = " + totalNumber);
        System.out.println("maxNumber = " + maxNumber);

        if((totalNumber - maxNumber) >= maxNumber) return true; else return false;
    }

    public static void main(String[] args) {
        int[] ints = {3,5,-1,8,12};
        System.out.print(ArrayChallenge(ints));
    }

}
