package ch1;

// 자동 형(타입) 변환 : promotion
// 정수형 / 문자형 / 논리형 / 실수형
// 타입 변환 가능함 : 작은 타입 => 큰 타입 (byte 할당량 기준)
// 연산 시 타입변환이 일어남 : 작은 타입 => 큰 타입
public class PromotionEx1 {
    public static void main(String[] args) {
        byte v1 = 10;
        int intValue = v1;
        System.out.println("intValue = " + intValue);

        short s1 = 15;
        intValue = s1;
        System.out.println("intValue = " + intValue);

        char ch1 = 'a';
        intValue = ch1;
        System.out.println("intValue = " + intValue);
        

        // 8 byte
        long longValue = intValue;
        System.out.println("longValue = " + longValue);

        double doubleValue = intValue;
        System.out.println("doubleValue = " + doubleValue); // 소수점이 자동으로 붙게 됨

        // float type 이 int 보다 더 정밀한 수를 표현
        // int (4byte) => float (4byte)
        float floatValue = intValue;
        System.out.println("floatValue = " + floatValue);

        // int + double
        intValue = 55;
        doubleValue = 98.25d;
        
        // Type mismatch : 왼쪽 과 오른쪽 타입이 맞지 않음
        // int result = intValue + doubleValue;
        double result = intValue + doubleValue;
        System.out.println("int + double = double 타입으로 변환됨");
        System.out.println(result);

        byte v2 = 15;
        // 자바에서는 byte + byte(사칙연산) 하면 스스로 int 로 변환시킴, short 같은것도 마찬가지 그냥 처음부터 int 사용하는게 편하다
        // byte byteValue = v1 + v2; => 정수를 변수에 담는다면 int 사용
        int byteValue = v1 + v2;
    }
}
