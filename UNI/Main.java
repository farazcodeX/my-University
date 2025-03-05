package UNI;

import java.net.IDN;
import base.Person;

public class Main {
    public static void main(String[] args) {

        // students
        Person person1 = new Person("faraz", "2742504803");
        Person person2 = new Person("ALi", "2753905672");
        Person person3 = new Person("Hashem", "2744050969");
        Person person4 = new Person("Behzad", "2395461269");
        Person person5 = new Person("Amir", "2456092149");

        Major major1 = new Major("Computer Sciense", 60);
        Major major2 = new Major("Math and usage", 50);

        student student1 = new student(person1.nationalID, 403, major1.ID);
        student student2 = new student(person2.nationalID, 403, major1.ID);
        student student3 = new student(person3.nationalID, 403, major2.ID);
  
        Proffessor proffessor1 = new Proffessor(person5.nationalID, major1.ID);
        Proffessor proffessor2 = new Proffessor(person4.nationalID, major2.ID);

        Course course1 = new Course("AP", 11);
        Course course2 = new Course("Calculas2", 14);
        Course course3 = new Course("BP", 5);

        presentCourse presCourse1 = new presentCourse(course1.ID, proffessor1.ID, 30);
        presentCourse presCourse2 = new presentCourse(course2.ID, proffessor1.ID, 20);
        presentCourse presCourse3 = new presentCourse(course3.ID, proffessor2.ID, 40);

        presCourse1.addStudent(student1.studentID);
        presCourse1.addStudent(student2.studentID);

        presCourse2.addStudent(student1.studentID);
        presCourse2.addStudent(student2.studentID);
        presCourse2.addStudent(student3.studentID);

        presCourse3.addStudent(student3.studentID);

        Transcript transcript1 = new Transcript(student1.studentID);
        Transcript transcript2 = new Transcript(student2.studentID);
        Transcript transcript3 = new Transcript(student3.studentID);

        // stu1 
        transcript1.setGrade(presCourse1.courseID, 18.5);
        transcript1.setGrade(presCourse2.courseID, 19);

        transcript2.setGrade(presCourse1.courseID, 15);
        transcript2.setGrade(presCourse2.courseID, 17.43);

        transcript3.setGrade(presCourse2.courseID, 16.31);
        transcript3.setGrade(presCourse3.courseID, 10.75);

        transcript1.printTranscript();
        transcript2.printTranscript();
        transcript3.printTranscript();

        System.out.println(transcript1.getGPA());
        System.out.println(transcript2.getGPA());
        System.out.println(transcript3.getGPA());
        
    }
   
}
