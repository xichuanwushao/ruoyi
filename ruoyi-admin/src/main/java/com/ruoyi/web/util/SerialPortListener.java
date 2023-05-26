package com.ruoyi.web.util;

/**
 * @author : wuxiao
 * @date : 15:06 2023-05-26
 * Java监听串口数据并处理模块寻到卡片和卡片离开的事件，可以使用Java的串口通信库，例如RXTX或JSerialComm
 */

import gnu.io.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.TooManyListenersException;
public class SerialPortListener implements SerialPortEventListener {

    private SerialPort serialPort;

    public void initialize(String portName) throws NoSuchPortException, PortInUseException, UnsupportedCommOperationException, IOException {
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        serialPort = (SerialPort) portIdentifier.open(this.getClass().getName(), 2000);
        serialPort.setSerialPortParams(115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
        try {
            serialPort.addEventListener(this);
        } catch (TooManyListenersException e) {
            throw new RuntimeException(e);
        }
        serialPort.notifyOnDataAvailable(true);
    }

    @Override
    public void serialEvent(SerialPortEvent event) {
        if (event.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            try {
                InputStream inputStream = serialPort.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

                String data = reader.readLine();
                processEventData(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void processEventData(String data) {
        if (data.startsWith("AA")) {
            // 寻到卡片事件
            String cardType = data.substring(6, 8); // 获取卡片类型（16进制）
            String uid = data.substring(8); // 获取卡片UID（16进制）

            // 对卡片类型和UID进行处理
            // 可以将卡片类型和UID转换为十进制或其他需要的格式
            System.out.println("Card Type: " + cardType);
            System.out.println("UID: " + uid);
        } else if (data.startsWith("AA 01 EA")) {
            // 卡片离开事件
            System.out.println("Card left");
        }
    }

    public void close() {
        if (serialPort != null) {
            serialPort.removeEventListener();
            serialPort.close();
        }
    }

    public static void main(String[] args) {
        String portName = "COM1"; // 串口名称，根据实际情况修改
        SerialPortListener listener = new SerialPortListener();
        try {
            listener.initialize(portName);
            System.out.println("Listening for serial port events...");
            // 持续监听串口事件
            while (true) {
                // 可以在这里执行其他操作或等待事件发生
            }
        } catch (NoSuchPortException | PortInUseException | UnsupportedCommOperationException | IOException e) {
            e.printStackTrace();
        } finally {
            listener.close();
        }
    }
}
