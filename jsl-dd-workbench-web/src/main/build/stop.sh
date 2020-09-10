#! /bin/sh

SCRIPT_PATH=`dirname $0`
cd $SCRIPT_PATH

SERVICE_ROOT_PATH=${PWD%/*}
SERVICE_KEY=$SERVICE_ROOT_PATH:

#ps aux|grep '/export/Instances/im4.1-dd-marketing/server1' | grep 'java'| grep -v 'grep' | awk '{print $2}' | xargs kill -15

nc=`ps -ef | grep 'com.jd.jsl.dd.web.JslDdWorkbenchWebApplication' | grep 'java' | grep -v 'grep' | grep -v 'stop.sh' | wc -l`
echo $nc >/export/Logs/im.jd.com/stop.log
if [ $nc -gt 0 ]; then
	ps aux|grep '/export/Instances/im4.1-dd-marketing/server1' | grep 'java'| grep -v 'grep' | awk '{print $2}' | xargs kill -15
	echo 'ok' >>/export/Logs/im.jd.com/stop.log
else
  echo 'process not exists' >>/export/Logs/im.jd.com/stop.log
fi