
public class Validator {
    
    public int validateDateOfBirth(String str){
        if(str.matches("\\d{2}.\\d{2}.\\d{4}")){
            return 1;
        } else{
            return -1;
        }
    }

    public int validateGender(String symbs, Character symb){
        if(symb.equals(symbs.charAt(0)) || symb.equals(symbs.charAt(1))){
            return 1;
        } else{
            return -1;
        }
    }

    public int validateOfLetters(String str){
        if(str.matches("^[A-Za-z]\\w{5,29}$")){
            return 1;
        } else{
            return -1;
        }
    }

    public int validatePhoneNumber(String value){
        if(value.matches("^[0-9]\\w{5}$")){
            return 1;
        } else{
            return -1;
        }
    }
}
