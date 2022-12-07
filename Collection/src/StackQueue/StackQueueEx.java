package StackQueue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(200));
		coinBox.push(new Coin(50));
		
		while(!coinBox.isEmpty()) {
			Coin coins = coinBox.pop();
			System.out.println(coins.getVal()); 
		}
		
	
		Queue<Message> msg = new LinkedList<Message>();   // Queue is interface
		msg.offer(new Message("sendMain", "홍길동"));
		msg.offer(new Message("sendkakao", "홍익인간"));
		msg.offer(new Message("sendLine", "담덕"));
		
		while(!msg.isEmpty()) {
			Message msgg = msg.poll();
			System.out.println(msgg.toString());
		}
		
		
	
}


class Coin{
	private int val;
	
	public Coin(int val) {this.val = val;}
	
	public int getVal() {
		return this.val;
	}
}

class Message{
	
	public String command;
	public String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
}