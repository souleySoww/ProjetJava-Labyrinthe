all: MainLabyr

doc : src/Action/*.java  src/Character/*.java  src/Other/*.java  src/Objet/*.java  src/General/*.java
        javadoc -d 

cls : src/Action/*.java  src/Character/*.java  src/Other/*.java  src/Objet/*.java  src/General/*.java    src/Action/*.class  src/Character/*.class  src/Other/*.class  src/Objet/*.class  src/General/*.class
        javac -d classes -cp classes -sourcepath src src/Action/*.java  src/Character/*.java  src/Other/*.java  src/Objet/*.java  src/General/*.java

clean : 
        rm -f cls/*.class 
