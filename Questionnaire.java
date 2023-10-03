import java.util.ArrayList;
import java.util.Scanner;

public class Questionnaire {
    
    private ArrayList<Param> arrParams;

    public Questionnaire(ArrayList<Param> arrParam){
        this.arrParams = arrParam;
    }

    public void startQuestionnaire(){
        Scanner scan = new Scanner(System.in);

        for(Param param: arrParams){
            String paramName = param.getParamName();
            System.out.printf("\nВведите %s:  ", paramName);

            Boolean flag = true;
            while(flag){
                String value = scan.nextLine();
                int res = param.setParamValue(value);
                if(res > 0){
                    flag = false;
                }
            }
        }
    }
    
}
