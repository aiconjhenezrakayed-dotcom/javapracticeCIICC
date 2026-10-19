public class Student {
    private String name;
    private static int count = 0; // Shared by all students

    public Student(String name) {
        this.name = name;
        count++; // Every time a student is made, count goes up
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        Student s4 = new Student("Ezra");
        Student s5 = new Student("Jillian");

        System.out.println("Total students created: " + Student.getCount());
    }
}