(cd order && ./mvnw clean package)
(cd product && ./mvnw clean package)
(cd ecom-elite-front && npm i && ng b --prod)
docker-compose up -d --build
