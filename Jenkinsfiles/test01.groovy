def utils = load("${workspace}@script/Jenkinsfiles/test02.groovy")
node {
   echo 'Hello World'
   utils.slack_info('Successful test', '#C0C0C0')
}
