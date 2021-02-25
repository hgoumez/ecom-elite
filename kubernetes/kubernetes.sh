# delete all pods
kubectl delete -f ./pods/

# delete all services
kubectl delete -f ./services/

# create all pods
kubectl apply -f ./pods/

# create all services
kubectl apply -f ./services/

