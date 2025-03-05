package UNI;

import java.util.ArrayList;

public class Student {
    
    public int ID;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public String personID;
    public final int entranceYear;
    public int majorID;
    public String studentID;

    public Student(String personID, int entranceYear, int majorID)
    {
        this.personID = personID;
        this.entranceYear = entranceYear;
        this.majorID = majorID;
        
        setStudentCode();
       
        studentList.add(this); 
        this.ID = studentList.size() + 1;

        // idk this will work or nah
        

    }
    public static Student studentFindBy(int ID)
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
       studentID = String.valueOf(entranceYear) + String.valueOf(majorID) + String.valueOf(ID);
    }
}
