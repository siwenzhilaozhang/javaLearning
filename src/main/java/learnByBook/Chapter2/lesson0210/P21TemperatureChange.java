package learnByBook.Chapter2.lesson0210;

/**
 * Created by xin14.zhang on 2018/2/10.
 */
/* 2.1 （将华氏温度转换为摄氏温度）从输入对话框读入double型的华氏度，将其转换为摄氏度，并在消息对话框中显示结果，
        转换公式摄氏度=（5/9）*（华氏度-32） */
import javax.swing.JOptionPane;

public class P21TemperatureChange {
    public static void main(String[] args){
        String temperatureHuaString = JOptionPane.showInputDialog("请输入华氏度，如36.5:");
        double temperatureHua = Double.parseDouble(temperatureHuaString);
        double temperatureShe = (5.0/9)*(temperatureHua-32);
        String output = temperatureHua + "华氏度" + "=" + temperatureShe + "摄氏度";
        JOptionPane.showMessageDialog(null,output);
    }
}
