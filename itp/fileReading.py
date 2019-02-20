data = open("testFile.txt", 'r')

for line in data:
    print(line.strip())



"""
try{
    Scanner  scanner = new Scanner(new File("testFile.txt"));
    while(scanner.hasNextLine()) {
        String line = scanner.nextLine();
        System.out.println(line);
    }
catch(Exception e) {
    e.printStackTrace();
}

"""
