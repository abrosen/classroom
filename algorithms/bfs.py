import networkx as nx

def bfs(G,s):
    q = []
    seen = set()
    dist = {}
    
    q.insert(0,s)
    seen.add(s)
    dist[s] = 0
    while len(q) != 0:
        current = q.pop()
        for v in G.neighbors(current):
            if v not in seen:
                seen.add(v)
                q.insert(0,v)
                dist[v] = dist[current] + 1
    return dist

G = nx.Graph()
G.add_edge("a","b")
G.add_edge("b","c")
G.add_edge("b","d")
print(bfs(G, "a"))