#!/usr/bin/env groovy

def call() {
  echo "building the docker image..."
  withCredentials([usernamePassword(credentialsId: 'docker-credentials', 'passwordVariable': 'PASS', 'usernameVariable': 'USER')]) {
    echo "$USER $PASS"
    // sh 'docker build -t name .'
    // sh "echo $PASS | docker login -u $USER --password-stdin"
    // sh 'docker push name'
  }
}