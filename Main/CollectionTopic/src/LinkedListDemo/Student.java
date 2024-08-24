package LinkedListDemo;

public class Student implements Comparable<Student>{
    private String student_name;
    private int student_id;
    @Override
    public int compareTo(Student another_id) {
        return Integer.compare(this.student_id,another_id.student_id);
    }

    public Student(String student_name, int student_id) {
        this.student_name = student_name;
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_name='" + student_name + '\'' +
                ", student_id=" + student_id +
                '}';
    }




}
