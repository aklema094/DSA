/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author user
 */
public class BFSandDFSTraversal {
    
      private static class Edge{
        int src,dest,wt;
        Edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge> graph[]){
        
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
    }
    
    public static void bfs(boolean[] visit,int start,ArrayList<Edge> graph[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        
        while(!q.isEmpty()){
            int curr = q.remove();
            if(visit[curr] == false){
                System.out.print(curr+" ");
                visit[curr] = true;
                
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
        
    }
    
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] travle){
        
        System.out.print(curr+" ");
        travle[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++) {
            
            Edge e = graph[curr].get(i);
            
            if(!travle[e.dest]){
                dfs(graph,e.dest,travle);
            }
            
        }
        
    }
    public static void main(String[] args) {
         ArrayList<Edge> graph[] = new ArrayList[5];
         createGraph(graph);
         
        boolean visit[] = new boolean[graph.length];
        for(int i =0; i<graph.length; i++){
            if(visit[i] == false){ 
                bfs(visit,i,graph);
            }
            
        }
        System.out.println("");
        boolean[] travle = new boolean[graph.length];
        
        dfs(graph,0,travle);
        
        
    }
    
   
    
    
}
