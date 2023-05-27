1.
Servlet的继承
    javax.servlet.servlet interf
        javax.servlet.GenericServlet abstract
            javax.servlet.http.httpservlet
2.
500 error:服务器内部错误 cause实例创建失败， private void DemoServlet不能访问 实例初始化、
-默认情况下，第一次请求tomcat才会去实例化，初始化，在服务。好处是提高系统的启动速度，缺点是第一次使用请求等待的时间很长。
-因此如果需要提高系统的启动速度，就是相应速度，也要设置初始化时机。

3。servlet初始化时机
    -默认
    -<load-on-startup>值越小越先启动<sssss/>


4.servlet容器是 :单例的，线程不安全的
-尽量不要再servlet设置成员变量，非要设定就不要对成员变量的值重写，也不要依靠成员变量值写if函数while等判断函数。

Demo03-05 session 会话跟踪何保存作用域
Demo06-07 服务器转发重定向和内部转发