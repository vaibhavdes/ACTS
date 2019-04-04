
function time_fun(){
			echo "Current Hours $1"
			if [ $1 -ge 0 -a $1 -le 12 ] 
			then
				echo "Good Morning"
			elif [ $1 -ge 12 -a $1 -le 16 ]
			then
				echo "Good After Noon"
			elif [ $1 -ge 16 -a $1 -le 0 ] 
			then
				echo "Good Evening"			
			fi
}
function file_line(){
			line=$(cat $1 | wc -l)
			count=0
			if [ -f $1 ]
			then
				for((;count<line;))
				do
					count=`expr $count + 2`
					cat $1 | sed -n "$count p"
				done
			else
				echo "Invalid File"			
			fi
}
function S_T(){
			hours=`expr $1 / 3600`
			min=`expr $1 % 3600 `
			seconds=`expr $1 % 60`
			echo "HH::MM::SS $hours:$min:$seconds"
}
function concat(){
			echo "Concatenated String is $1"
}
function upper(){
			str=$1
			echo "${str^^}"
}

choice=1
while [ $choice -ne 0 ]
do
	#MENU
	echo "Please Choose the Option"
	echo "1. Show Current Time"
	echo "2. Print Even Lines From Files"
	echo "3. Convert Seconds to H:M:S"
	echo "4. Concat Two String"
	echo "5. Convert String to Upper Case"
	echo "0. Exit"	
	
	read choice

	case $choice in
		1)	#SHOW MESSAGE
			time=$(date +%H)
			time_fun $time 			
			;;
		2)	#PRINT EVEN LINES
			read -p "Enter File Name " fileName
			file_line $fileName
			;;
		3)	#SECONDS CONVERT
			read -p "Enter Seconds " seconds
			S_T $seconds
			;;
		4)	#CONCAT STRING
			echo "Enter String 1"
			read string1
			echo "Enter String 2"
			read string2
			string1+=$string2
			concat $string1 
			;;
		5)	#CONVERT TO UPPER
			echo "Enter String to Convert to Upper"
			read string3
			upper  $string3
			;;
		0)
			echo "Thank You"
			;;
		*)	
			echo " "
			echo "Enter Valid Option"
			;;
	esac
done
