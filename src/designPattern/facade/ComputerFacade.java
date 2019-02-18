package designPattern.facade;

public class ComputerFacade {

	Disk disk;
	Cpu cpu;
	
	public ComputerFacade()
	{
		disk=new Disk();
		cpu=new Cpu();
	}
	
	public void start()
	{
		disk.start();
		cpu.start();
	}
	
	public void shutDown()
	{
		disk.shutDown();
		cpu.shutDown();
	}
}
