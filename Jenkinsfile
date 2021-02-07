node ("master") {

    stage ("checkout") {
        println("checkout")
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/hgoumeziane/ecom-elite.git']]])
    }
    
    
    stage ("build") {
        println("building Order project")
        sh "cd order && ./mvnw clean package"

        println("building Product project")
        sh "cd product && ./mvnw clean package"

        println("building front app")
        sh "cd ecom-elite-front && npm i && ng build --prod"
    }

    stage ("test") {
        println("test")
    }

    stage ("deployment") {
        println("deploying Order service")
        // sh "cd order/target && java -jar order-0.0.1-SNAPSHOT.jar"
    }
}
