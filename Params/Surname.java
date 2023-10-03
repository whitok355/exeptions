
public class Surname extends Param{

    private Object paramValue;
    private String paramType = "String";
    private String paramName = "фамилию";

    public Surname(){}
    public Surname(Object paramValue){
        super(paramValue);
    }
    @Override
    public Param getParam(){
        return this;
    }
    @Override
    public Object getParamValue(){
        return paramValue;
    }
    @Override
    public String getParamType(){
        return paramType;
    }
    @Override
    public String getParamName(){
        return paramName;
    }
    public void setParam(String paramValue){
        this.paramValue = paramValue;
    }    
    @Override
    public int setParamValue(Object paramValue){
        String str = paramValue.toString();
        Validator val = new Validator();

        if(val.validateOfLetters(str) > 0){
            this.paramValue = str;
            return 1;
        } else{
            System.out.println("Введите фамилию латинскими буквами, длина имени должна быть более 5 символов: ");
            return -1;
        }
    }
}
