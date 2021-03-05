(cd order && ./mvnw clean package && docker build -t order .)
(cd product && ./mvnw clean package && docker build -t product .)
(cd ecom-elite-front  && ng b --prod && docker build -t ecom-elite-front .)
(cd kubernetes && sh kubernetes.sh)
