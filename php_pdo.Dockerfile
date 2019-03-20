FROM php:fpm

# install the PHP extensions we need
RUN docker-php-ext-install pdo pdo_mysql
# PHPUNIT
RUN apt-get update
RUN apt-get install wget
RUN wget https://phar.phpunit.de/phpunit.phar
RUN chmod +x phpunit.phar
RUN cp phpunit.phar /usr/local/bin/phpunit
RUN cp phpunit.phar /usr/bin/phpunit

WORKDIR /var/www/html