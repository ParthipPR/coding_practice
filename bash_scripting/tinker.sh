#! /usr/bin/bash

echo 'hello world'
echo ' what is your name? '
sleep 1
read name 

echo 'hello' $name
sleep 1
echo 'what can i do for you '
echo 'if nothing then enter 0'
read response

if [[ $response -eq 0 ]]
then
    echo 'bye'
    exit
fi

