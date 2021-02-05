stage ("checkout") {
    println("checkout")
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/hgoumeziane/ecom-elite.git']]])
}

stage ("build") {
    println("build")
}

stage ("test") {
    println("test")
}

stage ("deployment") {
    println("deployment")
}