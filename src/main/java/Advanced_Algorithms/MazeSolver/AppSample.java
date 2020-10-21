package Advanced_Algorithms.MazeSolver;

public class AppSample {

    public static void main(String[] args) {

        //FileReader fileReader = new FileReader("C:\\map.txt", 5, 5);
        //FileReader fileReader = new FileReader("AlgoritmSource\\src\\main\\java\\MazeSolver\\map.txt", 5, 5);
        //FileReader fileReader = new FileReader("AlgoritmSource/src/main/java/MazeSolver/map.txt", 5, 5);
        FileReader fileReader = new FileReader("map.txt", 5, 5);
        fileReader.parseFile();
        MazeSolver mazeSolver = new MazeSolver(fileReader.getMap(),fileReader.getStartPositionRow(),fileReader.getStartPositionCol());
        mazeSolver.findWayOut();

    }


}
