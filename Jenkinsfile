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
                bat 'C:\\Users\prasa\\.jenkins\\workspace\\jenkins-git\\target\\classes\\javalearning java BaseClass'
            }
        }
    }
}
