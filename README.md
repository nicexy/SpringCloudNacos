* 说明
    * 学习spring cloud alibaba 的相关组件
    * 用pom模块化搭建的学习项目
* 问题
    * 注意springboot、springcloud、springcloudalibaba版本之间的关系，特别重要
   我用的是2.0.5  Finchley.SR4  2.0.2 官方毕业版，不知道为啥有用孵化器版
    * pom中新加了profiles 配置，可以定制化打包等
    * 消费者我是用FeignClient做的测试，关于feign，低版本(netflix-feign-core)与高版本(openfeign)的
    依赖包不一样，这个找了半天以前没有注意。目前引用spring-cloud-starter-openfeign
    * 微服务使用modules这种形式，是不是又耦合了？？
* 记录
    * 配置中心：data_id必须为application name
    * 默认properties格式，yml需配置必须在bootstrap.yml中