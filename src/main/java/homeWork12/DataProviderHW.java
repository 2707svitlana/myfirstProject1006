package homeWork12;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataProviderHW {
    static List<String> stringList = new ArrayList<>();
    static List<Integer> intList = new ArrayList<>();

    static {
        stringList.add(new String("cat"));

        stringList.add(new String("dog"));
        stringList.add(new String("mouse"));
        stringList.add(new String("bird"));

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
    }

    public static String getRandomString() {
        return stringList.get(new Random().nextInt(stringList.size()));
    }

    public static Integer getRandomInt() {
        return intList.get(new Random().nextInt(stringList.size()));
    }

    @Test
    public void Test() {


       // DataProviderHW.getRandomString();
       System.out.println(DataProviderHW.getRandomString());
       System.out.println(DataProviderHW.getRandomInt());



    }
}



