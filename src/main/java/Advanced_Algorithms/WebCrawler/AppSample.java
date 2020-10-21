package Advanced_Algorithms.WebCrawler;

public class AppSample {

    public static void main(String[] args) {

        String root = "http://www.main.ru";  //"http://www.rsh-engineering.com";
        BFS bfs = new BFS();
        bfs.discoverWeb(root);

    }

}
