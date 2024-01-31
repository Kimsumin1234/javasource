package ch1;

public class PrintEx1 {
    public static void main(String[] args) {
        // 화면 출력
        int var1 = 35, var2 = 25;
        boolean flag = true;
        System.out.println("var1="+var1+", "+var2+", "+flag); // var1=35, 25, true

        // printf 지시자
        // %d : 10진 정수 형태로 출력
        // %b : boolean 형태로 출력
        // %c : 문자열(String) 출력
        // %f : 부동소수점(float,double) 출력
        // 엔터가 없어서 \n 추가 해주는게 좋다
        // 사이에 숫자를 넣을경우 : 총 자릿수, 자릿수가 부족할경우 오른쪽 정렬해서 출력해줌, 0을 넣을경우 나머지 자리를 0으로 채워줌
        System.out.printf("var1=%5d, var2=%05d, flag=%b\n", var1, var2, flag); // var1=35, var2=25, flag=true
        System.out.println("Hello");

        float f1 = 3.141592f;
        double d1 = 31.41592d;
        System.out.printf("f1=%.5f\n", f1); // .5 소수점 다섯자리까지
        System.out.printf("d1=%5.3f\n", d1);
    }
}
