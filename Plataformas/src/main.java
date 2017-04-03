import java.util.List;
import java.util.Scanner;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.DijkstraShortestPath;
import org.jgrapht.graph.DefaultEdge;

public class main {
	public static  void main (String[] args){
		
	MapGenerate prueba = new MapGenerate(); 
	
	System.out.println("Bienvenido al programa");
	Scanner scan = new Scanner(System.in);
	System.out.println("Ingrese donde esta");
	String orig = scan.nextLine();
	System.out.println("Ingrese a donde va");
	String dest =scan.nextLine(); 
	
	
	Graph <String, DefaultEdge> mapa = prueba.createHrefGraph(); 
	DijkstraShortestPath shortest = new DijkstraShortestPath(mapa, orig, dest);
	GraphPath <String, DefaultEdge> path = shortest.getPath();
	List<DefaultEdge> camino = path.getEdgeList();
	//Camino te devuelve el grafo que es la trayectoria que tienes que seguir 
	System.out.println((path.getLength()));
	//Te saca la cantidad de caminos que tiene que resolver para llegar a su destino
	 
	}
	//Yo haría el mapa con todas las flechistas que son las aristas y cada flechas y recorreria con un for el edge despues 
	//pintaria las flechas que ahi salieron 

}
