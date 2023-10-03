
public class Gender extends Param{
    
    private char paramValue;
    private String paramType = "char";
    private String paramName = "пол";
    
    public Gender(){}
    
    public Gender(char paramValue){
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
    public void setParam(char paramValue){
        this.paramValue = paramValue;
    }
    @Override
    public int setParamValue(Object paramValue){
        String value = paramValue.toString();
        Character symb = value.charAt(0);
        String symbs = "fm";
        Validator val = new Validator();

        if(val.validateGender(symbs, symb) > 0){
            this.paramValue  = symb;
            return 1;
        } else{
            System.out.print("Укажите символ латиницей f или m: ");
            return -1;
        }

    }
}
