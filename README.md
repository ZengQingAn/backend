```shell
.
├── Dockerfile
├── HELP.md
├── README.md
├── logs
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── gzzsy
│   │   │           └── backend
│   │   │               ├── ServerApplication.java // 启动类
│   │   │               ├── core // 核心逻辑
│   │   │               │   ├── config
│   │   │               │   │   └── ExecutorConfig.java // 异步执行器配置
│   │   │               │   ├── constant
│   │   │               │   │   └── RedisKey.java // redis key工具
│   │   │               │   ├── enums
│   │   │               │   │   ├── ErrorCodeEnum.java // 常用错误码
│   │   │               │   │   └── ServerErrorEnum.java // 错误码定义
│   │   │               │   ├── exception // 异常
│   │   │               │   ├── manager // 一般是entity的管理器，可复用行强
│   │   │               │   │   └── thirdparty  // 第三方接口的管理器
│   │   │               │   ├── model 
│   │   │               │   │   ├── BizException.java // 异常类
│   │   │               │   │   ├── Page.java // 分页
│   │   │               │   │   ├── Result.java // 接口响应体
│   │   │               │   │   ├── ResultCode.java // 口响应码
│   │   │               │   │   └── RollingPage.java // 滚动分页
│   │   │               │   ├── mq
│   │   │               │   │   ├── listener // 消费者
│   │   │               │   │   └── producer // 生产者
│   │   │               │   ├── service // 服务，不会相互调用
│   │   │               │   └── task // 定时任务
│   │   │               │       └── DemoTask.java
│   │   │               ├── domain // 系统领域对象
│   │   │               │   ├── bo // 业务对象，只对内
│   │   │               │   │   └── DemoBO.java
│   │   │               │   ├── converter // 对象转换器
│   │   │               │   │   └── DemoConverter.java
│   │   │               │   ├── req // controller的请求参数
│   │   │               │   │   └── DemoReq.java
│   │   │               │   ├── resp  // controller的返回对象
│   │   │               │   │   └── DemoResp.java
│   │   │               │   ├── thirdparty // 第三方接口的请求、返回对象
│   │   │               │   │   ├── req
│   │   │               │   │   │   └── DemoReq.java
│   │   │               │   │   └── resp
│   │   │               │   │       └── DemoResp.java
│   │   │               │   └── vo // 数据模型视图对象
│   │   │               │       └── DemoVO.java
│   │   │               ├── repository // 持久化
│   │   │               │   ├── config  // 持久化配置
│   │   │               │   ├── dao // 数据访问对象
│   │   │               │   │   └── DemoDao.java
│   │   │               │   ├── model // 存放entity
│   │   │               │   │   └── DemoEntity.java
│   │   │               │   └── util // 持久化工具
│   │   │               │       └── TxHelper.java
│   │   │               └── web // web相关的定义
│   │   │                   ├── annotation // web相关的定义
│   │   │                   ├── aop // 切面
│   │   │                   ├── config // 配置
│   │   │                   │   ├── CORSConfig.java // 跨域配置
│   │   │                   │   └── GlobalExceptionHandler.java // 接口全局异常捕捉
│   │   │                   └── controller // 接口定义
│   │   │                       └── DemoController.java
│   │   └── resources
│   │       ├── application-dev.yml // 开发环境配置文件
│   │       ├── application-local.yml // 本地环境配置文件
│   │       ├── application-prod.yml // 生产环境配置文件
│   │       ├── application.yml  // 基础配置文件
│   │       ├── logback-spring.xml  // 日志配置
│   │       └── mapper // 数据访问实现
│   │           └── DemoDao.xml
│   └── test
│       └── java
│           └── com
│               └── gzzsy
│                   └── backend
│                       └── ServerApplicationTests.java // 单元测试类
└── start.sh

```
