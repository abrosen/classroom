name = 'Mary'
password = 'swordfish'
if name == 'Mary':
    print('Hello Mary')
    if password == 'swordfish':
        print('Access granted.')  # computers can't see this
    elif password == '12345':
        print("backup password accepted.  Please see your email to reset password")
    else:
        print('Wrong password.')
        # Hey, do we want to change this?
        # print("Deploying killbots.")
        
else:
    print("Unauthorized user.")
