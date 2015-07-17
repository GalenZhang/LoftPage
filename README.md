#LoftPage
LoftPage以当前流行的2048游戏为蓝本，将其进行改造，使其可进行网络对战，增强竞技性，并更有可玩性。
其采用流行的websocket通信技术，作为浏览器与服务器之间通信的媒介，打破原有的请求响应机制，提高
了通信效率，服务器底层进行了较大的优化，包括多消息队列汇聚设计减少并发冲突，单生产者多消费者
线程模型提高吞吐量、函数式编程提高系统整体可拓展性等等。
与其说本项目是一个游戏，把它当作各种最新技术的实践以及设计思想的技术验证更为恰当。
本文着重讨论设计思想和所用技术本身，并不对项目应用以及前景作过多探讨。
##后台结构以及说明
![](https://github.com/decaywood/LoftPage/blob/master/Info/Structure.png)
![](https://github.com/decaywood/LoftPage/blob/master/Info/SequenceDiagram.png)
