# studydemo
一款适合新手练习的开源项目
![](https://github.com/lijizhi/studydemo/blob/master/image/1.png) 
![](https://github.com/lijizhi/studydemo/blob/master/image/2.png)

![](https://github.com/lijizhi/studydemo/blob/master/image/3.png) 
![](https://github.com/lijizhi/studydemo/blob/master/image/4.png)


![](https://github.com/lijizhi/studydemo/blob/master/image/5.png) 
![](https://github.com/lijizhi/studydemo/blob/master/image/6.png)


![](https://github.com/lijizhi/studydemo/blob/master/image/7.png) 
![](https://github.com/lijizhi/studydemo/blob/master/image/8.png)

![](https://github.com/lijizhi/studydemo/blob/master/image/9.png)
![](https://github.com/lijizhi/studydemo/blob/master/image/10.png)

![](https://github.com/lijizhi/studydemo/blob/master/image/11.png)




####用到的开源库有：
   
 - compile 'com.android.support:design:24.2.0'
    > Bmob
 -  compile('cn.bmob.android:bmob-sdk:3.5.0') {
 exclude group: 'com.squareup.okhttp3', module: 'okhttp'
 exclude group: 'io.reactivex:rxandroid'
 exclude group: 'io.reactivex:rxjava'
 exclude group: 'com.squareup.okio'
 }
 > 腾讯bugly
 -   compile 'com.tencent.bugly:crashreport:latest.release'
 -   compile 'com.tencent.bugly:nativecrashreport:latest.release'
 -  compile 'de.hdodenhof:circleimageview:2.1.0'
> Rxvolley网络框架
 - compile('com.kymjs.rxvolley:rxvolley:1.1.2') {
        exclude group: 'com.squareup.okhttp3', module: 'okhttp'
        exclude group: 'com.squareup.okio'
        exclude group: 'io.reactivex'
    }
 > Rxvolley下载模块 
 - compile('com.kymjs.rxvolley:okhttp:1.1.0') {
        exclude group: 'com.squareup.okhttp3'
        exclude group: 'com.squareup.okio'
    }
 > Picasso
 - compile 'com.squareup.picasso:picasso:2.5.2'
     > photoview
 - compile 'com.github.chrisbanes:PhotoView:1.3.0'
 > 科大讯飞TTS引擎 
 -  compile files('libs/Msc.jar')
 - compile files('libs/Sunflower.jar')
     > NumberProgressBar
 - compile 'com.daimajia.numberprogressbar:library:1.2@aar'
 > Zxing二维码库
 - compile project(path: ':libzxing')

}

###涉及的主要技术点
- 整体项目框架基于 TabLayout+viewPage+Fragment
- Bmob后端云技术构建用户信息管理系统
- Rxvolley网络框架进行网络请求
- Picasso多图异步加载
- zxing二维码库
- 科大讯飞TTS语音引擎
- 自定义键盘和逻辑
- CircleImageView圆形头像
- photoView图片缩放拖拽
- 实现时间轴效果
- 自定义短信提醒框
- 工具类的封装（Log的封装，sharedPreferences封装）

### 很高兴你看到这里

> 有时候啊   你总是在追赶前面的人

> 总是抱怨自己为什么不能再努力一点

>累了你可以停下来   看看原来的自己

>其实你已经很了不起了。

### Contact Me
* Email: 540333298@qq.com
* Blog : http://blog.csdn.net/lijizhi19950123/article/details/74612525
* Tel  : 13631296446
* Github: https://github.com/lijizhi
