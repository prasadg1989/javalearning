pipeline{
    agent any
    environment {
    PATH = "/target/classes/javalearning:${env.PATH}"
   }
    stages{
        stage("Welcome"){
            steps{
               echo "Git Checkout"
            }
        }
        stage('Build'){
            steps{
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run'){
            steps{
                echo "PATH is: ${env.PATH}"
                bat 'java BaseClass'
            }
        }
    }
}
