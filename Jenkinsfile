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
    }

    stage ("test") {
        println("test")
    }

    stage ("deployment") {
        println("deployment")
    }
}