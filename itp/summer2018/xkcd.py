import bs4, requests, os

os.makedirs("xkcd", exist_ok=True)



for i in range(1,11):
    targetPage =  "https://www.xkcd.com/"+str(i)
    res = requests.get(targetPage)
    print("Got page "+ targetPage)
    soup = bs4.BeautifulSoup(res.text,"lxml")
    comicElm = soup.select("#comic img")
    comicURL = "https:"+comicElm[0].get("src")
    print(comicURL)
    res = requests.get(comicURL)
    res.raise_for_status()

    image = open( "./xkcd/" +str(i) +".jpg","wb")
    for chunk in res:
        image.write(chunk)

    image.close()
