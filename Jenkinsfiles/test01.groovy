def utils = load("test02.groovy")
node {
   echo 'Hello World'
   utils.print_hello_again()
}
