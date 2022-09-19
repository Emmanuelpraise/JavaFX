package Test;

public class Confirm {

    public static String confirmPSWD(String password,String confirmPassword){

        if(password.equals("")&&confirmPassword.equals("")){
            System.err.println("Error! An Input Is Missing");
        }

        if (!password.equals(confirmPassword)||password.equals("")||confirmPassword.equals("")){
            System.err.println("Error! Passwords Don\'t Match");
        }

        if (password.length()>=6 && password.equals(confirmPassword)){
           return("Nice! Passwords Matched");
        }else{
            return("Error! Passwords Must Contain Atleast 6 Characters");
        }
    }

    public static void main(String[] args) {
       String check = confirmPSWD("", "");
        System.out.println(check);
    }
}
