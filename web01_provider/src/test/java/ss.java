import org.junit.Test;

public class ss {

    @Test
    public void test01(){
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1);
        System.out.println(str2);
        System.err.println(str1 == str2);
        System.out.println(str1.equals(str2));

    }

}
