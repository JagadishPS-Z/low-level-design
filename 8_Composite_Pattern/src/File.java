public class File implements FileSystem {

    String name;
    public File(String name){
        this.name=name;
    }

    @Override
    public void ls(int count) {
        int k=count;
        while(k!=0){
            System.out.print("-");
            k--;
        }
        System.out.println("File Name: "+this.name);
    }
}
