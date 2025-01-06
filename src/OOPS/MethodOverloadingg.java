/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOPS;

/**
 *
 * @author user
 */
public class MethodOverloadingg {
    
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(5,10,15));
    }
    
}
