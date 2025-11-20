public class Main {
    public static void main(String[] args){
        Directory movieDirectory = new Directory("Movie");
        FileSystem border = new File("Border");
        FileSystem hungama=new File("Hungama");
        movieDirectory.add(border);
        movieDirectory.add(hungama);

        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        File golmaal=new File("Golmaal");
        comedyMovieDirectory.add(hulchul);
        comedyMovieDirectory.add(golmaal);
        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
