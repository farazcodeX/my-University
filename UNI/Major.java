package UNI;

import java.util.ArrayList;

public class Major {

    public int ID;
    public static ArrayList<Major> majorList;
    public String name;
    public final int capacity;
    public int numberOfStudents = 0;

    public Major(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;

    }
    public static Major findByID(int ID)
    {
        for(int i = 0; i < majorList.size(); ++i)
        {
            if(majorList.get(i).ID == ID)
            {
                return majorList.get(i);
            }

            
        }
        return null;       
    }
    public void addStudent()
    {
        numberOfStudents++;
        
    }


}
