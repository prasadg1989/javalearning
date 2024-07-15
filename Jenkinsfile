pipeline{
    agent any
    stages{
        stage("Welcome"){
            steps{
               echo "Git Checkout"
            }
        }
        stage('Build'){
            sh 'mvn -B -DskipTests clean package'
        }
    }
}
