# FRONT
* data table produit
* data table order
* side bar                       // DONE

# BACK
* kafka
  * traitement remboursements
  * récuperer les détails d'une commande (communication entre microservices)


# SECURITY
## Keyclock
### Export a realm
``` bash
/opt/jboss/keycloak/bin/standalone.sh -Djboss.socket.binding.port-offset=100 -Dkeycloak.migration.action=export -Dkeycloak.migration.provider=singleFile -Dkeycloak.migration.realmName=ecom -Dkeycloak.migration.usersExportStrategy=REALM_FILE -Dkeycloak.migration.file=/tmp/ecom.json
```

Ajout de github
Installation et configuration d'un LDAP ( AD )
Synchronisation keycloak LDAP
Refresh Token
Revoke Token
installation d'un certificat pour keycloak    // DONE


  * httpd OIDC ou PKCE
## github ou Google


# DATA
## recherche multi criteres sur les produits (Elastic vs BDD)
  * temps de réponse 
  * simplicité des requêtes
  
  
  * différence entre les types de fields
  * manipulation des scores de recherches
  
  * définition d'un type vérifier la suppression à partir de la version 7
  * création des analyseurs ( search -analyser elastic search )
  
  * shards in cluster
  * Avantages / Inconvénients Spring Data Elastic / RestElastic Client
## centralisation de Logs
  * BELK (Beats Elastic Logstash Kibana)   DONE
  * Monitoring de l'application (APM)
  


# DEVOPS
## Ansible
## Cloud
## Kubernetes
## CI/CD
  * gitlab-ci
  * Jenkins
## Qualité du code
  * sonar
## docker registry 
## ansible galaxy (en local)
## nexus or artifactory
## prometheus & Grafana for application monitoring



openssl req -new -key keycloak.key -subj "/CN=keycloak" -out admin.csr






in the next episode
creates deployments  | mise à jour des déploiements
configMap
secrets
Dashboard | Lens  --facultatif

namespaces
Security (Role, RoleBinding, create Users, Service Account)
          Vault


Ingress
daemonset
jobs


Deploy application to AWS with kubeadm


Advanced Scheduling



Récapitulatif des commandes
StatefulSet
Helm

Volumes en détail
Reseau en détail


Monitoring ( Prometheus, Grafana )
Istio
ArgoCD
CrossPlane



Deploy application on Kubernetes Cluster( The Hard Way)
