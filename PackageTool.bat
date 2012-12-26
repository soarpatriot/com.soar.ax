@echo off
title = Package Tool
echo -----------------------------------------------
echo            The Packaging Tool for the OVP 
echo                   Version 0.2.1
echo                   Author:zhx_0626@163.com
echo                   Date:2011/11/16
echo             2011 Lenovo. All rights reserved
echo -----------------------------------------------
echo       All the platform like below:
echo 
echo         [Number:The target platform description]
echo         1/l/L:Local(local devlopment environment)

echo         e:exit the bat.
echo -----------------------------------------------
:main
set /p choice= "Please choose a Number in the above:"
if /i %choice%==1 (set profile=l &goto exec)

:exec
set command=mvn clean package -DskipTests=true 
rem package -DskipTests=true 
echo
echo Starting execute Command:
echo %command%

call %command%

:exit
@pause




