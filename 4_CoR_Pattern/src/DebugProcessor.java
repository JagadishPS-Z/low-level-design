public class DebugProcessor extends LogProcessor{

    DebugProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel==DEBUG) {
            System.out.println("INFO=> "+message);
        }
        else{
            nextLoggerProcessor.log(logLevel,message);
        }
    }
}
