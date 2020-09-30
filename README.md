# personal_budget
Budget managment for personal use. (Under developing)




## 部署说明

#### 1. 环境准备

###### 1.1 mysql数据库
* 使用官方docker镜像运行, 命令如下:

```shell script
docker run \
	--name mysql5.7 \
	-p 3306:3306 \
	-v /home/fire/mysql_data:/var/lib/mysql \
	-e MYSQL_ROOT_PASSWORD=123 \
	-e TZ=Asia/Shanghai \
	-d \
	mysql:5.7
```

###### 1.2 redis缓存
* 使用官方docker镜像运行, 命令如下:

```shell script
docker run --name redis \
	-p 6379:6379 \
       	-d redis:5.0 --requirepass "password"
```

###### 1.3 Elastic Search
* 使用官方docker镜像运行, 命令如下:

```shell script
docker run -d --name elasticsearch \
    -p 9200:9200 \
    -p 9300:9300 \
    -e "discovery.type=single-node" \
    -d elasticsearch:7.9.1
```

* 进入前面的docker容器中, 安装ik中文分词插件, 命令如下:

```shell script
./bin/elasticsearch-plugin install https://github.com/medcl/elasticsearch-analysis-ik/releases/download/v7.9.1/elasticsearch-analysis-ik-7.9.1.zip
``` 