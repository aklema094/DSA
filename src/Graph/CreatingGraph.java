
package Graph;

import java.util.ArrayList;

public class CreatingGraph {
    
    static class Edge{
        int src,dest,wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void main(String[] args) {
       
        ArrayList<Edge> graph[] = new ArrayList[5];
        
        for (int i = 0; i < graph.length; i++) { 
            graph[i] = new ArrayList<>();
            
        }
        // vertex 0
        graph[0].add(new Edge(0,1,5));
        
        // vertex 1
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));
        
        // vertex 2
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,4,2));
        
        // vertex 3
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));
        
        // vertex 4
        graph[4].add(new Edge(4,2,2));
        
        for (int i = 0; i < graph[1].size(); i++) {
            
            System.out.print(graph[1].get(i).dest+" ");
            
        }
    }
    
}
