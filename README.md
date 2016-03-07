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

### Code Generation
When running `mvn install` or `mvn generate-sources`, any `.jj` files saved in `src/main/javacc` will be compiled into `.java` sources. These will be saved under `target/generated-sources/javacc/{package-name}`. IntelliJ will include this in your classpath automatically (so you can refernce these classes in your source code), you may need to add these manually if you are using Eclise.

### IntelliJ Setup
There are various run configurations you can setup in IntelliJ for use with this project.

#### Build and Run
1. Add new configuration > JAR Applicaiton
2. Path to JAR: "target/se701-0.1.0-SNAPSHOT.jar"
3. Before Launch: Run Maven Goal "clean install"

#### Build without Running
1. Add new configuration > Maven
2. Command Line: "clean install"

#### Recompile JJ Files
1. Add new configuration > Maven
2. Command Line: "clean generate-sources"
