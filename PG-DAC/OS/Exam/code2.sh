#PATTERN PRINTING PROGRAM
num=1
for((i=1;i<=10;i++))
do
	for((j=10;j>i;j--))
	do
		echo -n "  "
	done
	for((x=1;x<=i;x++))
	do
		echo -n "  $num"
		num=`expr $num + 1`;
	done
		echo " "
done
