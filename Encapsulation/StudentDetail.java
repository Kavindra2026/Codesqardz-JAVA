public class StudentDetail {

  private String Name;
  private int Id;
  private int rollNo;
  private String subject;

  public String getName() {
    return Name;
  }

  public String setName(String Name) {
    this.Name = Name;
    return Name;
  }

  public int getId() {
    return Id;
  }

  public void setId(int Id) {
    this.Id = Id;
  }

  public int getRollNo() {
    return rollNo;
  }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public static void main(String[] args) {
    StudentDetail s = new StudentDetail();
    s.setName("Kavindra Singh");
    System.out.println("Student Name : " + s.getName());
    s.setId(74657);
    System.out.println("Student Id : " + s.getId());
    s.setRollNo(22118050);
    System.out.println("Student Roll Na : " + s.getRollNo());
    s.setSubject("Computer Science");
    System.out.println("Student Subject : "+s.getSubject());
  }

}
