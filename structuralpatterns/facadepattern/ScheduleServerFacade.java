package facadepattern;

public class ScheduleServerFacade {

	private final ScheduleServer scheduleServer;

	public ScheduleServerFacade(ScheduleServer scheduleServer) {
		super();
		this.scheduleServer = scheduleServer;
	}
	
	public void startServer() {
		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializingContext();
		scheduleServer.initializingListeners();
		scheduleServer.createSystemObjects();
	}
	
	public void stopServer() {
		scheduleServer.releaseProcesses();
		scheduleServer.destroy();
		scheduleServer.destroySystemObjects();
		scheduleServer.destroyListeners();
		scheduleServer.destroyContext();
		scheduleServer.shutdown();
	}
	
	
}
