def utils
node {
   echo 'Hello World'
   utils = load 'Jenkinsfiles/test02.groovy'
   utils.print_hello_again()
}
