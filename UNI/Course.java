package UNI;

import java.util.ArrayList;

public class Course {
    
    public int ID;
    public static ArrayList<Course> courseList = new ArrayList<>();
    public String title;
    public int units;
    
    public Course(String title ,int ID)
    {
        this.title = title;
        this.ID = ID;

    }
    public static Course findByID(int ID)
    {
        for (int i = 0; i < courseList.size(); i++) {
            
            if(ID == courseList.get(i).ID)
            {
                return courseList.get(i);
            }
            

        }
        return null;
    }

    
}
