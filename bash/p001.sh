sum=0;

for i in {1..999}
do
  [ $(($i % 3)) -eq 0 ] || [ $(($i % 5)) -eq 0 ] && sum=$(($sum + $i));
done

echo $sum;
