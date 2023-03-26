# kafka-chat-app
This is a real time web based chat application that allows multiple users to login on the portal and have a conversation after subscribing to a "topic". The topic basically can be taken as the concept of joining a specific "group" (like on whatsapp) and participating in the conversation of that group. We (Arun, Chandreyi and Pavitra) developed this apllication as a project for our eighth semester project for the subject of Data Engineering.

Our key design choices have been:
- APACHE KAFKA (which is based on the publish subscribe model) over Redis as the storage platform
- WEBSOCKET (using Java Spring Boot package) over HTML as the communications protocol
