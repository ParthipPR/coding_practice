message = input('Enter the message to be encrypted:')
keys = int(input('Enter the key for encrytion:'))
encrypted_message = ''
for ch in message:
    ordvalue = ord(ch)
    cyphervalue = ordvalue + keys
    if cyphervalue > ord('z'):
        cyphervalue =  ord('a')+keys-1 #need check for validity/correctness
    encrypted_message += chr(cyphervalue)

print(encrypted_message)


