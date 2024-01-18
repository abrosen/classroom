
done = False
tries = 0
while (not done) and (tries < 3):
    print('Who are you?')
    name = input()
    if name != 'Joe':
        tries +=1
        continue
    print('Hello, Joe. What is the password? (It is a fish.)')
    password = input()
    if password == 'swordfish':
        done = True
    else:
        tries += 1
if(tries < 3):
    print('Access granted.')
else:
    print('go away!')
