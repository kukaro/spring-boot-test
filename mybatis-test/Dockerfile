FROM ubuntu:latest
MAINTAINER kukaro <justkukaro@naver.com>
RUN apt-get update

#set inv
ENV HOME /root

#set timezone
ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

#install git, vim, wget
RUN apt-get update && apt-get install -y git
RUN apt-get install -y vim
RUN apt-get install -y wget
RUN apt-get install -y lsof
RUN apt-get install -y nodejs
RUN apt-get install -y npm
RUN apt-get install -y curl
RUN apt-get install -y telnet
RUN apt-get install -y tree
RUN apt-get install -y gradle
RUN apt-get install -y maven
RUN apt-get install -y net-tools #netstat

#install mysql
RUN apt-get install -y mysql-server

#setting vim
RUN git clone https://github.com/VundleVim/Vundle.vim.git
RUN mkdir -p ${HOME}/.vim/bundle
RUN mv Vundle.vim ${HOME}/.vim/bundle

#script
ADD ./script ${HOME}/script
ADD ./ ${HOME}/project
RUN pwd ${HOME}/project
RUN cd ${HOME}/project/ &&./mvnw clean
RUN cd ${HOME}/project/ &&./mvnw install

EXPOSE 8080 3036
