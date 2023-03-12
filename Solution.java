import java.util.*;
class Solution {
    public static boolean isPalindrome(int x) {
        int num=x;
        int rev=0,rem;
        while(x>0){
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
            if(num==rev){
             return true;
            }
            else{
            return false;}   
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(isPalindrome(num));

    }
}
