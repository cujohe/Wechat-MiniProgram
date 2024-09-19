#微信购物小程序  
这是一个微信小程序项目，包含了购物功能，前端使用微信开发者工具开发，后端基于Spring Boot构建。  

功能特色  
用户认证：提供安全的注册与登录功能。  
商品展示：浏览和搜索商品目录。  
购物车：添加、更新、删除购物车中的商品。  
订单管理：创建、查看和跟踪订单。  
支付集成：模拟支付接口集成。  
后台管理：通过Spring Boot管理商品、分类和用户数据。  
技术栈  
前端    
微信开发者工具：用于开发和测试微信小程序。  
WXML, WXSS, JavaScript：用于构建和美化用户界面。  
微信API：集成微信登录、支付、购物车等功能。  
后端    
Spring Boot：用于搭建强大的后端服务。  
MySQL：用于管理用户数据、商品和订单。  
MyBatis-Plus：用于数据持久化及数据库操作。  
Swagger：用于API文档及接口测试。  
JWT (JSON Web Token)：用于安全的用户认证。  
项目结构  
前端 (微信小程序)   
pages/: 各个页面文件，如index，product，cart等。  
utils/: 工具函数，包括HTTP请求处理。  
app.json: 配置文件，定义页面及导航。  
app.wxss: 小程序的全局样式。  
后端 (Spring Boot)  
src/main/java: Java源代码，包含控制器、服务层和数据访问层。  
src/main/resources: 应用配置文件和SQL映射文件。  
pom.xml: Maven项目依赖配置。  
安装步骤  
前提条件  
微信开发者工具  
JDK 8 或更高版本  
Maven  
MySQL  
前端安装  
在微信开发者工具中打开frontend文件夹。  
直接在工具中构建并运行小程序。  
后端安装  
克隆项目仓库：  
bash  
复制代码 
git clone https://github.com/cujohe/Wechat-MiniProgram.git  
进入后端目录：  
bash  
复制代码  
cd backend  
在application.yml中配置MySQL数据库：  
yaml  
复制代码  
spring:  
  datasource:  
    url: jdbc:mysql://localhost:3306/wechat_shop  
    username: your-username  
    password: your-password  
使用Maven运行项目：  
bash  
复制代码  
mvn spring-boot:run  
API接口  
GET /products: 获取所有商品  
POST /cart: 添加商品到购物车  
GET /orders: 查看用户订单  
POST /checkout: 下单  
未来改进  
优化UI/UX设计，提升用户体验。  
集成真实的支付网关。  
添加商品推荐和愿望清单功能。  
许可协议  
本项目使用MIT许可证，详情请参阅LICENSE文件。  
