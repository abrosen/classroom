def foo():
    pass
    #print("foo")

def bar():
    foo()
    #print("bar")
    baz()

def baz():
    #print("baz")
    foo()
    bar()

foo()
bar()
baz()
