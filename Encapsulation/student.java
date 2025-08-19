public class student {

  private int studentId;
  private String studentName;

  public int getstudentId() {
    return studentId;
  }

  public void setstudentId(int studentId) {
    this.studentId = studentId;
  }

  public String getstudentName() {
    return studentName;
  }

  public void setstudentName(String studentName) {
    this.studentName = studentName;
  }

  public static void main(String[] args) {
    student s = new student();

    s.setstudentId(202);
    s.setstudentName("Kavindra");
    System.out.println(s.studentId);
    System.out.println(s.studentName);
  }

}
