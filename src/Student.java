public class Student implements Comparable<Student> {
    private String firstName, lastName;
    private int grade;
    private double gpa;

    public Student(String f, String l, int g, double gp)    {
        firstName = f;
        lastName = l;
        grade = g;
        gpa = gp;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getGrade() {
        return grade;
    }

    public double getGpa() {
        return gpa;
    }

    public String toString()    {
        return lastName + ", " + firstName + " grade " + grade;
    }

    public boolean equals(Object o) {
        if(o instanceof Student)    {
            Student temp = (Student)o;
            Double myGPA = gpa;
            Double tempGPA = temp.gpa;

            return lastName.equals(temp.lastName) && firstName.equals(temp.firstName) &&
                    grade == temp.grade && myGPA.equals(tempGPA);
        }
        return false;
    }

    public int compareTo(Student s) {
        int diff = this.lastName.compareTo(s.lastName);
        if(diff == 0)
            diff = this.firstName.compareTo(s.firstName);
        if(diff == 0)
            diff = this.grade - s.grade;
        if(diff == 0) {
            Double myGPA = this.gpa;
            Double tempGPA = s.gpa;
            diff = myGPA.compareTo(tempGPA);
        }

        return diff;
    }
}
