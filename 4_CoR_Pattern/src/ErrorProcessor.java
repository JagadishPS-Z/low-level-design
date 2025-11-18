public class ErrorProcessor extends LogProcessor{

    ErrorProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel==ERROR) {
            System.out.println("INFO=> "+message);
        }
        else{
            System.out.println("DEFAULT IMPL=>" + message);
        }
    }
}
