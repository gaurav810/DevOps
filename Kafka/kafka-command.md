# Kafka Commands Cheat Sheet

## Kafka Consumer Group

 -  **List of Kafka consumer Group**

> $kafka_home/bin/kafka-consumer-groups.sh -bootstrap-server localhost:9092 -list

- **Details of Topics and Offset within Consumer Group**

> $kafka_home/bin/kafka-run-class.sh kafka.admin.ConsumerGroupCommand --group {name_of_kafka_consumer_group} --bootstrap-server localhost:9092 --describe
