1. 将所有安装包、镜像文件、jdk放到res目录
    - CentOS-7-x86_64-DVD-1511.iso
	- ambari-2.4.2.0-centos7.tar.gz     
    - HDP-2.5.3.0-centos7-rpm.tar.gz    
    - HDP-UTILS-1.1.0.21-centos7.tar.gz 
	- jdk-7u80-linux-x64.rpm
2. 配置host_file
    - 将所有节点ip hostname root密码放到这个文件、一行一个节点信息
	如：
	  - 192.168.253.138	node1 123456
      - 192.168.253.139	node2 123456
3. 配置hostname-keyword
    - 这个文件为hostname的相同字符：如node
	- 用于过滤出所有的节点hostname
4. 运行脚本：
	- ambariInstall.sh
5. 安装ambari
    - 在运行脚本节点执行命令
		- yum install -y ambari-server
6. 配置ambari-server
    - 命令：
		- ambari-server setup
7. 基本按照默认选择就可以，配置一下jdk路径为/usr/java/default
    - 详细请参考：instruction/说明/ambari-server setup操作手册.png 图片
8. 切换到postgres用户，创建hive元数据库
    ```
   su postgres #切换用户
	psql        #进入postgresql数据库
	create user hive;
	create database hive with owner=hive;
	\password hive;
	输入:hive
	确认:hive
	
	\q     退出：psql数据库
	```
9. 修改postgres数据库配置文件
   - /var/lib/pgsql/data/pg_hba.conf
   
     - 增加：
     ```
       local all hive               trust
       host  all hive  ip/网段      trust
     ```
10. 在运行脚本节点执行：
	+ yum install -y postgresql-jdbc.jar
	+ ambari-server setup --jdbc-db=postgresql --jdbc.driver=/usr/share/java/postgresql-jdbc.jar
	
11. 登录ambari web界面进行配置
	
	+ 参考：instruction/说明/*.png (按照文件名有一个顺序查看即可！)
	