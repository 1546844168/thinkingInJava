第2章 一切都是对象
    
    1.在使用任何引用前，都必须为其指定一个对象，如果试图访问一个为null的引用，将会报错。
    
    2.java有一个垃圾回收器，用来监视所有new创建的对象，并辨别那些不在被引用的对象，释放这些对象的内存空间。
    
    3.当一个类的成员变量是基本类型时，JVM会默认将其初始化为对应的初值，但是最好自行进行初始化。
    
    4.方法名和参数列表（合起来称为“方法签名”）唯一的标志出某个方法。
    
    5.若返回值类型是void，则return关键字的意思是退出当前方法。
    
    6.static关键字
        创建一个类就是描述这个类的对象的外观和行为。通常来说，我们用new创建对象后，才能调用这个对象的方法。否则，并未获得任何对象。
        通常，我们需要创建一个对象，来访问这个对象的数据或方法，因为非static域和方法必须和必须和某一特定对象相关联。
        
    7.break,continue关键字
        break是强行退出循环，不执行循环中剩余的语句，而continue是结束当前循环，回到循环的起始处，开始下一次循环。
        
第5章

    5.1 用构造器确保初始化
        在对类进行初始化前，会先初始化类中的变量。也即是会先对成员变量进行初始化。
        
    5.4 this关键字返回了当前对象的引用。
        this关键字对于将当前对象传递给其他方法也是很有用。
        还可以用this调用构造器，必须放在构造器的第一行。
        static的含义：static方法就是没有this的方法。
        
    5.5 清理：终结处理和垃圾回收
        finalize的工作原理：一旦垃圾回收器准备释放对象占用的空间，将首先调用其finalize方法，并且在下一次垃圾回收时，才会真正回收对象占用的内存。
                            也就是说，即使调用了finalize方法，对象的内存也不一定会释放。
                            
         判断对象是否存活：引用计数，可达性分析
         垃圾回收的方式：复制算法,标记-清除算法，标记-整理算法等
    5.7 构造器初始化
        在对构造器进行初始化前，会首先对成员变量进行初始化。
        
        总结一下：对象的创建的过程（加入类为Dog）
            1.构造器实际上也是一个static方法，当首次创建类型为Dog的对象时，Java解释器必须查找类路径，以定位Dog.class文件。
            2.然后载入Dog.class（这将创建一个Class对象），有关静态初始化的所有动作都会执行。因此，静态初始化只在Class对象首次加载的时候进行一次。
            3.当用new Dog()的时候，首先将在堆上为Dog分配足够的存储空间。
            4.这块空间会被清零，这就自动的将类中的所有基本类型初始化为默认值，而引用设置为null。
            5.执行所有字段的初始化动作。
            6.执行构造器。   
    5.9 枚举类型
        枚举类型里面的常量要大写
        enum事实上就是一个类，并且具有自己的方法。
        
第六章 访问权限控制

    6.1 当编写一个Java源代码文件时，只能有一个public类，且这个类的名称要和源代码文件的名称相同。 Java包名全部使用小写。不用遵守驼峰命名法。      
    6.2 java访问权限修饰词
        public：访问权限最大，其他包内也可以访问。
        protected：也具有包访问权限，但它仍旧不是public的。其它包中的这个类的子类可以访问，
        默认的包访问权限：
        private：只有本类中可以访问。
    6.4 类的访问权限
        注意：类既不可以使private的，也不可以是protected的。
        控制对成员的访问权限有两个原因：第一是为了用户不要触碰那些他们不该触碰的部分，这些部分对于类内部的操作是必要的，但是它并不属于客户端程序员所需接口的一部分。
            第二是为了让类库设计者可以更改类的内部的工作方式，而不必担心这样会对客户端程序员产生重大的影响。
            
