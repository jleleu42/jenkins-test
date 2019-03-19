FROM php:fpm

# install the PHP extensions we need
RUN docker-php-ext-install pdo pdo_mysql

WORKDIR /var/www/html