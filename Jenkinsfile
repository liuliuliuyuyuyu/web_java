pipeline {
    agent none
    stages {
        stage('parallel') {
            parallel{
                stage('parallel test1'){
                    agent{
                        node{
                            label 'node1'
                        }
                    }
                    steps{
                        echo 'parallel test1'
                    }
                }
                stage('parallel test2'){
                    agent any
                    steps{
                        echo 'parallel test2'
                    }
                }

            }
        }
        stage('no parallel'){
            agent any
            steps{
                echo 'no parallel'
            }
        }
    }
}
