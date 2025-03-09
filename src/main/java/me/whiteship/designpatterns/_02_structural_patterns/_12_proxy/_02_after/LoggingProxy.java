package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class LoggingProxy implements Service{
    private final Service realService;

    public LoggingProxy(Service realService) {
        this.realService = realService;
    }
    @Override
    public void execute() {
        long startTime = System.currentTimeMillis();
        System.out.println("[프록시] 실행 시작");

        realService.execute();

        long endTime = System.currentTimeMillis();
        System.out.println("[프록시] 실행 완료 소요 시간 : " + (endTime - startTime));
    }
}
