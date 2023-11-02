import networkx as nx
import matplotlib.pyplot as plt

G  = nx.graph_atlas(99)
nx.draw(G, with_labels= True)
plt.show()