第七章 复用类

    7.1 对对象的引用进行初始化的四种方式
        1.在定义对象的地方，这意味着它们总是能够在调用构造器之前进行初始化。
        2.在构造器里面。
        3.使用实例初始化
        4.就是在要使用这些对象之前，这种方式称为惰性初始化。在生成对象不值得或者不必每次都生成对象的情况下，这种方式可以减少额外的负担。
        
    7.2 继承语法：当创建一个类时，总是在继承，因此，除非已明确指出要从其他类中继承，否则就是默认的从Object根类继承。
        由于子类是由extends关键字从父类导出的，所以它可以从其接口中自动获取这些方法，尽管它不能看到这些方法在子类中的显示定义。因此，继承可以看做是对类的复用。
        
        初始化基类：继承并不只是复制基类的接口。当创建了一个导出类的对象时，该对象包含了一个基类的子对象。这个子对象与你直接用基类创建的对象是一样的。
                    继承时构建对象的过程时从基类“向外”扩散的，所以基类在导出类构造器可以访问它之前，就已经完成了初始化。不必为导出类创建构造器，
                    编译器会默认创建一个构造器，该构造器会调用基类的构造器。
                    
                    可以在子类中通过super来调用父类中的方法。
                    在构造器中通过super调用父类的构造器，super必须放在构造器的第一行。
                    
    7.4 结合使用组合和继承 
            许多情况下，清理并不是问题，仅需让垃圾回收器完成这个动作就行。但当必须亲自处理时，就必须要小心了。
            因为垃圾回收器可能永远不会被调用，即使被调用，它也可能以任何它想要的顺序来进行垃圾回收。最好的方式就是
            除了内存以外，不要依赖垃圾回收器去回收任何对象。
            
    7.6 protected关键字：就类用户而言，这是private的，但对于任何继承此类的导出类或其他任何位于同一个包内的的类来说，它却是可以访问的。
    
    7.8 final关键字：修饰与类，字段，方法。
        修饰数据：1.一个永不改变的编译时常量,这类常量必须是基本类型，并且用关键字final修饰。
                  2.一个在运行时被初始化的值，而你不希望它被改变
                  
                  一个既是static又是final的域只占据一段不能改变的存储空间。
                  对于基本类型，final使数值不再改变
                  对于对象引用，final使引用不能改变，而对象自身却是可以改变的。注意：数组也是对象。
                      
            空白final：是指被声明为final却未给定初值的域。无论什么情况，编译器都确保空白final在使用前都必须被初始化。
                必须在域的定义处或者每个构造器中用表达式对final进行赋值，这正是final域再使用前总是被初始化的原因。
                
            final参数：引用参数被final修饰时，无法修改参数引用所指向的对象。
                       基本类型参数被final修饰时，可以读参数，不能修改参数。这一特性主要用来向匿名内部类传递数据。
            
        修饰方法：第一个原因是把方法锁定，以防任何继承类修改它的含义。即方法不会被覆盖。
                  第二个原因是效率，但是现在不用考虑在方法上使用final进行优化，而是想要明确禁止覆盖时，才将方法设置为final了。
            
            final和private关键字：类中的所有private方法都隐式的被制定为final的。由于无法取用private方法，也就无法覆盖它。

         修饰类：final修饰的类不允许被继承，所有final类中的所有方法默认是隐式final的，因为所有的方法都不会被覆盖。
         
    7.9 初始化及类的加载
            每个类的编译代码都存在于它自己的独立文件中。该文件只在需要使用程序代码时才会被加载。

            加载发生于第一次创建类的第一个对象时，当访问static域或static方法时，也会发生加载。
            构造器也是static方法，只是static关键字没有显式的写出来。因此更准确的讲，类是在其任何static成员被访问时被加载的。
            
            在A类上运行java时，所发生的第一件事就是试图访问A.main()方法（一个静态方法），于是加载器开始启动并找出A类的编译代码（在A.class文件中），
            在对它进行加载的过程中，如果发现有基类，会继续对基类进行加载。全部加载完成后，根基类中的static初始化会被执行，然后是下一个导出类，以此类推。
            至此，必要的类加载完毕，对象就可以创建了。首先，对象中的所有基本类型会设为默认值，对象引用会被设为null,然后基类的构造器会被调用。   
            
第八章 多态
    
    8.2.1 方法调用绑定
            将一个方法调用同一个方法调用主体关联起来叫做绑定。
            前期绑定：若在程序执行前进行绑定，叫做前期绑定。前期绑定是不需要选择就默认的绑定方式。        
            后期绑定：在运行时根据对象的类型进行绑定。后期绑定也叫做运行时绑定或动态绑定。
            
            多态其实就是后期绑定
            
            private 方法被自动认为是final的，而且对导出类是屏蔽的。
            
            静态方法不具有多态性，静态方法是与类，而非当个对象相关联的。
            
    8.3 构造器和多态
            构造器实际上也只是static方法，只不过static声明是隐式的。
            不要在构造器内调用被重载的方法。
            
    8.5 用继承进行设计
        一条通用规则：“用继承表达行为上的差异，用字段表达状态上的变化”。
        继承可以保证所有的导出类具有和基类一样的接口，且绝对不会少。
        缺点：导出类中接口的拓展部分不能被基类访问，因此，一旦我们向上转型，就不能调用那些新方法。
        
        RTTI：在运行期间对类型进行检查的行为称作 “ 运行时类型识别 ”（RTTI）。

        一个导出类类型被向上转型成了基类类型，此时导出类具有和基类类型一样的接口，如果想访问导出类的扩展接口，即需要进行向下转型。
        也就是进行强转。
        
    8.6 总结
        多态意味着“不同的形式”。
        
        为了在自己的程序中有效的运行多态乃至面向对象的技术，必须拓展自己的编程视野，使其不仅包括个别类的成员和信息，而且还要包括类与类之间的共同特性
        以及它们之间的关系。尽管这需要极大的努力，但是这么做是值得的，因为它可以带来很多成效：更快的程序开发过程，更好的代码组织，更好的拓展程序以及更容易的代码维护等。
        