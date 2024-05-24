#!/bin/bash
echo "Enter the number : "
read n
while [ $n -gt 0 ]
do
	if [ $(($n%2)) -eq 0 ] ; then
		echo "even number"
	elif [ $(($n%2)) -ne 0 ] ; then 
		echo "odd number"
	else 
		echo "zero"
		break
        fi
        echo "Enter the number : "
	read n	
done

