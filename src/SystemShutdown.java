import java.io.IOException;
public class SystemShutdown {
    public static void main(String[] args) {
        try{
            //shutdown the pc
            Runtime.getRuntime().exec("shutdown /s /t 1 ");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
