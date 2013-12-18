import java.util.ArrayList;
import java.util.List;


public class LoadBalancer {
	private List<Server> _servers;
	private static LoadBalancer _instance = new LoadBalancer();
	
	private LoadBalancer(){
		_servers = new ArrayList<Server>();
		get_servers().add(new Server("Server-1", "192.168.0.1"));
		get_servers().add(new Server("Server-2", "192.168.0.202"));
		get_servers().add(new Server("Server-3", "192.168.0.42"));
		get_servers().add(new Server("Server-4", "192.168.0.111"));
	}
	
	public List<Server> get_servers() {
		return _servers;
	}	
	
	public static LoadBalancer get_instance() {
		return _instance;
	}	
}
