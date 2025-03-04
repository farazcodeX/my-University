package UNI;

import java.util.ArrayList;

public class Proffessor {

    public int ID;
    public static ArrayList<Proffessor> profList;
    
    // shows the person Object thet this peroff is.
    public int personID;

    // major that this press gives
    public int majorID;


    public Proffessor(int personID, int majorID)
    {
        this.personID = personID;
        this.majorID = majorID;
        ID = profList.size();
        profList.add(this);
        

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
