import jupyter
import altair

x_vals = []
y_vals = []

# x**2 = y

for x in range(-10,11):
	x_vals.append(x)
	y_vals.append(x**2)

data = altair.Data(X=x_vals, Y=y_vals)
print(data)
