/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex.Exercicio1;

public class Singleton {

    
    private static volatile Singleton instance;

    
    private String message;

    
    private Singleton() {
       
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
        message = "Hello from Singleton!";
    }

    
    public static Singleton getInstance() {
     
        if (instance == null) {
           
            synchronized (Singleton.class) {
               
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

   
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getMessage()); 
    }
}