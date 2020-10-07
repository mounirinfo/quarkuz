# quarkuz
Repository to explore basic functionnalities of quarkus

1- Generate react app
2- Generate Backend based on quarkus

mvn io.quarkus:quarkus-maven-plugin:1.8.1.Final:create \
    -DprojectGroupId=com.quarkuz \
    -DprojectArtifactId=back \
    -DclassName="com.quarkuz.back.GreetingResource" \
    -Dpath="/hello"

3- Run backend

ce back
./mvnw compile quarkus:dev

4- 
