import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Course {
    private String courseName;
    private final ArrayList<Instructor> instructors;
    private final ArrayList<Textbook> textbooks;

    public Course(String courseName) {
        setCourseName(courseName);
        instructors = new ArrayList<>();
        textbooks = new ArrayList<>();
    }

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this(courseName);
        addInstructor(instructor);
        addTextbook(textbook);
    }

    public Course(
            String courseName,
            Instructor[] instructors,
            Textbook[] textbooks) {
        this(courseName);

        if (instructors != null) {
            for (Instructor instructor : instructors) {
                addInstructor(instructor);
            }
        }
        if (textbooks != null) {
            for (Textbook textbook : textbooks) {
                addTextbook(textbook);
            }
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addInstructor(Instructor instructor) {
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null.");
        }
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        if (textbook == null) {
            throw new IllegalArgumentException("Textbook cannot be null.");
        }
        textbooks.add(textbook);
    }

    public Instructor getInstructor() {
        return instructors.isEmpty() ? null : instructors.get(0);
    }

    public void setInstructor(Instructor instructor) {
        if (instructor == null) {
            throw new IllegalArgumentException("Instructor cannot be null.");
        }
        if (instructors.isEmpty()) {
            instructors.add(instructor);
        } else {
            instructors.set(0, instructor);
        }
    }

    public Textbook getTextbook() {
        return textbooks.isEmpty() ? null : textbooks.get(0);
    }

    public void setTextbook(Textbook textbook) {
        if (textbook == null) {
            throw new IllegalArgumentException("Textbook cannot be null.");
        }
        if (textbooks.isEmpty()) {
            textbooks.add(textbook);
        } else {
            textbooks.set(0, textbook);
        }
    }

    public List<Instructor> getInstructors() {
        return Collections.unmodifiableList(instructors);
    }

    public List<Textbook> getTextbooks() {
        return Collections.unmodifiableList(textbooks);
    }

    public void print() {
        System.out.println("Course: " + courseName);

        System.out.println("Instructor(s):");
        if (instructors.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Instructor instructor : instructors) {
                System.out.printf(
                        "  %s %s | Office: %s%n",
                        instructor.getFirstName(),
                        instructor.getLastName(),
                        instructor.getOfficeNumber());
            }
        }

        System.out.println("Textbook(s):");
        if (textbooks.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Textbook textbook : textbooks) {
                System.out.printf(
                        "  %s by %s | Publisher: %s%n",
                        textbook.getTitle(),
                        textbook.getAuthor(),
                        textbook.getPublisher());
            }
        }
        System.out.println();
    }
}
