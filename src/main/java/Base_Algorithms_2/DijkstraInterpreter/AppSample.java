package Base_Algorithms_2.DijkstraInterpreter;

public class AppSample {

    public static void main(String[] args) {

        Algorithm algorithm = new Algorithm();

        algorithm.interpretExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");

        algorithm.result();
    }
}
