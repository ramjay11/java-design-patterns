package facadepattern;

public class RunServer {

	public static void main(String[] args) {
		ScheduleServer scheduleServer = new ScheduleServer();

		scheduleServer.startBooting();
		scheduleServer.readSystemConfigFile();
		scheduleServer.init();
		scheduleServer.initializingContext();
		scheduleServer.initializingListeners();
		scheduleServer.createSystemObjects();

		System.out.println("Start working......");
		System.out.println("After work done.........");

		scheduleServer.releaseProcesses();
		scheduleServer.destroy();
		scheduleServer.destroySystemObjects();
		scheduleServer.destroyListeners();
		scheduleServer.destroyContext();
		scheduleServer.shutdown();
	}
}
