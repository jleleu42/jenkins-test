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
        shell("composer install")
        shell("./php/vendor/bin/phpunit ./php/test.php")
    }
}