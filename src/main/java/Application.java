import junit.framework.Test;

public class Application{
    public static void main(String[] args) {
       //Runner object
       Runner runnerVariable = new Runner();  
       //invoke static method  
        String sample = Class.global_var;
       //invoke runner method 
       runnerVariable.changeClassVar(sample);
        

    }
}