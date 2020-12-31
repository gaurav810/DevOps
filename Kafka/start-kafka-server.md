# Start Kafka Server

 -  **Start Zookeeper Server**

> kafka_home $ bin/zookeeper-server-start.sh config/zookeeper.properties

    Default Port : 2181

- **Start Kafka Server**

> kafka_home $ bin/kafka-server-start.sh config/server.properties

    Default Port : 9092

 - **Start Kafka Connect Server**

> kafka_home $ bin/connect-distributed.sh config/connect-distributed.properties

    Default Port : 8083

