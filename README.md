# javacc-maven-template
A template maven project for using JavaCC in a project. Beneficial if you'd like to use JavaCC with an IDE other than eclipse easily,
or if you'd like your JavaCC files to compile automatically with the rest of your project. This project will generate .java files
from your .jj files automatically when you run `mvn install`.

## Usage

```
git clone git@github.com:SarenCurrie/javacc-maven-template.git
cd javacc-maven-template
mvn clean install
java -jar target/se701-0.1.0-SNAPSHOT.jar
```
