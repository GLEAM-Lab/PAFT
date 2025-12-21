cp origin/* src/main/java/humaneval/buggy/
echo "cp ../evalrepair-java-res/$3/fixed$1/$2.java src/main/java/humaneval/buggy/"
cp ../evalrepair-java-res/$3/fixed$1/$2.java src/main/java/humaneval/buggy/
echo "cat ../evalrepair-java-res/$3/fixed$1/$2.java"
cat ../evalrepair-java-res/$3/fixed$1/$2.java
echo "mvn test -Dtest=TEST_$2"
timeout 1m mvn test -Dtest=TEST_$2
