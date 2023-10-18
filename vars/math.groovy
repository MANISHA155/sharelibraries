def newGit(repo)
{
  git "https://github.com/MANISHA155/${repo}.git"
}

def newMaven23(repo)
{
  sh 'mvn package'
}

