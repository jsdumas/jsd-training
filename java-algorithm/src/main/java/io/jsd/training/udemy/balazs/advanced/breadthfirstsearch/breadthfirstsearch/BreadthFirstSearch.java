package io.jsd.training.udemy.balazs.advanced.breadthfirstsearch.breadthfirstsearch;

import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

	public void bfs(Vertex root){
		//Fifo data structure
		Queue<Vertex> queue = new LinkedList<>();
		root.setVisited(true);
		queue.add(root);
		while( !queue.isEmpty() ){
			Vertex actualVertex = queue.remove();
			System.out.print(actualVertex+" ");
			for( Vertex child : actualVertex.getChilds() ){
				if( !child.isVisited() ){
					child.setVisited(true);
					queue.add(child);
				}
			}			
		}
	}
}
