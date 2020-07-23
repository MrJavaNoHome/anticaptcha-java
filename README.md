# Anticaptcha-java for anti-captcha.com 
</br>This is fork of https://github.com/AdminAnticaptcha/anticaptcha-java which was converted to maven dependency.

# How to use?
In pom.xml add:  
```xml
<repositories>  
    <repository>  
        <id>repsy</id>  
        <name>MrJavNoHome repository</name>  
        <url>https://repo.repsy.io/mvn/honzik/public</url>  
    </repository>  
</repositories>  
```

```xml
<dependency>
    <groupId>com.anti_captcha</groupId>
    <artifactId>anticaptcha-java</artifactId>
    <version>1.0</version>
</dependency>
```
# Do you like it?

Support me with registering from my referral to anti captcha service: http://getcaptchasolution.com/7nwwk2kvvc

---
**Readme of forked project:**  
Download the full project (2.5 mb): https://yadi.sk/d/6V8NfwDe3EQ7z4

You need Java 1.8 installed.
This is an IntelliJ IDEA project and it should be compatible with Eclipse (but not tested).

If you want to compile the project in console (tested on MacOS 10.11):

1. Make sure you are using Java 1.8:
$ javac -version
if you installed Java 1.8 before, but previous command gives you "1.7", you need to switch it to 1.8:
$ export JAVA_HOME=`/usr/libexec/java_home -v 1.8`

2. Compile:
$ javac -cp "libs/*" src/com/anti_captcha/AnticaptchaBase.java src/com/anti_captcha/Main.java src/com/anti_captcha/IAnticaptchaTaskProtocol.java src/com/anti_captcha/Api/ImageToText.java src/com/anti_captcha/Api/NoCaptcha.java src/com/anti_captcha/Api/NoCaptchaProxyless.java src/com/anti_captcha/ApiResponse/BalanceResponse.java src/com/anti_captcha/ApiResponse/CreateTaskResponse.java src/com/anti_captcha/ApiResponse/TaskResultResponse.java src/com/anti_captcha/Helper/DebugHelper.java src/com/anti_captcha/Helper/HttpHelper.java src/com/anti_captcha/Helper/JsonHelper.java src/com/anti_captcha/Helper/StringHelper.java src/com/anti_captcha/Http/HttpRequest.java src/com/anti_captcha/Http/HttpResponse.java

3. Run:
$ java -cp "src:libs/*" com.anti_captcha.Main
