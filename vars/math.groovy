def newGit(repo)
{
  git "https://github.com/MANISHA155/${repo}.git"
}

def newMaven23()
{
  sh 'mvn package'
}
def newDeploy(workspace,ip,context)
{
    sh "scp /var/lib/jenkins/workspace/${workspace}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat9/webapps/${context}.war"
}

def executeSelenium(jobname)
{
    sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}

  
