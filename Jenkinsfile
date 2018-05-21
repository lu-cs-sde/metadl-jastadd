#!/usr/bin/env groovy

// This Jenkinsfile builds ExtendJ with Gradle.
pipeline {
  agent any

  options {
    buildDiscarder(logRotator(numToKeepStr: '10'))
  }

  tools {
    jdk 'oracle-jdk-7'
    gradle 'gradle-4.4.1'
  }

  triggers {
    pollSCM('H/15 * * * *')
    cron('H H(1-7) * * *')
  }

  stages {
    stage('Checkout') {
      steps {
        // https://stackoverflow.com/questions/42290133/jenkins-pipeline-git-command-submodule-update
        sh 'git submodule update --init --recursive'
      }
    }

    stage('Build') {
      steps {
        sh 'gradle clean jar'
      }
    }
  }

  post {
    always {
      archiveArtifacts artifacts: 'jastadd2.jar', fingerprint: true
    }
  }
}