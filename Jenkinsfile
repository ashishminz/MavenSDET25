
pipeline {
    
            agent any
    tools { maven "MAVEN_HOME" } 
         
                stages {
                                stage('Example Build') 
                                 {

                                    steps {
                                           echo "wooow"
                                          git credentialsId: '4d878407-a66e-4c8a-9fc1-16990c1badac', url: 'https://github.com/ashishminz/MavenSDET25.git'
                                          echo "happened"
                                          }
                                 }
                                     stage('Example Test') 
                                 {

                                    steps {
                                           echo "wooow"
                                          sh 'mvn test'
                                          echo "happened"
                                         }
                                  }
                      }
       }

