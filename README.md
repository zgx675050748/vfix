Vfixtures
基于java的微信装修发布平台（微信小程序）
开发语言：java
项目框架：spring+springMVC+mybatis
前端框架：微信小程序前端开发api（wxml、wxss、js）
数据：mysql、redis（缓存、登录态保持）
应用服务器：tomcat
云服务器：腾讯云
其他：腾讯位置服务
主体功能：用户划分为三类
       最基本为普通用户，可以查看商品信息、需求、工人，订购商品（生成相应商品的订单），对订购过的商品进行评价，发布装修需求（富文本），对参加自己需求的工人进行评价，提供商品、需求、工人三种信息的搜索功能，排序功能，自动（主动）获取定位，可以显示双方距离并通过距离进行筛选，未登录状态下只能进行查看操作
       工人用户，可以在普通用户的基础上认证工人用户，编辑定位信息，可以将自身信息投递到装修需求中，可以查看客户对自身的评价，可以查看已投递的需求
       商家用户，可以在普通用户的基础上认证商家用户，增删改查商品信息，查看订购订单，查看用户评论
