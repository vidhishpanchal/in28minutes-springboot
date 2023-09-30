import com.phone.Phone;
import com.phone.PhoneBuilder;

public class Main {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(20).getPhone();
        System.out.println(p);
    }
}