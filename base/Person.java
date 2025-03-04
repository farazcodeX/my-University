package base;

import java.util.ArrayList;

public class Person {

    public int ID;
    public static ArrayList<Person> personList;
    public String name;
    public String nationalID;

    // constructor
    public Person(String name, String nationalID)
    {
        this.name = name;
        this.nationalID = nationalID;
        ID = personList.size();

        personList.add(this);


    }
    public static Person findByID(int ID)
    {
        for(int i = 0; i < personList.size(); ++i)
        {
            if(personList.get(i).ID == ID)
            {
                return personList.get(i);
            }
        }
        return null;
        

    }


}