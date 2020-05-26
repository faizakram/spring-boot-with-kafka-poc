# INTRODUCTION TO APACHE KAFKA #
Apache Kafka is an open-source stream processing platform developed by the Apache Software Foundation written in Scala and Java. The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data feeds.
![alt text](http://faizakram.com/git-hub/kafka-1_1.jpg)

## The Advantages of using Apache Kafka are as follows- ##
*	High Throughput: - The design of Kafka enables the platform to process messages at very fast speed. The processing rates in Kafka can exceed beyond 100k/seconds. The data is processed in a partitioned and ordered fashion.
*	Scalability: - The scalability can be achieved in Kafka at various levels. Multiple producers can write to the same topic. Topics can be partitioned. Consumers can be grouped to consume individual partitions.
*	Fault Tolerance: - Kafka is a distributed architecture which means there are several nodes running together to serve the cluster. Topics inside Kafka are replicated. Users can choose the number of replicas for each topic to be safe in case of a node failure. Node failure in cluster won’t impact. Integration with Zookeeper provides producers and consumers accurate information about the cluster. Internally each topic has its own leader which takes care of the writes. Failure of node ensures new leader election.
*	Durability: - Kafka offers data durability as well. The message written in Kafka can be persisted. The persistence can be configured. This ensures re-processing, if required, can be performed.

### Got to the [Apache Kafka downloads page](https://kafka.apache.org/downloads "Apache Kafka downloads") page and download the Scala 2.12 kafka_2.12-0.10.2.1.tgz ###
![alt text](http://faizakram.com/git-hub/boot21_1.jpg)
#### Next unzip it to a particular location- ####
![alt text](http://faizakram.com/git-hub/boot21_2.jpg)

### We will now start Apache Kafka ###
*	This Kafka installation comes with an inbuilt zookeeper. Zookeeper is mainly used to track status of nodes present in Kafka cluster and also to keep track of Kafka topics, messages, etc. 
*	Open a command prompt and start the Zookeeper-

C:\kafka_2.12-0.10.2.1>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
![alt text](http://faizakram.com/git-hub/boot21_3.jpg)
* Open a new command prompt and start the Apache Kafka-

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-server-start.bat .\config\server.properties
![alt text](http://faizakram.com/git-hub/boot21_4.jpg)
*	Open a new command prompt and create a topic with name compunnel-topic, that has only one partition & one replica.

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test-topic
*	Next Open a new command prompt and create a producer to send message to the above created test-topic and send a message - Hello World

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic test-topic
Hello World
* Finally Open a new command prompt and start the consumer which listens to the topic compunnel-topic we just created above. We will get the message we had sent using the producer

C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic test-topic --from-beginning
* Define the pom.xml as follows- Add the spring-kafka dependency.
```
<dependency>
		<groupId>org.springframework.kafka</groupId>
			<artifactId>spring-kafka</artifactId>
</dependency>
```
