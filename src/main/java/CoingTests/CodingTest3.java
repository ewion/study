package CoingTests;

public class CodingTest3 {

    public static void main(String[] args) {
        // lv0 문자열 곱하기
        String answer = "";
        String my_string = "string";
        int k = 3;
        for (int i=0; i<=k-1; i++) {
            answer += my_string;
        }
        System.out.println(answer);

        System.out.println(my_string.repeat(k));
    }

}
