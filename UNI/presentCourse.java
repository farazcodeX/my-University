package UNI;

import java.util.ArrayList;

public class PresentCourse {
    
    public int ID;
    public static ArrayList<PresentCourse> presentCourseList = new ArrayList<>();
    public int courseID;
    public int proffesorID;
    public final int capacity;
    public static ArrayList<String> students = new ArrayList<>();

    public PresentCourse(int courseID, int proffesorID, int maxCapacity)
    {
        this.courseID = courseID;
        this.proffesorID = proffesorID;
        this.capacity = maxCapacity;
        this.ID = presentCourseList.size() + 1;

        presentCourseList.add(this);

    }
    public static PresentCourse findByID(int ID)
    {
        for(int i = 0; i < presentCourseList.size(); ++i)
        {
            if(presentCourseList.get(i).ID == ID)
            {
               return presentCourseList.get(i);
            }
        }
        return null;
    }
    public void addStudent(String stuID)
    {
        if(students.size() <= capacity)
        {
            this.students.add(stuID);
        }
        else
        System.out.println("Course is full :(");
      
        
    }
    
    
}
