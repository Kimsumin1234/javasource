package book;

/**
 *  ~DTO(Data Transfer Object) : 클래스 간 데이터 교환
 * get set 만들고
 * toString 만듬
 * 생성자 만듬
 * 값을 담기만 할거라서 기본형태로만 만듬
 */
public class BookDTO {

  private int code;
  private String title;
  private String writer;
  private int price;

  public BookDTO() {}

  public BookDTO(int code, String title, String writer, int price) {
    this.code = code;
    this.title = title;
    this.writer = writer;
    this.price = price;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return (
      "BookDTO [code=" +
      code +
      ", title=" +
      title +
      ", writer=" +
      writer +
      ", price=" +
      price +
      "]"
    );
  }
}
