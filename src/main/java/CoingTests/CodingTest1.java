package CoingTests;

public class CodingTest1 {
    public static void main(String[] args) {
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        String answer = "";
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();
        int minLenth = Math.min(char1.length, char2.length);

        for (int i=0; i<=minLenth-1; i++) {
            answer += char1[i] +""+ char2[i];
        }
// char를 String으로 변환 .charAt() 또는 ""넣기
        System.out.println(answer);

        for (int i=0; i<str1.length(); i++) {

        }
    }

}
