import javax.swing.*;
import java.awt.event.*;

class Student {
    String name;
    Student(String name) {
        this.name = name;
    }
}

class Course {
    String courseName;
    Course(String courseName) {
        this.courseName = courseName;
    }
}

class Instructor {
    String instructorName;
    Instructor(String instructorName) {
        this.instructorName = instructorName;
    }
}

class Enrollment {
    Student student;
    Course course;
    Instructor instructor;

    Enrollment(Student s, Course c, Instructor i) {
        student = s;
        course = c;
        instructor = i;
    }

    String getDetails() {
        return "Student: " + student.name +
               "\nCourse: " + course.courseName +
               "\nInstructor: " + instructor.instructorName;
    }
}

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("E-Learning System");
        frame.setSize(400, 350);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel l1 = new JLabel("Student Name:");
        l1.setBounds(30, 30, 120, 25);
        frame.add(l1);

        JTextField t1 = new JTextField();
        t1.setBounds(160, 30, 180, 25);
        frame.add(t1);

        JLabel l2 = new JLabel("Course Name:");
        l2.setBounds(30, 70, 120, 25);
        frame.add(l2);

        JTextField t2 = new JTextField();
        t2.setBounds(160, 70, 180, 25);
        frame.add(t2);

        JLabel l3 = new JLabel("Instructor Name:");
        l3.setBounds(30, 110, 120, 25);
        frame.add(l3);

        JTextField t3 = new JTextField();
        t3.setBounds(160, 110, 180, 25);
        frame.add(t3);

        JButton btn = new JButton("Enroll");
        btn.setBounds(140, 160, 100, 30);
        frame.add(btn);

        JTextArea area = new JTextArea();
        area.setBounds(30, 210, 310, 70);
        frame.add(area);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                Student s = new Student(t1.getText());
                Course c = new Course(t2.getText());
                Instructor i = new Instructor(t3.getText());

                Enrollment en = new Enrollment(s, c, i);

                area.setText(en.getDetails());
            }
        });

        frame.setVisible(true);
    }
}