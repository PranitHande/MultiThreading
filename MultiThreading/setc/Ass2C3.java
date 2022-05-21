

import java.io.*;
import java.util.*;


class Sender
{
	public void send(String msg)
	{
		System.out.println(msg );
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e)
		{
			System.out.println("Thread interrupted.");
		}
		System.out.print( msg);
	}
}


class ThreadedSend extends Thread
{
	private String msg;
	Sender sender;

	
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
	}

	public void run()
	{
		synchronized(sender)
		{
			
			sender.send(msg);
		}
	}
}


class Ass2C3
{
	public static void main(String args[])
	{
		Sender send = new Sender();
		ThreadedSend S1 =
			new ThreadedSend( " Good Bye " , send );
		ThreadedSend S2 =
			new ThreadedSend( " Corona " , send );

		
		S1.start();
		S2.start();

		
		try
		{
			S1.join();
			S2.join();
		}
		catch(Exception e)
		{
			System.out.println("Interrupted");
		}
	}
}

