#!/bin/bash
echo "enter the filename to search"
read file_name
if [ -f "$file_name" ]; then
	echo "$file_name is exists"
else
	echo "not exists"
fi
