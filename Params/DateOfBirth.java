/**
 * DateOfBirth
 */
public class DateOfBirth extends Param{
    
    private Object paramValue;
    private String paramType = "String";
    private String paramName = "дата рождения";

    public DateOfBirth(){};
    public DateOfBirth(Object paramValue){
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

        if(val.validateDateOfBirth(str) > 0){
            this.paramValue = str;
            return 1;
        } else{
            System.out.println("Введите дату в формате dd.mm.yyyy: ");
            return -1;
        }
    }
}
