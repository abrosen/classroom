#!/usr/bin/python3
import webbrowser, sys, pyperclip

baseURL = "https://www.google.com/maps/place/"
if len(sys.argv) > 1:
    target = baseURL + "+".join(sys.argv[1:])
    webbrowser.open(target)
else:
    target = baseURL + pyperclip.paste()
    webbrowser.open(target)

#1801 N. Broad Street Philadelphia, PA 19122 USA
#870+Valencia+St,+San+Francisco,+CA+
