# Anticaptcha-java for anti-captcha.com 
This is fork of https://github.com/AdminAnticaptcha/anticaptcha-java which was converted to maven dependency.  
To obtain client key click here: http://getcaptchasolution.com/7nwwk2kvvc

## Requirements
Java 1.8

## Installation
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
## Examples
[Click here to see more examples](/src/main/java/com/anti_captcha/Main.java)

* Image to text
```java
DebugHelper.setVerboseMode(true);
ImageToText api = new ImageToText();
api.setClientKey("1234567890123456789012");
api.setFilePath("captcha.jpg");
if (!api.createTask()) {
 DebugHelper.out("API v2 send failed. " + api.getErrorMessage(), Type.ERROR);
} else if (!api.waitForResult()) {
 DebugHelper.out("Could not solve the captcha.", Type.ERROR);
} else {
 DebugHelper.out("Result: " + api.getTaskSolution().getText(), Type.SUCCESS);
}
```


* Recaptcha V2
```java
DebugHelper.setVerboseMode(true);
NoCaptchaProxyless api = new NoCaptchaProxyless();
api.setClientKey("1234567890123456789012");
api.setWebsiteUrl(new URL("http://http.myjino.ru/recaptcha/test-get.php"));
api.setWebsiteKey("6Lc_aCMTAAAAABx7u2W0WPXnVbI_v6ZdbM6rYf16");
if (!api.createTask()) {
 DebugHelper.out("API v2 send failed. " + api.getErrorMessage(), Type.ERROR);
} else if (!api.waitForResult()) {
 DebugHelper.out("Could not solve the captcha.", Type.ERROR);
} else {
 DebugHelper.out("Result: " + api.getTaskSolution().getGRecaptchaResponse(), Type.SUCCESS);
}
```

* Recaptcha V3
```java
DebugHelper.setVerboseMode(true);
RecaptchaV3Proxyless api = new RecaptchaV3Proxyless();
api.setClientKey("1234567890123456789012");
api.setWebsiteUrl(new URL("http://www.supremenewyork.com"));
api.setWebsiteKey("6Leva6oUAAAAAMFYqdLAI8kJ5tw7BtkHYpK10RcD");
api.setPageAction("testPageAction");
if (!api.createTask()) {
 DebugHelper.out("API v2 send failed. " + api.getErrorMessage(), DebugHelper.Type.ERROR);
} else if (!api.waitForResult()) {
 DebugHelper.out("Could not solve the captcha.", DebugHelper.Type.ERROR);
} else {
 DebugHelper.out("Result: " + api.getTaskSolution().getGRecaptchaResponse(), DebugHelper.Type.SUCCESS);
}
```

## Do you like it?
Support me with registering from my referral to anti captcha service: http://getcaptchasolution.com/7nwwk2kvvc
