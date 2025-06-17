import java.util.*;
public class GraphBFS{
    private Map<Integer, List<Integer>> adjList;

    public GraphBFS() {
        adjList = new HashMap<>();
    }
    public void addVertex(int vertex)
	{
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }
    public void addEdge(int from, int to)
	{
        adjList.putIfAbsent(from, new ArrayList<>());
        adjList.putIfAbsent(to, new ArrayList<>());
        adjList.get(from).add(to);
    }
    public void bfs(int start)
	{
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.offer(start);
        System.out.print("BFS Traversal starting from vertex " + start + ": ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList.get(vertex))
			{
                if (!visited.contains(neighbor))
				{
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        GraphBFS graph = new GraphBFS();
        System.out.print("Enter no of edges: ");
        int edges = sc.nextInt();
        System.out.println("Enter edges in the format <from> <to>: ");
        for (int i = 0; i < edges; i++)
		{
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.addEdge(from, to);
        }
        System.out.print("Enter the starting vertex for BFS: ");
        int startVertex = sc.nextInt();
        graph.bfs(startVertex);
        sc.close();
    }
}
