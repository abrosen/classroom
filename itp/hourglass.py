'''
|""""""""""|
 \::::::::/
  \::::::/
   \::::/
    \::/
     ||
    /::\
   /::::\
  /::::::\
 /::::::::\
|""""""""""|
'''

def hourglass():
	print('|""""""""""|')
	for line in range(4):
		for space in range(1+line):
			print(" ",end="")
		print("\\",end="")
		for colon in range(8-line*2):
			print(":", end="")
		print("/")
	print('     ||')
	for line in range(4):
		for space in range(1+line):
			print(" ",end="")
		print("/",end="")
		for colon in range(8-line*2):
			print(":", end="")
		print("\\")
	print('|""""""""""|')
	
	
hourglass()

