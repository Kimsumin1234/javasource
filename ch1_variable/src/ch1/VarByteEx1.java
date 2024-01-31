package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 타입 (자료형) - 1.정수형 2.문자형 3.논리형 4.실수형
        // 변수명 (★소문자로 시작★/두 개의 단어가 합해진 변수명은 두번째 단어 시작을 대문자로 함★)
        // 1.정수형 - byte(1byte 할당), short(2byte 할당), int(4byte 할당), long(8byte 할당,L을 붙여준다)
        // int 주로 사용 ★
        // java 에서 + 는 더하기와 연결하기 의미가 있다
        // 노란줄은 무시 빨간줄은 잘못한게 있다는 뜻 (빨간줄에 커서 올리면 오류의미가 나옴)
        // ★ java 는 대소문자 구별한다 ★
        byte age = 10, maxSpeed = 10;
        short age1 = 10, maxSpeed1 = 10;
        int age2 = 15, maxSpeed2 = 20;

        age = 33;  // 한번 선언된 공간에 변수는 변할수있다, 할당된 byte 선에서, 최종적으로 넣은 변수가 출력
        // age = 128;

        // long타입은 값에 L(l) 붙이기
        long age3 = 123456789L, maxSpeed3 = 1000000000000L;

        System.out.println(age + " , " + maxSpeed);
        System.out.println("나이 : "+ age1 +", 최고속도 : " + maxSpeed1);
        System.out.println("나이 : "+ age2 +", 최고속도 : " + maxSpeed2);
        System.out.println("나이 : "+ age3 +", 최고속도 : " + maxSpeed3);

    }
}
