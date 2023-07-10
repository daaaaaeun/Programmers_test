import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //값
        String answer = "";
            for(int i=0; i < a.length(); i++) {
                //문자열 변환
                char c =a.charAt(i); //String으로 저장된 문자열 중에서 한 글자만 선택해서 char타입으로 변환
                //a.charAt에서 a는 String a 에서 a
                //소문자는 대문자로 대문자는 소문자로
                if(Character.isLowerCase(c)) {
                    answer += Character.toUpperCase(c);
                }
                else {
                    answer += Character.toLowerCase(c);
                }
            }
        System.out.println(answer);
    }
}