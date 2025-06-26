public class variable {

    
    int globalVar = 100;

    public void showVariables() {
        
        int localVar = 50;

        System.out.println("Global Variable: " + globalVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        variable obj = new variable();
        obj.showVariables();
    }
}
