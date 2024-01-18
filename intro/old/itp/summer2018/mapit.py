import webbrowser, sys, pyperclip

if(len(sys.argv) > 1):
    address = sys.argv[1:]
    address = ' '.join(address)
else:
    address = pyperclip.paste()

webbrowser.open("https://www.google.com/maps/place/"+address)
# 525 ABC Street, Nowhere, North Dakota