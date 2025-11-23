public class Student {
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private String email;

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
}

    

