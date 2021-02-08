node ("aws-slave-1") {

    stage ("checkout") {
        println("checkout")
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/hgoumeziane/ecom-elite.git']]])
    }
    
    
    stage ("build") {
        println("building Order project")
        sh "cd order && ./mvnw clean package -DskipTests"

        println("building Product project")
        sh "cd product && ./mvnw clean package -DskipTests"

        println("building front app")
        sh "cd ecom-elite-front && npm i && ng build --prod"
    }

    stage ("test") {
        sh "cd order && ./mvnw test"
        sh "cd product && ./mvnw test"
    }

    stage ("deployment") {
        println("deploying Order service")
        sh "sudo docker-compose up -d --build"
    }
}
