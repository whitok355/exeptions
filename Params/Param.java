
public class Param {
    
    private Object paramValue;
    private String paramType = "String";
    private String paramName;

    public Param(){}

    public Param(Object paramValue){
        this.paramValue = paramValue;
    }

    public Param getParam(){
        return this;
    }
    public void setParam(){}

    public Boolean validate(){
        return true;
    }

    public String getParamName(){
        return paramName;
    }

    public String getParamType(){
        return paramType;
    }
    public Object getParamValue(){
        return paramValue;
    }
    public int setParamValue(Object value){
        return -1;
    }
}
