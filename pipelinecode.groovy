pipeline {
    agent master
    stages{
        stage('Pull'){
            steps{
                echo 'Successfully Pulled'
            }
        }
        stage{Build}{
            stage{
                echo 'Successfully Build'
            }
        }
    }

}