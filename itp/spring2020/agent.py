import re
text = 'Agent Alice gave the secret documents to Agent Bob.'
namesRegex = re.compile(r'(\w)\w+')
print(namesRegex.sub(r'\1', text))