import java.util.Scanner;

public class Task4 {
    public void task4(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение");

        String answer = scan.nextLine();
        if(answer == null || answer.isEmpty()){
            throw new RuntimeException("Нельзя вводить пустую строку, попробуйте еще раз");
        } else{
            System.out.printf("\nВсе хорошо, программа выполнена.\n Вы ввели: %s", answer);
        }

    }
}
