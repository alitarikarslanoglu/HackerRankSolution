import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        b=b.toUpperCase();
        a=a.toUpperCase();
        if (a.length()!=b.length())
            return false;
        boolean result= false;
        for (int i = 0; i <a.length() ; i++) {
            //char temp= a.charAt(i);
            int count_a=0;
            int count_b=0;
            for (int j = 0; j <a.length() ; j++) {
                if (a.charAt(j)==a.charAt(i))
                    count_a++;
                if (b.charAt(j)==a.charAt(i))
                    count_b++;
            }
            if (count_a==count_b)
                result=true;
            else
                return false;
        }
        return result;
        // Complete the function
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
