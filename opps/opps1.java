package opps;


public class opps1 {
    
}

class Pen{
    String color;
    int tip;
    
    void setColor(){
        color="red";
    }
    void getTip(){
        tip=5;
    }
}

class Student{
    String name;
    int age;
    float percetage;

    void calculatePrecentage(int phy, int chem, int math){
        percetage=(phy+chem+math)/3;
    }
}