public class PhoneNumber extends Param {
    
    private Object paramValue;
    private String paramType = "int";
    private String paramName = "номер телефона";

    public PhoneNumber( ){}
    public PhoneNumber(Object paramValue){
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
    @Override
    public int setParamValue(Object paramValue){
        String value = paramValue.toString();
        Validator val = new Validator();

        if(val.validatePhoneNumber(value) > 0){
            this.paramValue = Integer.parseInt(value.trim());
            return 1;
        } else{
            System.out.println("Введите 6 чисел номера телефона, в формате 943943: ");
            return -1;
        }

    }
    public void setParam(String paramValue){
        this.paramValue = paramValue;
    }
}
