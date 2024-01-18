import re

text = "Agent Alice gave the secret documents to Agent Bob.  Apparently Agent X is a traitor."
agentRegex = re.compile("(Agent) ([A-Z][a-z]*)")
#for match in agentRegex.findall(text):
#	print(match)
newText = agentRegex.sub(r'\1 REDACTED', text)
print(newText)
