import java.util.Scanner;
class SubStrings {

    public static void main(String[] args) {
        Scanner aasd = new Scanner(System.in);
        String S = aasd.next();
        int start = aasd.nextInt();
        int end = aasd.nextInt();
        System.out.println(S.substring(start,end));
        aasd.close();
    }
}