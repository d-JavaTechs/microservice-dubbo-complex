# Angularjs-Bootstrap-Netty-SpringMVC-Dubbo-Mybatis-Mysql-Zookeeper
1. netty提供服务器，客户端的请求由spring的DispatcherServlet处理；
2. springmvc写restful接口；
3. service-api 提供服务接口；
4. service-provider 服务提供者（接口的实现）；
5. service-consumer 服务器消费者（接口的调用）；
6. zookeeper管理注册中心（负载均衡，资源同步-当然前提是集群）；
7. mybatis(hibernate)数据库持久
