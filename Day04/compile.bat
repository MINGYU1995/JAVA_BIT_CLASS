@echo off
set /p cname="class name?"
del %cname%.calss
cls
javac -encoding utf8 %cname%.java
java %cname%
