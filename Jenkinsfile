pipeline{
    agent any
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
                bat 'cd target'
                'cd classes'
                'cd javalearning'
                'java BaseClass'
            }
        }
    }
}
