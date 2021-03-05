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
creates deployments                    OK
mise à jour des déploiements           KO
configMap                              OK
secrets                                OK
Dashboard | Lens  --facultatif         OK
kubectl apply -f https://raw.githubusercontent.com/kubernetes/dashboard/master/aio/deploy/recommended.yaml

namespaces                             KO
Security (Role, RoleBinding, create Users, Service Account) KO
          Vault KO

paradoxe de hamouche (pods déja existant, lancement des déploiement derrière) KO

Ingress               KO
daemonset             KO
jobs                  KO


Create cluster in AWS with kubeadm using ansible KO


Advanced Scheduling                              KO



Récapitulatif des commandes                      KO
StatefulSet                                      KO
Helm                                             KO

Volumes en détail                                KO
Reseau en détail                                 KO


Monitoring ( Prometheus, Grafana )               KO
Istio                                            KO
ArgoCD                                           KO
CrossPlane                                       KO



Deploy application on Kubernetes Cluster( The Hard Way )      KO
