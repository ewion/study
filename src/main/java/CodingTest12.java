public class CodingTest12 {
    public static void main(String[] args) {
//        flag에따라 값 변환
//        두 정수 a, b와 boolean 변수 flag가 매개변수로 주어질 때, flag가 true면 a + b를 false면 a - b를 return 하는 solution 함수를 작성해 주세요.
        int answer = 0;
        int a = -4;
        int b = 7;
        boolean flag = true;
        if(flag==true) {
            answer = a+b;
        } else {
            answer = a-b;
        }

        System.out.println(answer);

        // return flag ? a + b : a - b;
        // answer = flag ? a+b:a-b;
        }

}
