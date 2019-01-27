# UML

## uml图示
*下图摘自大话设计模式*
![uml](https://upload-images.jianshu.io/upload_images/10533092-e10a5dae7e1fe36c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## 解释
1. 类图
	* 权限
		* `+`表示public
		* `-`表示private
		* `#`表示protected
		* `~`表示default
	* 抽象类与抽象方法斜体
	* 静态变量或者函数标识下划线
	* 接口标识interface,例如飞翔
2. 关系说明
	* 继承,动物和鸟
	* 实现,大雁与飞翔
	* 组合,类之间同生命周期,比如一个类无参构造函数,生成另一个类

		```java
		public class GooseGroup
		{
		    publi Goose goose;
		    public GooseGroup(Goose goose){
		        this.goose=goose;
		    }
		}
		```
		
	* 聚合,类之间不同生命周期
	
		```java
		public class GooseGroup
		{
		    publi Goose goose;
		    public GooseGroup(Goose goose){
		        this.goose=goose;
		    }
		}
		```
		
	* 依赖关系:动物类使用氢气与水作为入参
	* 关联关系:企鹅使用气候作为参数
	
