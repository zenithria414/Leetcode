class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;

        ArrayList<Integer>[] graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int[] e : edges){
            int u = e[0], v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();

        q.add(source);
        visited[source] = true;

        while(!q.isEmpty()){
            int curr = q.remove();
            if(curr == destination) return true;
            for(int neighbour : graph[curr]){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    q.add(neighbour);
                }
            }
        }

        return false;

    }
}