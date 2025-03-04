package UNI;

import java.util.ArrayList;

public class presentCourse {
    
    public int ID;
    public static ArrayList<presentCourse> presentCourseList;
    public int courseID;
    public int proffesorID;
    public int capacity;
    public ArrayList<Integer> students;

    public presentCourse(int courseID, int proffesorID, int maxCapacity)
    {
        this.courseID = courseID;
        this.proffesorID = proffesorID;
        this.capacity = maxCapacity;
        this.ID = presentCourseList.size();

        presentCourseList.add(this);

    }
    public static presentCourse findByID(int ID)
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
    public void addStudent(int stuID)
    {
      this.students.add(stuID);
        
    }
    
    
}
