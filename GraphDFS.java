import java.util.*;
public class GraphDFS
{
    private Map<Integer, List<Integer>> adjList;
    public GraphDFS()
	{
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
    public void dfs(int start)
	{
        Set<Integer> visited = new HashSet<>();
        System.out.print("DFS Traversal starting from vertex " + start + ": ");
        dfsUtil(start, visited);
        System.out.println();
    }
    private void dfsUtil(int vertex, Set<Integer> visited) 
	{
        visited.add(vertex);
        System.out.print(vertex + " ");
        for (int neighbor : adjList.get(vertex)) 
		{
            if (!visited.contains(neighbor)) 
			{
                dfsUtil(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        GraphDFS graph = new GraphDFS();
        System.out.print("Enter no of edges: ");
        int edges = sc.nextInt();
        System.out.println("enter edges in the format <from> <to>: ");
        for (int i = 0; i < edges; i++)
		{
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.addEdge(from, to);
        }
        System.out.print("Enter the starting vertex for DFS: ");
        int startVertex = sc.nextInt();
        graph.dfs(startVertex);
        sc.close();
    }
}