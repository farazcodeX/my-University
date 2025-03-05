package UNI;

import java.util.HashMap;

public class Transcript {
  
    public String studentID;
    public HashMap<Integer, Double> transcript;

    
    public int units = 0;
    private double sumGrades = 0;

    public Transcript(String studentID)
    {
        // this stuID is not studentID its just ID 

        this.studentID = studentID;
        transcript = new HashMap<>();

    }
    public void setGrade(int presentCourseID, double grade)
    {
        // exit1 means cours founded
        boolean exit1 = false;
       // exit2 means student founded
        boolean exit2 = false;

       ++units;




        for(int i = 0; i < presentCourse.presentCourseList.size(); ++i)
        {
            if(presentCourse.presentCourseList.get(i).courseID == presentCourseID)
            {
                for(int j = 0; j < presentCourse.students.size(); ++j)
                {
                    if(presentCourse.students.get(j).equals(studentID))
                    {
                     transcript.put(presentCourseID, grade);
                     exit2 = true;
                     break;
                    }
                }
                exit1 = true;
                break;
                
               
            }


        }
        if(!exit1)
        {
            System.out.println("Course not founded");
        }
        if(!exit2)
        {
            System.out.println("this student wasnt in the course");
        }


        


    }
    public void printTranscript()
    {
        for(int i = 0; i < presentCourse.presentCourseList.size(); ++i)
        {
            for(int j = 0; j < presentCourse.students.size(); ++j)
            {
                if(presentCourse.students.get(j).equals(studentID))
                {
                    if(transcript.containsKey(presentCourse.presentCourseList.get(i).courseID))
                    {
                        double grade = transcript.get(presentCourse.presentCourseList.get(i).courseID);
                        sumGrades += grade;
                       
                        System.out.print("Corse "+ presentCourse.presentCourseList.get(i).courseID + "grade : " + grade);
                    }

                }
            }

            

        }

    } 
  
    public double getGPA()
    {
        return sumGrades/units;
    }
}
