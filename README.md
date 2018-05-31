# question-ms

问答社区

# 发版历史

## V1.0.0

- UI 展示，包括问答的首页分页展示，首页热门标签展示，首页热门问题展示，问题详情展示，提交问题UI(完成)
- 功能：用户登录，提交问题(完成)

## V1.0.1

- UI 卡片化
- 添加问题编辑，方案编辑功能
- 替换 markdown 解析引擎, 提高解析速度，以及 fixed 部分冷格式解析错误的问题

## V1.0.2

- elasticsearch, 站内搜索功能

## V1.0.3

- 首页 VO 字段命名优化
- 网站模式确定，问答改为 问题方案，以维护某个问题的方案为主
- 搜索页面，相关度，点赞数，浏览数，最新搜索条件添加
- 相关问题异步请求显示功能
- html 中部分代码不遵守 bootstrap4 规范的代码重构

## V1.0.4

- UI 美化，参照 知乎 UI 和 stackoverflow UI 的设计, 特别是问题详情页的 UI (需要持续优化)
- 接入百度流量统计 TODO
- 结合 redis 实现问题被浏览数功能(防止恶意刷浏览数)

## V1.0.5

- 用户登录，更新最后一次登录时间
- 基本 SEO 功能实现，head 加入 keywords description meta 信息，供搜索引擎更好的抓取
- 线上 nginx 容器化
- 点赞功能，异步实现，spring security 返回 json 格式，非登录页格式
，并记录点赞的用户信息，以便显示

## V1.0.6

- 登出后，停留在原页面
- 提交内容后台自动格式化（中英文之间空格)
- 记住我功能
- 问题，以及方案编辑历史，编辑的用户信息问题详情页展示
- 安全退出添加前置图标
- 用户墙展示 
- 登录卡片化

## V1.0.7

- 用户个性页展示
- 编辑历史，数据库结构优化
- 图片点击放大
- 问题方案添加，问题修改，方案修改计入贡献
- springboot 线上 docker 容器化
- springboot 项目容器化后，无法访问宿主机 elasticsearch bug fixed
- 新提交的问题显示 一年前 bug
- 搜索页面 UI 卡片化 
- 问题详情页添加问题发布时间

## V1.0.8

- 关于静态页面开发
- 首页 seo title 优化
- 接入百度站长统计 todo
- 问题详情页 md ui 展示模仿 github 样式 todo
- docker build 脚本 todo
- 搜索页面点击下一页出来数据 bug todo
- 社区相关跳转问题 TODO
- 后台文档自动格式化，中文 md 加粗自动空一格 bug TODO
- es 搜索，拓展词典，stop 词典 TODO
- 搜索页面，未搜索到内容，提示字添加 TODO

## V1.0.9

- 用户维护日排行，周排行，总排行 TODO
- 登录页面 UI 美化 TODO
- 短信登录功能 TODO

## V1.1.0

- 项目重构，maven 模块化拆分 TODO
- 更改完问题和方案后跳转到首页的 bug TODO
- 用户中心，展示用户相关信息 TODO
- elasticsearch 容器化 TODO
- 支持 github 登录 TODO

## V1.1.1

- nginx 流量统计 TODO
- 回到顶部 TODO
- 日志切面改良，request 参数无法打印问题，lambada 表达式 TODO
- markdown editor 加载过慢的问题 TODO
- 页面交互优化，点赞后，异步更新页面数据，而不是刷新页面 TODO
- 日志组件升级 logback -> log4j2 todo

