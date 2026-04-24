class User {
    private int userId;
    private String name;
    private String email;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
    }

    void content() {
        System.out.println("General user content access.");
    }

    void showInfo(){
        System.out.println("User ıd: " + this.userId + " Name: " + this.name + " E-mail: " + this.email);
    }
}

class Student extends User {
    private int courseCount;
    private String[] courses;

    public Student(int userId, String name, String email, int courseCount, String[] courses) {
        super(userId, name, email);
        this.courseCount = courseCount;
        this.courses = courses;
    }

    @Override
    void content() {
        System.out.println("Student is watching learning content.");
    }
}

class Instructor extends User {
    private String[] teachableCourses;
    private double salary;

    public Instructor(int userId, String name, String email, String[] teachableCourses, double salary) {
        super(userId, name, email);
        this.teachableCourses = teachableCourses;
        this.salary = salary;
    }

    @Override
    void content() {
        System.out.println("Instructor is uploading teaching content.");
    }
}

public class poly3 {
    public static void main(String[] args) {


        User[] users = new User[2];

        users[0] = new Student(1, "Alice", "alice@mail.com", 3, new String[]{"Math","Java"});
        users[1] = new Instructor(2, "Bob", "bob@mail.com", new String[]{"Java","OOP"}, 5000);

        for (User u : users) {
            u.showInfo();
            u.content();
        }
    }
}