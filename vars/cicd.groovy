def gitdownload(repo)
{
   git 'https://github.com/intelliqittrainings/${repo}.git'
}
def buildartifact()
{
   sh 'mvn package'
}
