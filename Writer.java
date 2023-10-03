import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class Writer {
    
    public void write(HashMap<String, Param> arrParam) throws IOException{
        String fileName = arrParam.get("Surname").getParamValue().toString();
        File fl = new File("C:\\Users\\31391\\Desktop\\OOP\\exeptions\\files\\" + fileName + ".txt");

        try (FileWriter fw = new FileWriter(fl, true)){

            String textRow = "Фамилия: " + arrParam.get("Surname").getParamValue().toString() + ", "+ 
            "Имя: " + arrParam.get("Name").getParamValue().toString() + ", "+
            "Отчетство: " + arrParam.get("Patronymic").getParamValue().toString() + ", "+
            "Дата рождения: " + arrParam.get("DateOfBirth").getParamValue().toString() + ", "+
            "Номер телефона: " + arrParam.get("PhoneNumber").getParamValue().toString() + ", "+
            "Пол: " + arrParam.get("Gender").getParamValue().toString();

            if(fl.exists()){
                System.out.print("Такой файл уже найден, данные внесены в существующий фай, с новой строки");
            } else{
                System.out.print("Создан новый файл и добавлены данные");
            }

            fw.append(textRow);
            fw.append("\n");

        } catch(IOException e){
            e.printStackTrace();
        }

    }
}
