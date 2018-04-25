def utils
node {
   echo 'Hello World'
   def scriptDir = getClass().protectionDomain.codeSource.location.path
   echo scriptDir
   utils = load 'Jenkinsfiles/test02.groovy'
   utils.print_hello_again()
}
