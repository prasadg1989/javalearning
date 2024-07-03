pipeline{
    agent any
    stages{
        stage("Welcome"){
            steps{
               git 'https://github.com/prasadg1989/javalearning'
            }
        }
        stage("Maven Build"){
            steps{
                sh "mvn clean package"
            }
        }
    }
}
