public class CodingTest4 {

    public static void main(String[] args) {
//         lv0 더크게합치기
        int a = 9;
        int b = 91;
        int answer = 0;
        String answer1 = a +""+ b;
        String answer2 = b +""+ a;
        if(Integer.parseInt(answer1)>Integer.parseInt(answer2)) {
            answer = Integer.parseInt(answer1);
        } else {
            answer = Integer.parseInt(answer2);
        }
        System.out.println(answer);

        //return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));

    }

}
