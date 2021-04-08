import java.util.ArrayList;
import java.util.List;

public class HeadDemo {
    public static void main(String[] args) {
        long counter = 0;
        List<Object> list = new ArrayList<Object>();
        while (true){
            list.add(new Object());
//            list.add(new byte[1024]);
            System.out.println("创建第"+counter+++"只猪！");
        }
    }
}
