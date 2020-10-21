package Advanced_Algorithms.PrimJarnikGreedy;

import java.util.ArrayList;
import java.util.List;

public class Vertex  implements Comparable<Vertex>{

    private String name;
    private Edge minEdge;
    private boolean visited;
    private Vertex previousVertex;
    private double minDistance = Double.POSITIVE_INFINITY;
    private List<Edge> adjacencies;

    public Vertex(String name) {
        this.name = name;
        this.adjacencies = new ArrayList<>();
    }

    public Vertex getPreviousVertex() {
        return previousVertex;
    }

    public void addEdge(Edge edge){
        this.adjacencies.add(edge);
    }

    public Edge getMinEdge() {
        return minEdge;
    }

    public void setMinEdge(Edge minEdge) {
        this.minEdge = minEdge;
    }

    public List<Edge> getAdjacencies() {
        return adjacencies;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    public void setPreviousVertex(Vertex previousVertex) {
        this.previousVertex = previousVertex;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    @Override
    public String toString() {
        return ""+this.name;
    }

    @Override
    public int compareTo(Vertex otherVertex) {
        return Double.compare(this.minDistance, otherVertex.getMinDistance());
    }
}
