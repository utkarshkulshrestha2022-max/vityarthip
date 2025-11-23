public class Coursee {
    private final int id;
    private final String courseName;

    public Coursee(int id, String courseName) {
        this.id = id;
        this.courseName = courseName;
    }

    public int getId() { return id; }
    public String getCourseeName() { return courseName; }
}