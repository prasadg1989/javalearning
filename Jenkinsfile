pipeline{
    agent any
    environment {
    CLASSPATH = "/target/classes/javalearning/"
   }
    stages{
        stage("Welcome"){
            steps{
               echo "Git Checkout"
                echo "CLASSPATH is: ${env.CLASSPATH}"
            }
        }
        stage('Build'){
            steps{
                bat 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run'){
            steps{
                bat 'java C:\\Users\prasa\\.jenkins\workspace\\jenkins-git\\target\\classes\\BaseClass'
            }
        }
    }
}
