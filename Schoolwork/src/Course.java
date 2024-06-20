public class Course {
    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new String[5]; // Initial array size
        this.numberOfStudents = 0;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            expandArray(); // Expand the array if it's full
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private void expandArray() {
        String[] newStudents = new String[students.length * 2]; // Double the size
        for (int i = 0; i < students.length; i++) {
            newStudents[i] = students[i];
        }
        students = newStudents;
    }

    public void dropStudent(String student) {
        int index = -1;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < numberOfStudents - 1; i++) {
                students[i] = students[i + 1];
            }
            numberOfStudents--;
        }
    }

    public void clear() {
        this.students = new String[5];
        this.numberOfStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String[] getStudents() {
        return students;
    }
}

