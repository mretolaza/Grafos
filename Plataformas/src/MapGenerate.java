import java.net.*; 

import org.jgrapht.graph.*;
import org.jgrapht.*;

/**
 * @author María Mercedes Retolaza Reyna 
 *
 */
public class MapGenerate {

	public MapGenerate() {
		
		// TODO Auto-generated constructor stub
	}
	
	public static Graph <String, DefaultEdge> createHrefGraph(){
		
		 DirectedGraph<String, DefaultEdge> punt =
		            new DefaultDirectedGraph<String, DefaultEdge>(DefaultEdge.class);
		 
		 try {
			String A = "A" ; 
			String B = "B"; 
			String C = "C"; 
			String J = "J"; 
			String H = "H"; 
			String G = "G";
			String I = "I";
			String II ="II";
			String F = "F";
			String E = "E";
			String K = "K";
			
			//Nodos
			
			punt.addVertex(A);
			punt.addVertex(B); 
			punt.addVertex(C); 
			punt.addVertex(J);
			punt.addVertex(H);
			punt.addVertex(G);
			punt.addVertex(I); 
			punt.addVertex(II);
			punt.addVertex(E); 
			punt.addVertex(F); 
			punt.addVertex(K); 
		// Agregar conexiones 
			
			punt.addEdge(A, II);
			punt.addEdge(A, F);
			punt.addEdge(F, G); 
			punt.addEdge(G, H); 
			punt.addEdge(H, I); 
			punt.addEdge(I, J);
			punt.addEdge(E, B);
			punt.addEdge(E, F);
			punt.addEdge(B, C);
			punt.addEdge(E, C);
			punt.addEdge(F, C); 
			punt.addEdge(K, J); 
			punt.addEdge(K, H);
			punt.addEdge(K, G);
			punt.addEdge(K, A); 
			
			punt.addEdge(II, A); 
			punt.addEdge(F, A);
			punt.addEdge(G, F); 
			punt.addEdge(H, G); 
			punt.addEdge(I, H); 
			punt.addEdge(J, I);
			punt.addEdge(B, E);
			punt.addEdge(F, G);
			punt.addEdge(C, B);
			punt.addEdge(C, E);
			punt.addEdge(C, F); 
			punt.addEdge(J, K); 
			punt.addEdge(H, K);
			punt.addEdge(G, K);
			punt.addEdge(A, K); 
			
		 
		 } catch (Exception e){
			 
		 }
		 
		return punt;	
	}
	

}
