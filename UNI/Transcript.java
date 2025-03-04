package UNI;

import java.util.HashMap;

public class Transcript {
  
    public int studentID;
    public HashMap<Integer, Double> transcript;

    public Transcript(int studentID)
    {
        this.studentID = studentID;
        transcript = new HashMap<>();

    }
    public void setGrade(int presentCourseID, double grade)
    {
        


    }
    public void printTranscript()
    {

    }
    public double getGPA()
    {
        return 0;
    }
}
