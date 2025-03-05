package UNI;

import java.util.HashMap;

public class Transcript {
  
    public String studentID;
    public HashMap<Integer, Double> transcript = new HashMap<>();

    
    public int units = 0;
    public double sumGrades = 0;

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

       units += 1;




        for(int i = 0; i < PresentCourse.presentCourseList.size(); ++i)
        {
            if(PresentCourse.presentCourseList.get(i).courseID == presentCourseID)
            {
                for(int j = 0; j < PresentCourse.students.size(); ++j)
                {
                    if(PresentCourse.students.get(j).equals(studentID))
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
        System.out.println("student " + studentID);
        for(int i = 0; i < PresentCourse.presentCourseList.size(); ++i)
        {
            for(int j = 0; j < PresentCourse.students.size(); ++j)
            {
                if(PresentCourse.students.get(j).equals(studentID))
                {
                    if(transcript.containsKey(PresentCourse.presentCourseList.get(i).courseID))
                    {
                        double grade = transcript.get(PresentCourse.presentCourseList.get(i).courseID);
                        sumGrades += grade;
                       
                        System.out.println("Corse    "+ PresentCourse.presentCourseList.get(i).courseID + "    grade : " + grade);
                    }

                }
            }

            

        }
        System.out.println();
        System.out.println();

    } 
  
    public double getGPA()
    {
        double GPA = sumGrades / (double)(units+1);
        return GPA;
    }
}
