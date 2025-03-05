package UNI;

import java.util.ArrayList;

public class Proffessor {

    public int ID;
    public static ArrayList<Proffessor> profList = new ArrayList<>();
    
    // shows the person Object thet this peroff is.
    public String personID;

    // major that this press gives
    public int majorID;


    public Proffessor(String nationalID, int majorID)
    {
        this.personID = nationalID;
        this.majorID = majorID;
        profList.add(this);
        this.ID = profList.size();
        

    }
    public static Proffessor findByID(int ID)
    {
        for(int i = 0; i < profList.size(); ++i)
        {
           if(ID == profList.get(i).ID)
           {
             return profList.get(i);
           }

        }

        return null;
    }
}
