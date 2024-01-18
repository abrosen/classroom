

# given n, tells me how many numbers are in the collatz sequence
# 5 -> 16 -> 8 -> 4 -> 2 -> 1  => 6 
# 3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 => 8
def collatzLength(n):
	done = False
	sequence = []
	sequence.append(n)
	#steps = 1
	while n > 1:
		if n % 2 == 0:
			n = n // 2
		else:
			n = n * 3 + 1
		sequence.append(n)
		
		#steps = steps + 1
	
	return sequence, len(sequence)
	

for i in range(1,101):	
	seq, step = collatzLength(i)
	print(seq,"has", step, "steps.") 

