/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class SinglelevelInheritance {   
    public static void main(String[] args) {   
        Cat cat = new Cat();
        cat.faceShape = "Round";
        System.out.println(cat.faceShape);
        cat.canEat(); 
    }   
}
 class Animals{  
    String faceShape;
    void canEat(){
        System.out.println("Animals can eat");
    }
}
class Cat extends Animals{
    int lagSize;
}
