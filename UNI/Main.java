package UNI;

// Importing required classes
import base.Person;

public class Main {
    public static void main(String[] args) {

        // Creating Person objects
        Person person1 = new Person("Faraz", "2742504803");
        Person person2 = new Person("Ali", "2753905672");
        Person person3 = new Person("Hashem", "2744050969");
        Person person4 = new Person("Behzad", "2395461269");
        Person person5 = new Person("Amir", "2456092149");

        // Creating Major objects
        Major major1 = new Major("Computer Science", 60);
        Major major2 = new Major("Math and Usage", 50);

        // Creating Student objects
        Student student1 = new Student(person1.nationalID, 403, major1.ID);
        Student student2 = new Student(person2.nationalID, 403, major1.ID);
        Student student3 = new Student(person3.nationalID, 403, major2.ID);

        // Creating Professor objects
        Proffessor professor1 = new Proffessor(person5.nationalID, major1.ID);
        Proffessor professor2 = new Proffessor(person4.nationalID, major2.ID);

        // Creating Course objects
        Course course1 = new Course("AP", 11);
        Course course2 = new Course("Calculus 2", 14);
        Course course3 = new Course("BP", 5);

        // Creating presentCourse objects
        PresentCourse presCourse1 = new PresentCourse(course1.ID, professor1.ID, 30);
        PresentCourse presCourse2 = new PresentCourse(course2.ID, professor1.ID, 20);
        PresentCourse presCourse3 = new PresentCourse(course3.ID, professor2.ID, 40);

        // Adding students to the courses
        presCourse1.addStudent(student1.studentID);
        presCourse1.addStudent(student2.studentID);

        presCourse2.addStudent(student1.studentID);
        presCourse2.addStudent(student2.studentID);
        presCourse2.addStudent(student3.studentID);

        presCourse3.addStudent(student3.studentID);

        // Creating Transcript objects
        Transcript transcript1 = new Transcript(student1.studentID);
        Transcript transcript2 = new Transcript(student2.studentID);
        Transcript transcript3 = new Transcript(student3.studentID);

        // Assigning grades to students
        transcript1.setGrade(presCourse1.courseID, 18.5);
        transcript1.setGrade(presCourse2.courseID, 19);

        transcript2.setGrade(presCourse1.courseID, 15);
        transcript2.setGrade(presCourse2.courseID, 17.43);

        transcript3.setGrade(presCourse2.courseID, 16.31);
        transcript3.setGrade(presCourse3.courseID, 10.75);

        // Printing the transcripts of students
        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        // Printing GPA of each student
        System.out.println("GPA of student 1: " + transcript1.getGPA());
        System.out.println("GPA of student 2: " + transcript2.getGPA());
        System.out.println("GPA of student 3: " + transcript3.getGPA());
    }
}
