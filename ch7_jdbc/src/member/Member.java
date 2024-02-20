package member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * 1. ~DTO : 생성자, getter, setter, toString
 * 2. @Data : 우클릭 소스액션 해서 클릭하는걸 간편하게 해줌
 *            toString, Getter, Setter, default 생성자, equals 알아서 생성이된다
 * 3. @Getter 와 같이 개별로 메소드 생성이 가능하다
 */
@Data
@Getter
@Setter
@ToString
@NoArgsConstructor // default 생성자
@AllArgsConstructor // 멤버 변수 모두 포함 생성자
public class Member {

  private String id;
  private String name;
  private String password;
}
