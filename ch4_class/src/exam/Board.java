package exam;

import java.time.LocalDateTime;

public class Board {

  // 번호, 제목, 내용, 작성자, 작성날짜, 수정날짜
  private int boardNo;
  private String title;
  private String content;
  private String writer;
  private LocalDateTime regDate;
  private LocalDateTime lastModifiedDate;

  // default 생성자
  public Board() {}

  // 4개 생성자
  public Board(int boardNo, String title, String content, String writer) {
    this.boardNo = boardNo;
    this.title = title;
    this.content = content;
    this.writer = writer;
  }
}
