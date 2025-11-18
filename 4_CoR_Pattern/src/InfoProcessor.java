public class InfoProcessor extends LogProcessor{

    InfoProcessor(LogProcessor loggerProcessor) {
        super(loggerProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if (logLevel==INFO) {
            System.out.println("INFO=> "+message);
        }
        else{
            nextLoggerProcessor.log(logLevel,message);
        }
    }
}
