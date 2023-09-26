import java.util.Scanner;

public class Task1 {
    public void task1(){
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        while(flag){
            try{
                System.out.print("Введите дробное число: ");
                float answer = scan.nextFloat();
                flag = false;
            } catch(Exception e){
                System.out.println("Нужно ввести дробное число");
                scan.next();
            }
        }
    }
}
