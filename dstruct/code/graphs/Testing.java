package graphs;

import java.awt.Dimension;

import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.DirectedSparseGraph;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseGraph;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;
import edu.uci.ics.jung.visualization.decorators.ToStringLabeller;

public class Testing {

	
	
	
	public static void main(String[] args) {
		Graph<String, Integer>  g =  new SparseGraph<String,Integer>();
		g.addVertex("A");
		
		g.addVertex("B");
		g.addVertex("C");
		g.addEdge(2, "B", "A");
		
		g.addEdge(1, "A", "B");
		
		g.addEdge(3, "C", "B");
		
		System.out.println(g);
		
		
		
		
	    //SimpleGraphView sgv = new SimpleGraphView(); //We create our graph in here
	    //// The Layout<V, E> is parameterized by the vertex and edge types
	    Layout<Integer, String> layout = new CircleLayout(g);
	    layout.setSize(new Dimension(600,600)); // sets the initial size of the space
	     // The BasicVisualizationServer<V,E> is parameterized by the edge types
	     BasicVisualizationServer<Integer,String> vv = 
	              new BasicVisualizationServer<Integer,String>(layout);
	     //vv.setPreferredSize(new Dimension(350,350)); //Sets the viewing area size
	     vv.getRenderContext().setVertexLabelTransformer(new ToStringLabeller());
		vv.getRenderContext().setEdgeLabelTransformer(new ToStringLabeller());
			
	     JFrame frame = new JFrame("Simple Graph View");
	     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.getContentPane().add(vv); 
	     frame.pack();
	     frame.setVisible(true);       
	}

}
