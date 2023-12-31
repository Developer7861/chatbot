def call(ip, creds, warName){
  // install ssh agent plugin
    sshagent([creds]) {
     // copy war file local to tomcat -dev server
     sh "scp -o StrictHostKeyChecking=no target/${warName}.war ec2-user@${ip}:/opt/tomcat9/webapps"
     // restart the tomcat9 server
    sh "ssh ec2-user@${ip} /opt/tomcat9/bin/shutdown.sh"
    sh "ssh ec2-user@${ip} /opt/tomcat9/bin/startup.sh"
  }
}
