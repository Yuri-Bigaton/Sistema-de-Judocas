#!/bin/bash

_PWD=`pwd`
CopyLibs=$_PWD/lib/org-netbeans-modules-java-j2seproject-copylibstask.jar

CLASSPATH=$CLASSPATH:$CopyLibs:
export CLASSPATH
echo "CLASSPATH:"$CLASSPATH
