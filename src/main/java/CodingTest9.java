public class CodingTest9 {
    public static void main(String[] args) {
        //정수 number와 n, m이 주어집니다. number가 n의 배수이면서 m의 배수이면 1을 아니라면 0을 return하도록 solution 함수를 완성해주세요.
        // number가 n*m의 배수면 n과 m의 배수 아님?
        int answer = 0;
        int number = 60;
        int n = 2;
        int m = 3;
        if(number%n==0) {
            if(number%m==0) {
                answer = 1;
            }
        }
        System.out.println(answer);

        }

}
