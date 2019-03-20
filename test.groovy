
19 lines (18 sloc) 383 Bytes
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
    wrappers {
        nodejs('NodeJS9')
    }
    steps {
        shell("composer install")
        shell("./vendor/bin/phpunit test.php")
    }
}