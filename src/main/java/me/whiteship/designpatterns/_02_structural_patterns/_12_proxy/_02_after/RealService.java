package me.whiteship.designpatterns._02_structural_patterns._12_proxy._02_after;

public class RealService implements Service {
    @Override
    public void execute() {
        System.out.println("실제 서비스 실행 중...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
