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
      }
    }
  }
}