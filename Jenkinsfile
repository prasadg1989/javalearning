-pipeline{
    agent any
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
