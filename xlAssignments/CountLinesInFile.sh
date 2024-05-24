echo "Enter the file_name to count the no of lines: "
read file_name

fileSearch(){
	local n=1
	local file_name=$1
	n=$(wc -l < $file_name)
	echo "$n"
}
echo "no of lines in a $file_name is : $(fileSearch $file_name)"
