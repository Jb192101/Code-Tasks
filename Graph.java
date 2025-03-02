// Задача : Construct Graph Class (simple)
// Ссылка : https://www.codewars.com/kata/58867e2e2d2177547500007f/java

import java.util.List;
import java.util.ArrayList;

public class Graph {
    int V;
    int E = 0;
    List<List<Integer>> adj;

    public Graph(int v) {
        if(v < 0) {
            throw new IllegalArgumentException();
        } else {
            this.V = v;
            this.adj = new ArrayList<>(V);
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }
        }
    }

    public void addEdge(int v, int w) {
        if(v < 0 || w < 0 || v > V || w > V) {
            throw new IllegalArgumentException();
        } else {
            E++;
            adj.get(v).add(w);
            adj.get(w).add(v);
        }
    }
}
