# FRONT
* data table produit
* data table order
* side bar

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

  * httpd OIDC ou PKCE
## github ou Google


# DATA
## recherche multi criteres sur les produits (Elastic vs BDD)
  * temps de réponse 
  * simplicité des requêtes
## centralisation de Logs
  * BELK (Beats Elastic Logstash Kibana)
  * Monitoring de l'application (APM)


# DEVOPS
## Ansible
## Cloud
## Kubernets
## CI/CD
  * gitlab-ci
  * Jenkins
## Qualité du code
  * sonar
## docker registry 
## ansible galaxy (en local)
## nexus or artifactory
## prometheus & Grafana for application monitoring
