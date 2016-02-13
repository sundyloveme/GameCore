# 简介
我自己用的游戏引擎，继承于如鹏网的GameCore(jl1.0.jar和RuPengGame.jar)，我对它进行了封装，便于自己用。封装后更符合我的逻辑，看起来思路清晰多了，但是还是要经过多次开发不同的游戏来不断完善GameCore，让我们的GameCore变得更通用，像万精油。
# 说明
* com.sundy.www.gamecore包下存放了核心类库。
* Images，Sprites，Sounds存放各类的资源。
* d_test.main包下提供测试代码（注意：将逻辑实现在run（）方法里）。  
![](https://github.com/sundyloveme/GameCore/blob/master/src/Images/QQ%E6%88%AA%E5%9B%BE20160213215754.png)  

# 使用方法
1.将此项目拷贝到到本地，改名。注意要对jl1.0.jar和RuPengGame.jar构建路径（有可能不需要）![](https://github.com/sundyloveme/GameCore/blob/master/src/Images/QQ%E6%88%AA%E5%9B%BE20160213215543.png)  
2.浏览d_test.main下的代码，仿照建立一个新包实现游戏逻辑。
# 注意
* 要导入jl1.0.jar和RuPengGame.jar，因为我是对他们的引用（实际上RuPengGame.jar也是引用了java内部的swing）。
* 在src下建立 Image，Sprites，Sounds包 。这些包里面存放了各类资源。
 * 图片要放在Images包下
 * 精灵放在Sprites包下
 * 音乐放在Sounds包下
