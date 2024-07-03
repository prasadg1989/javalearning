pipeline{
    agent any
    environment{
        PATH="%PATH%;E:\\PrasadWorkplace\\Maven\apache-maven-3.9.8\\bin"
    }
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
