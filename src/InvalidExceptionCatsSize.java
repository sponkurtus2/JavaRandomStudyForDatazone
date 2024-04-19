public class InvalidExceptionCatsSize extends Exception{
    
    public InvalidExceptionCatsSize(String msg) {
        super(msg);
    } 

    public static void aaa() {
        System.err.println("Hola");
    }

    public void bbb() {
        System.err.println("Hola");
        ccc();
    }

    void ccc() {System.err.println("Hola");}

    

}