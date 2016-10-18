package student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aaron
 */
/**
 * The class for representing the Student holding the data for his or her name
 * and enrollment date and can implement the Comparator interface providing a
 * compare function for comparing Students
 */
public class Student implements Comparator<Student> {

    private String name;
    private final Date enrollmentdate;

    /**
     * @param args the command line arguments
     */

    /**
     * Constructs a Student object
     *
     * @param s the String that is assigned to the Student for its name
     * @param d the SDate that is assigned to the Student for its enrollment
     * date
     */
    Student(String s, Date d) {
        name = s;
        enrollmentdate = d;
    }

    /**
     * Accessor for enrollmentdate
     *
     * @return enrollmentdate of Date type
     */
    public Date d() {
        return enrollmentdate;
    }

    /**
     * Accessor for name
     *
     * @return name of String type
     */
    public String n() {
        return name;
    }

    /**
     * @param o1 One of the Student objects to compare
     * @param o2 One of the Student objects to compare
     * @return int that represents which object is greater, less, or equal to
     * the other
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.n().compareTo(o2.n());
    }

    /**
     * Gets a Student that implements the Comparator interface creating an
     * anonymous class which can compare Student objects by their name
     *
     * @return //Student that implements the Comparator interface
     */
    public static Comparator<Student> getCompByName() {
        Comparator<Student> comp = new Comparator<Student>() {
            /**
             *
             * @param o1 One of the Student objects to compare
             * @param o2 One of the Student objects to compare
             * @return int that represents which object is greater, less, or
             * equal to the other
             */
            @Override
            public int compare(Student obj1, Student obj2) {
                return obj1.n().compareTo(obj2.n());
            }
        };

        return comp;

    }

    /**
     * Gets a Student that implements the Comparator interface creating an
     * anonymous class which can compare Student objects by enrollment date
     *
     * @return //Student that implements the Comparator interface
     */
    public static Comparator<Student> getCompByDate() {
        Comparator<Student> comp = new Comparator<Student>() {
            /**
             *
             * @param o1 One of the Student objects to compare
             * @param o2 One of the Student objects to compare
             * @return int that represents which object is greater, less, or
             * equal to the other
             */
            @Override
            public int compare(Student obj1, Student obj2) {
                return obj1.d().compareTo(obj2.d());
            }

        };
        return comp;
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");

        Date date1 = formatter.parse("01/29/02");
        Date date2 = formatter.parse("02/21/03");
        Date date3 = formatter.parse("05/15/06");
        Date date4 = formatter.parse("07/01/02");

        Student a = new Student("john", date1);
        Student b = new Student("aaron", date3);
        Student c = new Student("edward", date4);
        Student h = new Student("danish", date2);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(h);

        Collections.sort(students, Student.getCompByName());

        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).n() + "   " + students.get(i).d());
        }
        Collections.sort(students, Student.getCompByDate());
        System.out.println("\n\n\n");
        for (int i = 0; i < students.size(); i++) {

            System.out.println(students.get(i).n() + "   " + students.get(i).d());
        }
    }
}
