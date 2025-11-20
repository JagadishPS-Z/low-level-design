import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
   List<FileSystem> dList=new ArrayList<>();
   String name;

   public Directory(String name){
       this.name=name;
   }

   public void add(FileSystem f){
       this.dList.add(f);
   }

    @Override
    public void ls() {
       System.out.println("Directory Name: "+this.name);
        for(FileSystem f:this.dList){
            f.ls();
        }
    }
}
