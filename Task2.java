import java.lang.reflect.Array;

public class Task2 {

    public void task2(){
        try {
            int d = 0;

            int[] intArray = {1,2,3,4,5,6,7,8,9,19};

            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
