dir="TestDir"
if [[ -d $dir ]]; then
	echo "Directory already exists"
else 
	mkdir $dir
	cd $dir
	for(( i=1;i<=10;i++ )); do
		echo "File$i.txt" >> "File$i.txt"
		echo "successfully created File$i.txt"
	done
fi

