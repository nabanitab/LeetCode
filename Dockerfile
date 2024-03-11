#from docker hub we get the base image
FROM bitnami/java

#It is the working directory in our container where the application run.
WORKDIR /app

# copy the file from host machine to container
COPY package.json .
COPY yarn.lock .

#from Maven registry i need to copy the URL
#Run command will execute our command inside the container
RUN echo "https://repo1.maven.org/maven2/" > ~/pom.xml

# copies all the files from host to container
COPY . .

#building our project using maven
RUN mvn clean install

#runs the given commands when the container runs.
CMD [ "mvn", "spring-boot-run" ]
