<?php

    spl_autoload("Autoload.php");
    use PHPUnit\Framework\TestCase;

    require_once "User.php";
    class SampleTest extends TestCase
    {
        // test the talk method
        public function testTalk() {
            // make an instance of the user
            $user = new User();

            // use assertEquals to ensure the greeting is what you
            $expected = "Hello world!";
            $actual = $user->talk();
            $this->assertEquals($expected, $actual);
        }
    }

?>