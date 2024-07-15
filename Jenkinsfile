pipeline{
    agent any
    environment {
    CLASSPATH = "/target/classes/javalearning:${env.CLASSPATH}"
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
        
    }
}
