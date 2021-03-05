This is a simple producer consumer exampe that uses a 
kafka topic
The producer module will send the message to the producer using kafka template

THe consumber module will read the data from the consumer using kafka template

----------------------------------------------------------------------------
<h2>Start Kafka</h2>
Note: For windows go to  - /<Kafka>/bin/windows

<h3>1. Zookeeper </h3>
<p>zookeeper-server-start.bat ../../config/zookeeper.properties</p>


<h3>2. Start Kafka Broker </h3>
<p>kafka-server-start.bat ../../config/server.properties</p>


<h3>3. Create Kafka Topic - <u>users-topic</u> </h3>
<p>kafka-topics.bat --create --topic users-topic --bootstrap-server localhost:9092</p>

<h3>4. Kafka Consumer - <u>users-topic</u> </h3>
<p>kafka-console-consumer.bat --topic users-topic --from-beginning --bootstrap-server localhost:9092</p>

<h3>5. Create Kafka Topic - <u>users-topic</u> </h3>
<p>kafka-topics.bat --create --topic users-topic --bootstrap-server localhost:9092</p>