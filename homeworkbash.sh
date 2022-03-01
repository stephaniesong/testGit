mkdir a
echo "folder a is created"
cd ./a
mkdir b
echo "folder b is created"
cd b
touch text.txt
echo "text.txt file is created"
cd ..
rm -r *
