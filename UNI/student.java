package UNI;

import java.util.ArrayList;

public class student {
    
    public int ID;
    public static ArrayList<student> studentList;
    public String personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public student(String personID, int entranceYear, int majorID)
    {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        
        setStudentCode();

        studentList.add(this);
        // idk this will work or nah
        this.ID = studentList.size();

    }
    public static student studentFindBy(int ID)
    {

        for(int i = 0; i < studentList.size(); ++i)
        {
            if(studentList.get(i).ID == ID)
            return studentList.get(i);

        }
        return null;

    }
    public void setStudentCode()
    {
       studentID = String.valueOf(ID) + String.valueOf(entranceYear);
    }
}
