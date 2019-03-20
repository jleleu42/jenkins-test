job('My Job php') {
    scm {
        git('https://github.com/jleleu42/jenkins-test') {  node -> 
            node / gitConfigName('jleleu42  ')
            node / gitConfigEmail('jleleu42@estiam.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("ls")
        shell("cd ./php")
        shell("ls")
        shell("composer require ./php/")
        shell("./php/vendor/bin/phpunit test.php")
    }
}