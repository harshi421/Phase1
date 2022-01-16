import java.util.Scanner;
public class ConvertStringToStringBuilderExample {
 
    public static void main(String[] args) {
        String str = "Convert String to StringBuilder/StringBuffer";

        StringBuffer sbf = new StringBuffer(str);
        System.out.println("StringBuffer contents: " + sbf);
        
        StringBuilder sbl = new StringBuilder(str);
        System.out.println("StringBuilder contents: " + sbl);
    }
}