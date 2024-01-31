package ch1;

public class VarCharEx1 {
    public static void main(String[] args) {
        // 2. 문자형 - char (2byte 할당, 문자열에는 사용 못함)
        //            '' 사용
        //    문자(한 글자) vs 문자열(한 글자 이상)
        //       ''        vs        ""
        //    문자는 코드값(ASCII, UTF-8)이 정의 되어 있음
        //     A => 65  B => 66  C => 67 ... 이런식    a => 97  b => 98  c => 99 ...
        char name = 'J';
        char var1 = 'A';
        char var2 = '가';

        // String name2 = "Ja";
        System.out.println("나의 이름은 "+ name);
        System.out.println("var1 = "+ var1);
        System.out.println("var2 = "+ var2);
    }
}
