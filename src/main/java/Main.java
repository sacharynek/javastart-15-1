import java.io.FileNotFoundException;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Map map = Helper.fileToMap("countries.csv");
        System.out.println(map);

        String code = Helper.getCountryCodeFromUser();

        while (!Helper.isCodeCorrect(code)) {
            code = Helper.getCountryCodeFromUser();

        }
        System.out.println(map.get(code));
    }
}