import turtle

if __name__ == "__main__":
    lines  = open("kitty.txt","r").readlines()
    bob  = turtle.Turtle()
    for dots in lines:
        dots = dots.strip()
        dots = dots.split("),")
        
        bob.penup()
        bob.speed(1)
        for dot in dots:
            dot = dot.replace("(","")
            dot = dot.replace(")","")
            coords = dot.split(",")
            x = float(coords[0]) * 23.5
            y = float(coords[1]) * 23.5
            bob.goto(x,y)
            
            bob.pendown()
        
    turtle.done()
