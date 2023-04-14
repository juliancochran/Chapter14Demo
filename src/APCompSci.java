import java.util.ArrayList;
import java.util.Collections;

public class APCompSci {
    public static void main(String[] args) {
        ArrayList<Student> myStudents = new ArrayList<>();
        myStudents.add(new Student("Imhotep", "Truitt", 12, 5.1234));
        myStudents.add(new Student("Riley", "Kim", 11, 5.23123));
        myStudents.add(new Student("Ona", "Lukes", 12, 12.2364123));
        myStudents.add(new Student("Amanitore", "Truitt", 8, .232));
        myStudents.add(new Student("Kenzie", "Kim", 9, 3.62734));
        myStudents.add(new Student("Ethan", "Lukes", 10, 2.2364123));
        myStudents.add(new Student("Riley", "Kim", 10, 1.23123));

        System.out.println("¡¡¡LOOK MA -- AN UNSORTED DATABASE!!!");
        for(Student s : myStudents)
            System.out.println(s);

        Collections.sort(myStudents);

        System.out.println("\n¡¡¡LOOK NOW MA -- A SORTED DATABASE!!!");
        for(Student s : myStudents)
            System.out.println(s);

    }
}
