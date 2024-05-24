echo "enter the number"
read x
while [ $x -ne 0 ]; do
    if [ $((x % 2)) -eq 0 ]; then
        echo "even"
        break
    else
        echo "odd"
        break
    fi
done
if [ $x -eq 0 ]; then
    echo "not possible"
fi