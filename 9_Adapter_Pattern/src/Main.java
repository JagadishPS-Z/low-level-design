public class Main {
    public static void main(String[] args){
        AdapterImpl adp=new AdapterImpl(new AdapteeImpl());
        System.out.print("weight in KGs: "+adp.ConvertWeight());
    }
}
