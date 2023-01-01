public class reverse_of_number {
    //while loop
    public static void main(String[] args) {
        int a=98765;
        int reverse=0;
        while(a!=0){
            int reminder= a % 10;
            reverse = reverse * 10 + reminder;
            a = a/10;
        }
         System.out.println("The reverse of given number is :"+ reverse);
    }
}
