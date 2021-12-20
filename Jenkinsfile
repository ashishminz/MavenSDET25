
pipeline {
      agent any 
      tools
      {
            maven "MAVEN_HOME"
      }
    stages{
        stage("git"){
            steps{
                      git credentialsId: '4d878407-a66e-4c8a-9fc1-16990c1badac', url: 'https://github.com/ashishminz/MavenSDET25.git'
                  }                   
             }
        
        
         stage("build"){
            steps{
                      sh  'mvn clean install'
                  }                   
             }
        
        
        
          }
}

