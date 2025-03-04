package UNI;

import java.util.ArrayList;

public class student {
    
    public int ID;
    public static ArrayList<student> studentList;
    public int personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public student(int personID, int entranceYearm, int majorID)
    {
        this.personID = personID;
        this.entranceYear = entranceYearm;
        this.majorID = majorID;
        this.ID = studentList.size();
        setStudentCode();

        studentList.add(this);


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
