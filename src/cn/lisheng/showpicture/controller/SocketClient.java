package cn.lisheng.showpicture.controller;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.CharBuffer;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


public class SocketClient {

	private String socketip;
	private int socketport;
	public SocketClient(String socketip,int socketport){
		this.setSocketip(socketip);
		this.setSocketport(socketport);
	}
	public static final Object locked = new Object(); 
    public static final BlockingQueue<String> queue = new ArrayBlockingQueue<String>( 
            1024 * 100); 
 
    //���ͱ���
    class SendThread extends Thread{ 
        private Socket socket; 
        public SendThread(Socket socket) { 
            this.socket = socket; 
        } 
        @Override 
        public void run() { 
            while(true){ 
                try { 
                	socket.sendUrgentData(0xFF);
                    String send = getSend();   
                    PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream())); 
                    pw.write(send); 
                    pw.flush(); 
                } catch (Exception e) { 
                	String ip = socket.getInetAddress().toString();
                	ip = ip.substring(1).trim();
                	//socket������쳣���ͻ��˸��ĸ����ӵ�����Ϊ����أ����constants
                	//����IP��ѯ�ý��׼�ص�����
                	try {
						socket.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
                    e.printStackTrace(); 
                    break;
                } 
            } 
        } 
        public String getSend() throws InterruptedException{ 
//            Thread.sleep(1000); 
            StringBuffer sb=new StringBuffer();
            sb.append("monitor");
            return sb.toString(); 
        } 
    } 
 
    //��ȡ����
    class ReceiveThread extends Thread{ 
        private Socket socket; 
         
        public ReceiveThread(Socket socket) { 
            this.socket = socket; 
        } 
 
        @Override 
        public void run() { 
            while(true){ 
                try {                    
                    Reader reader = new InputStreamReader(socket.getInputStream(),"GBK"); 
                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();   
                    DocumentBuilder builder = factory.newDocumentBuilder(); 
                    CharBuffer charBuffer = CharBuffer.allocate(8192); 
                    int index = -1; 
                    while((index=reader.read(charBuffer))!=-1 ){ 
                        charBuffer.flip(); 
                        
                    } 
                } catch (Exception e) { 
                    e.printStackTrace(); 
                    break;
                } 
            } 
        } 
    }     
    public Socket start() throws UnknownHostException, IOException{ 
        Socket socket = new Socket(this.socketip,this.socketport); 
        new SendThread(socket).start(); 
        new ReceiveThread(socket).start(); 
        return socket;
    } 
   
	public String getSocketip() {
		return socketip;
	}
	public void setSocketip(String socketip) {
		this.socketip = socketip;
	}
	public int getSocketport() {
		return socketport;
	}
	public void setSocketport(int socketport) {
		this.socketport = socketport;
	}
	//main��������socket�ͻ���
	public static void main(String[] args) throws UnknownHostException, IOException { 
		new SocketClient("localhost",18889).start(); 
	}

}
