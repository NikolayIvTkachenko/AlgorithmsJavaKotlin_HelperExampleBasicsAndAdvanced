package Advanced_Algorithms.KruskalAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KruskalAlgorithm {

    public void spanningTree(List<Vertex> vertexList,List<Edge> edgeList){

        DisjointSet disjointSet = new DisjointSet(vertexList);

        List<Edge> tree = new ArrayList<Edge>();

        Collections.sort(edgeList);

        for (Edge e : edgeList) {
            Vertex u = e.getStartVertex();
            Vertex v = e.getTargetVertex();
            if (disjointSet.find(u.getNode()) != disjointSet.find(v.getNode())) {
                tree.add(e);

                disjointSet.union(u.getNode(), v.getNode());
            }
        }

        for(Edge edge : tree){
            System.out.print(""+edge.getStartVertex()+""+edge.getTargetVertex()+"-");
        }
    }
}
