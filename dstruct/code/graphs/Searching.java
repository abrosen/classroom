package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;

public class Searching {

		
		
		
	public static <V,E> List<V> BFS(Graph<V,E> g, V start){
		List<V> visitOrder = new ArrayList<V>();
		Set<V>  seen = new HashSet<V>();
		Queue<V> queue = new LinkedList<V>();
		
		seen.add(start);
		queue.offer(start);
		while(!queue.isEmpty()) {
			V current = queue.poll();
			for(V neighbor : g.getNeighbors(current)) {
				if(!seen.contains(neighbor)) {
					seen.add(neighbor);
					queue.offer(neighbor);
				}
			}
			visitOrder.add(current);
			
		}
		
		return visitOrder;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Graph<String,Integer> g = new SparseGraph<String,Integer>();
		g.addEdge(1, "S", "A");
		g.addEdge(2, "S", "B");
		g.addEdge(3, "S", "C");
		g.addEdge(4, "S", "X");
		g.addEdge(5, "X", "Y");
		g.addEdge(6, "A", "D");
		g.addEdge(7, "D", "B");
		g.addEdge(8, "B", "E");
		g.addEdge(9, "E", "G");
		g.addEdge(10, "C", "F");
		
		
		System.out.println(BFS(g, "S"));
	}

}
