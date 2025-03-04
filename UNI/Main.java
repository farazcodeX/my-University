package UNI;

import base.Person;

public class Main {
    public static void main(String[] args) {

        Bankai();
        
    }
    public static void Bankai() {
        
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


        



    }
}
