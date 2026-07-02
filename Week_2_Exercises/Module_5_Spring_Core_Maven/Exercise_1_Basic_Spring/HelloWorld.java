public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
    
    public static void main(String[] args) {
        // Simulating Spring bean instantiation
        HelloWorld obj = new HelloWorld();
        obj.setMessage("Hello Spring Core!");
        obj.getMessage();
    }
}
