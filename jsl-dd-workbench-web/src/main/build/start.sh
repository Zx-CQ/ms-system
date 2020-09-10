#! /bin/sh

SCRIPT_PATH=`dirname $0`
cd $SCRIPT_PATH

SERVICE_ROOT_PATH=${PWD%/*}
SERVICE_CLASSPATH=$SERVICE_ROOT_PATH:$SERVICE_ROOT_PATH/config

for f in $SERVICE_ROOT_PATH/lib/*.jar; do
  SERVICE_CLASSPATH=$SERVICE_CLASSPATH:$f;
done

export SERVICE_CLASSPATH

JAVA_OPTS='-Xms2048m -Xmx2048m'
nohup java -server $JAVA_AGENT $JAVA_OPTS -classpath $SERVICE_CLASSPATH com.jd.jsl.dd.web.JslDdWorkbenchWebApplication >/dev/null 2>&1 &