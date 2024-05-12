import rid.WrongLoginException;
import rid.WrongPasswordException;

import java.util.regex.Pattern;

public class Stat  {

    private static Pattern  LOGIN_PATTERN  =  Pattern.compile("^[a-zA-Z0-9_]{1,20}");
    private static Pattern  PASSWORD_PATTERN  = Pattern.compile("^[a-zA-Z0-9_]{1,20}");

    public static void Person(String login, String password, String confirmPassword)  throws WrongLoginException, WrongPasswordException {


        {
            if (!LOGIN_PATTERN.matcher(login).matches()) {
                throw new WrongLoginException("Такой логин не допускается");
            }
            if (!PASSWORD_PATTERN.matcher(password).matches()) {
                throw new WrongPasswordException("Такой пароль не допускается");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Пароли не совпадают");
            }

        }
    }





}
