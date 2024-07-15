pipeline{
    agent any
    stages{
        stage("Welcome"){
            steps{
               echo "Git Checkout"
            }
        }
        stage("Maven Build"){
            steps{
                sh "mvn -v"
            }
        }
    }
}
