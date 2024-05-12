import rid.WrongLoginException;
import rid.WrongPasswordException;

public class Main {


    public static void main(String[] args) {
        String login = "login23_DFGf";
        String password = "street_3u7654565555555555555";
        String confirmPassword = "street_3u7654565555555555555";

        try {
            // Создаем экземпляр класса Stat
            Stat stat = new Stat();
            // Вызываем метод person (предполагая, что он существует в классе Stat)
            stat.Person(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace(); } finally {
            System.out.println("finaly");
        }

        System.out.println("Код работает дальше");

    }
}
