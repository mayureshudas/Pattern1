def runproject(){

       sh "cp -fR target/SimpleServlet-1.war /var/lib/tomcat/webapps"
       sh "service tomcat restart"
       
}
return this
