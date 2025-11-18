public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor=new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logProcessor.log(1,"Info Message");
        logProcessor.log(2,"Debug Message");
        logProcessor.log(3,"Error Message");
        logProcessor.log(10,"Random Message");

    }
}
