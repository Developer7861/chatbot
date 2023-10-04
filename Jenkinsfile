pipeline {
  agent any
  stages {
    stage ("Maven build") {
      steps {
        echo "Hello world welcome to jenkinsfile"
      }
    }
    stage ("main deploy") {
      when {
        branch "main"
      }
      steps {
        echo "deploying to main"
      }
    }
    stage ("dev deploy") {
      when {
        branch "dev"
      }
      steps {
        echo "deploying to dev"
      }
    }
    stage ("feat deploy") {
      when {
        branch "feat"
      }
      steps {
        echo "deploying to feat"
      }
    }
  }
}
