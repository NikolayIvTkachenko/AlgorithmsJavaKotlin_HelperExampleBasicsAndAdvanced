package Advanced_Algorithms.KruskalAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class DisjointSet {

    private int nodeCount = 0;
    private int setCount = 0;
    private List<Node> rootNodes;

    public DisjointSet(List<Vertex> vertices) {
        this.rootNodes = new ArrayList<Node>(vertices.size());
        makeSets(vertices);
    }

    public int find(Node n) {

        Node current = n;

        while (current.getParent() != null)
            current = current.getParent();

        Node root = current;
        current = n;
        while (current != root) {
            Node temp = current.getParent();
            current.setParent( root );
            current = temp;
        }

        return root.getId();
    }

    public void union(Node node1, Node node2) {
        int index1 = find(node1);
        int index2 = find(node2);

        if (index1 == index2)
            return;

        Node root1 = this.rootNodes.get(index1);
        Node root2 = this.rootNodes.get(index2);

        if (root1.getHeight() < root2.getHeight()) {
            root1.setParent(root2);
        } else if (root1.getHeight() > root2.getHeight()) {
            root2.setParent(root1);
        } else {
            root2.setParent(root1);
            root1.setHeight(root1.getHeight()+1);
        }

        this.setCount--;
    }

    public void makeSets(List<Vertex> vertices) {
        for (Vertex v : vertices)
            makeSet(v);
    }

    public void makeSet(Vertex vertex) {
        Node n = new Node(0, rootNodes.size(), null);
        vertex.setNode(n);
        this.rootNodes.add(n);
        this.setCount++;
        this.nodeCount++;
    }


}
