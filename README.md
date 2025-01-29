To set up DB connection, create .env file in subleasefinder folder. Set the following fields:
1. USER_NAME={username}
2. DB_PASSWORD={password}

To use this connection, call MongoDBConnection.getDb() and store in a MongoDatabase object.