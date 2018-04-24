#!/usr/bin/env groovy

node {

    checkout scm

    stage('🔧 Build') {
        try {
            sh './gradlew clean build'
        } finally {
            junit '**/build/test-results/**/*.xml'
            archiveArtifacts '**/build/libs/*.jar'
        }
    }

}
