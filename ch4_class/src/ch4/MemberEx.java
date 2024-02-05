package ch4;

import exam.Member;

public class MemberEx {

  public static void main(String[] args) {
    // 회원 객체 생성 ==> 무조건 생성자 호출
    // 아이디,비밀번호,이름 필수로
    Member member1 = new Member("member1", "member1", "홍길동");
    // 아이디,비밀번호,이름, 나이, 직업
    Member member2 = new Member("member2", "member2", "성춘향", 30, "회사원");
    // Member member3 = new Member(); // 아무것도 적지 않은 회원이 있다면 Member 클래스에 default 생성자가 없어서 호출(생성)이 안된다, 즉 default 생성자는 무조건 만드는게 아니다
    // grade, point => 마트 규칙에 따라 변경
  }
}
