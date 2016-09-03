package SoSafeSecurity;

public class Invoker {
	Command oncmd,offcmd;
	public Invoker(Command on,Command off) {
		this.oncmd = on;
		this.offcmd = off;
	}
	
	public void selectOn(){
		oncmd.execute();
	}
	
	public void selectOff() {
		offcmd.execute();
	}
}


