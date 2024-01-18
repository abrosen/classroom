import bs4, requests

testSoup = bs4.BeautifulSoup(open("example.html"),"lxml")
print(testSoup.select("#author")[0].getText())
pElems = testSoup.select('p')
for p in pElems:
    print(p)
spanElem = testSoup.select("span")
print(spanElem[0].attrs)