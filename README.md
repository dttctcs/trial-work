There is a docker compose file in this folder
start it (use docker compose)


to get inside of rahla container you can use: 
docker exec -ti rahla client
password: admin
to show logs: log:tail

the contexts.xml defines the routing and logic of the rahla pod
there are some example routes
*TASK* explore the example routes
    id=local-testing
        I prefer to test my routes and processors with this route, because saving the contexts.xml triggers a reload in rahla and 
        this route will be always executed because it is triggered by this timer uri
    id=hello_world is just logging a message
    id=test_processor is executing a processor, which is defined by a bean (bottom of context.xml file)
        this bean is created from the file Test.groovy in the deploy folder


        this should give you an idea how we create beans from groovy files and use them inside of rahla
    id=read_file
        read docu about apache camel file route
        if you put something in the data folder, the route gets activated
        *TASK* summarize in a few sentences how the file route works and think about a usecase for this

        *TASK*: Modify the CsvProcessor to read the csv file, and iterate over the elements
                create a message of type Map and set the body as this message
                also pass along a current timestamp in this message
                log the body in the route to verify that it is passed properly


*TASK* open the minio that is running in docker
    create a bucket
        upload the file
    
*TASK* create a route that takes the file from minio
Hint: look for documentation for apache camel

*TASK*
in the docker compose we also have a postgres, with already a user created
create a simple table with 3 colums
insert data from data.csv into this table

*TASK*
there is a json file in the data folder
create a processor, that reads the file 
and iterates over it
think about a similarity function for the fields "name" and "name2".
Create a table in postgres to store the source of the data; the name, the name2, and the percentage of the similarity

