import com.phone.*;

public class Main {
    public static void main(String[] args) {

        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("close");
        obj.spec();
//        OS obj = new Windows();
//        obj.spec();
    }
}