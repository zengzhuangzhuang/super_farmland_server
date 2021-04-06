import org.junit.Test;
import sun.misc.Unsafe;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestJava {

    private static final Unsafe unsafe = Unsafe.getUnsafe();

    Lock lock = new ReentrantLock();

    //测试代码
    @Test
    public void testMethod(){
        String s = "heima";
        System.out.println(s);
        change(s);
        //s += "itcast";
        System.out.println(s);

        System.out.println("---------------------");
        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);


        List<String> list1 = Collections.synchronizedList(new ArrayList<>());

        List<String> list2 = new LinkedList<>();

        Object object = new Object();

        Set<String> set1 = new HashSet<>();

        Set<String> set2 = new LinkedHashSet<>();

        Set<String> set3 = new TreeSet<>();

        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new LinkedHashMap<>();
        Map<String,String> map3 = new TreeMap<>();

        Integer num1 = 1888;
        int num2 = 1888;
        System.out.println(num1==num2);

        Short num3 = 1080;
        Short num4 = 1080;
        System.out.println(num3==num4);

    }

    public static void change(StringBuffer sb) {
        sb.append("itcast");
    }

    public void change(String s) {
        s += "itcast";
    }

}
