//使用其他软串口用SoftwareSerial
/**
 * If you use microduino, please use mySerial, uncomment these code
 */
// #include <SoftwareSerial.h>
// SoftwareSerial mySerial(4, 5); //RX,TX
// #define my_Serial mySerial

/**
 * If you use mCookie CoreUSB
 */
// #define my_Serial Serial1

/**
 * If you use mCookie IBC (Core)
 */
#define my_Serial Serial

String msg = ""; //定义一个字符串
 
void setup()
{
  // 初始化串口监视器通信波特率
  // Serial.begin(9600);

  /**
   * If you use mCookie BLE, set to 9600
   * If you use mCookie BLE Upload , set to 57600
   */
  my_Serial.begin(57600);
}
void loop()
{
  //每收到一次信号，向通信另一端反馈一次
  if (my_Serial.available() > 0)  //如果串口有数据输入
  {
    msg = my_Serial.readStringUntil('\n'); //获取换行符前所有的内容
    // Serial.println("R:" + msg);                   //在串口监视器显示收到的msg中的字符串
    my_Serial.println("R:" + msg);  //向蓝牙通信的另一端发送数据
  }
}
