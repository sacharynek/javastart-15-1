import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Helper
{
    static Map<String, Country> fileToMap(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);

        Map<String, Country> map = new HashMap<>();
        sc.nextLine();

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] elements = line.split(";");
            map.put(elements[0], new Country(elements[0], elements[1], Integer.parseInt(elements[2])));
        }

        return map;
    }

    static String getCountryCodeFromUser(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj kod kraju, o którym chcesz zobaczyć informacje w formacie ISO-2");
        return sc.nextLine();
    }

    static boolean isCodeCorrect(String code){
        return code.length() == 2;
    }
}
