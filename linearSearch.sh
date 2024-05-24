nos=(10 20 40 50 60 70 80 90 100)
read -p "enter element to search " x
found="false"
for(( i=0; i<${#nos[@]}; i++)); do
    if [ ${nos[$i]} == $x ]; then
        echo "$x found at $i index"
        found="true"
    fi
done
if [ $found=="true" ]; then
echo "$x found"
else
echo "$x not found"
fi



