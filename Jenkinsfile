node {

    stage("SCM Checkout") {
        echo "Git checkout ..."
        git credentialsId: 'github-cred-final', url: 'https://github.com/rawatds/azure-hello-world', branch: 'main'
    }

    stage("Maven Package") {
        echo "Creating package ..."
        def mavenHome = tool name: 'Maven3-DSR', type: 'maven'
        def mvnCmd = "${mavenHome}/bin/mvn"
        sh "${mvnCmd} clean package"
    }

    stage("Docker build image") {
        echo "Building docker image ..."
        sh 'docker build -t dharmenderrawat/azure-hello-world:1.0 .'

    }

    stage("Push docker image to Docker Hub ...") {
        withCredentials([string(credentialsId: 'DockerHubPwd', variable: 'DockerPwd')]) {
            sh  "docker login -u dharmenderrawat -p ${DockerPwd}"
        }

        sh "docker push dharmenderrawat/azure-hello-world:1.0"
    }

}
