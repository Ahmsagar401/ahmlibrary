def call(){
    sh '''
      mvn --version
      mvn clean install
    '''
}
