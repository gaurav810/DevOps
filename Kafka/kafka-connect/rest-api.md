# Rest API for Kafka Connect

#### Worker details 
> curl -s 127.0.0.1:8083

#### List Connectors
> curl -s 127.0.0.1:8083/connector-plugins

#### Active Connectors
> curl -s 127.0.0.1:8083/connectors

#### Specific Connector Tasks and Config
> curl -s 127.0.0.1:8083/connectors/{connector_name}/tasks

#### Connector Status
> curl -s 127.0.0.1:8083/connectors/{connector_name}/status
 
#### Pause / Resume a Connector (no response if the call is successful)
> curl -s -X PUT 127.0.0.1:8083/connectors/{connector_name}/pause
> curl -s -X PUT 127.0.0.1:8083/connectors/{connector_name}/resume

#### Connector Configuration
> curl -s 127.0.0.1:8083/connectors/{connector_name}

#### Delete Connector
> curl -s -X DELETE 127.0.0.1:8083/connectors/{connector_name}

#### Create a new Connector
> curl -s -X POST -H "Content-Type: application/json" --data '{json_data}' http://127.0.0.1:8083/connectors

#### Update Connector
> curl -s -X PUT -H "Content-Type: application/json" --data '{json_data}' 127.0.0.1:8083/connectors/{connector_name}/config
