def utils
node {
   echo 'Hello World'
   String currentDir = new File(".").getAbsolutePath()
   echo currentDir
   utils = load 'Jenkinsfiles/test02.groovy'
   utils.print_hello_again()
}
