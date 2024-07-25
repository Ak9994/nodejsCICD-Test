node{
    checkout scmGit( 
                 
                 branches: [[name: '*/master']], 
                 extensions: scm.extension, 
                 userRemoteConfigs: [[url: 'https://github.com/Ak9994/nodejsCICD-Test.git']]
                 
                 )
}
