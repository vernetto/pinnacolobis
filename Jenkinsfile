pipeline {
  agent any
  stages {
    stage('checkout') {
      parallel {
        stage('checkout') {
          steps {
            git 'https://github.com/vernetto/pinnacolo.git'
          }
        }
        stage('hello') {
          steps {
            echo 'Hello Pierre'
          }
        }
        stage('evenorodd') {
          steps {
            script {
              if (currentBuild.number % 2 == 0) {
                echo "the current build number is even"
              } else {
                echo "the build is odd"
              }
            }

          }
        }
      }
    }
    stage('build') {
      steps {
        build 'myjob'
      }
    }
  }
}