node {
	stage('Checkout') {
		checkout scm
	}

	stage('Release') {
		withCredentials([usernamePassword(
				credentialsId: 'github',
				passwordVariable: 'GIT_PASSWORD',
				usernameVariable: 'GIT_USERNAME')]) {
			sh "git branch --force master origin/master"
			sh "git checkout master"
			sh "./gradlew release " +
					"-Prelease.customUsername=${GIT_USERNAME} -Prelease.customPassword=${GIT_PASSWORD}"
		}
	}

	stage('Publish') {
		sh "./gradlew clean build publish"
	}

}