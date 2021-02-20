import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        sc.close();
        int k=A.length()-1;
        boolean check = true;
        for (int i = 0; i <A.length() ; i++) {
            if (!(A.charAt(i)==A.charAt(k))){
                check=false;
            }
            k=k-1;
        }
        if (check){
            System.out.println("Yes");/* Enter your code here. Print output to STDOUT. */
        }
        else System.out.println("No");

    }

}
