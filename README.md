# service-boot-archetypes
service boot archetypes

Maven Archetype for create the base of spring boot service with base swagger configurated and configuration base for Model Mapper  .

for use in local repository clone project and  launch the command

* `mvn clean install`


On build successful , look in your .m2 directory if file jar was created. (.m2/repository/it/service/service-boot-archetypes/1.0-SNAPSHOT/).
Now is possible gerate project!

# Create Services project by Archetype 

Is possible generate  the project by maven command line or by a  IDE like Intellij Idea or Eclipse.
Here we use only maven command line.

For  IntelliJ Idea https://plugins.jetbrains.com/plugin/7965-maven-archetype-catalogs 
and https://www.jetbrains.com/help/idea/maven-support.html#create_new_maven_project 

For Eclipse please use wizard for new project , I can not find documentation on it :-(

# Maven Build 

 *  `mvn archetype:generate -B  -DarchetypeGroupId=it.service   -DarchetypeArtifactId=service-boot-archetypes   -DarchetypeVersion=1.0-SNAPSHOT   -DgroupId=com.company   -DartifactId=project  -Dversion=1.0-SNAPSHOT   -Dpackage=com.company.project`





