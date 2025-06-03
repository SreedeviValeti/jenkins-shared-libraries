def call(String Project, String ImageTag, String DockerUser){
  withCredentials([usernamePassword(credentialsId:'dockerhub-cred', usernameVariable:'DockerHubuser', passwordVariable:'DockerHubpass')]){
    sh "docker login -u ${DockerHubuser} -p ${DockerHubpass}"
    sh "docker push ${DockerUser}/${Project}:${ImageTag}"
  }
    
}
