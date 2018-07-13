import bs4,requests,webbrowser,sys


query = ' '.join(sys.argv[1:])
print("Surfing the interwebs for "+query  + "...")


res = requests.get("https://www.google.com/search?q=" + query)
res.raise_for_status()

soup = bs4.BeautifulSoup(res.text, "lxml")
links = soup.select(".r a")
for link in links[:5]:
    #print(link.get("href"))
    webbrowser.open("https://www.google.com"+link.get("href"))