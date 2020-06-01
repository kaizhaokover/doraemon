1. 保证操作系统的一致性
2. 配置hostname
3. 配置/etc/hosts
   - a) 将添加节点的ip 和hostname 添加到已有节点的/etc/hosts文件中
   - b) 将添加节点/etc/hosts配置好所有节点的ip地址和hostname映射
4. 修改内核参数，重启
    ```
    vi /etc/security/limits.d/90-nproc.conf（centos7为20）
     *          soft   nproc     60000
    root       soft    nproc     unlimited
    永久修改用户打开文件的最大句柄数，该值默认1024，一般都会不够，常见错误就是not open file
    vi /etc/security/limits.conf
    *  softnofile  65536
    *  hardnofile  65536
    ```
5. 配置添加节点与其余节点之间的root用户ssh免密登录
6. 安装ntpd服务，并与主节点进行时间同步
7. 安装jdk
8. 关闭防火墙
9. 在已安装节点拷贝/etc/yum.repos.d/ambari.repo文件到添加节点/etc/yum.repos.d/目录下
10. 在添加节点运行yum clean all && yum list
11. 在ambari的web界面进行添加节点操作