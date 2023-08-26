package CoingTests;

public class CodingTest7 {
    public static void main(String[] args) {
        int answer = 0;
        int a = 2;
        int b = 91;
        String answer1 = a+""+b;
        int answer2 = 2*a*b;
        if(Integer.parseInt(answer1)>answer2) {
            answer = Integer.parseInt(answer1);
        } else {
            answer = answer2;
        }
        System.out.println(answer);

        }

}
