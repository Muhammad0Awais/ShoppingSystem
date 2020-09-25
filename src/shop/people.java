/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

/**
 *This is the base class for consumers and Customers, there functions are getters and setters with the validation
 * @author Hp
 */
public abstract class people {
    protected String name, gender;
    protected int age;
    
    //Name Getter
    public String getName() {
        return name;
    }

    public void setName(String name)//Setter with validation of name can't be empty 
    {
        if(!name.isEmpty())
        {
            this.name = name;
        }
        else
        {
            System.out.println("Error! Name can't be empty");
        }
    }

    //Age getter
    public int getAge() {
        return age;
    }

    public void setAge(int age)//Setter with validation of age can't be less than 1
    {
        assert(age>=0 && age<=190):"Age can't be less less than 1";
        this.age = age;
    }

    //Gender Getter
    public String getGender() {
        return gender;
    }

    public void setGender(String gender)//Setter with validation of gender can't be anything else then male/female
    {
        if(gender.toLowerCase().contains("male")||gender.toLowerCase().contains("female"))
        {
            this.gender = gender.toLowerCase();
        }
        else{
            System.out.println("Wrong input for Gender, gender can be male or female");
        }
    }
}
