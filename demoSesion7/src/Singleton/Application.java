package Singleton;

public class Application {
    private static Application application;
    boolean isRunning = false;

    private Application(){}

    public static  Application getInstance(){
        if(application == null){
            application = new Application();
        }
        return application;
    }

    public void Run(){
        if(!isRunning){
            isRunning = true;
        }else{
            System.out.println("ya estaba en ejecucion");
        }
    }
}
