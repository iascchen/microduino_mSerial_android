String msg = ""; //定义一个字符串
 
void setup()
{
  Serial.begin(115200); // Must use 115200
}

void loop()
{
  if (Serial.available() > 0)  
  {
    msg = Serial.readStringUntil('\n'); //获取换行符前所有的内容
    Serial.println("R:" + msg);                   //在串口监视器显示收到的msg中的字符串 
  }
}
