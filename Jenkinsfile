pipeline{
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
        stage('Run'){
            steps{
                bat 'java -cp target/classes:target/classes/javalearning/* BaseClass' 
            }
        }
    }
}
