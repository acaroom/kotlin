package chap06.section3;

public class KCustomerAccess {

    public static void main(String[] args) {

        // 코틀린 코드의 KotlinFoo의 멤버를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login(); // 어노테이션을 사용할 때 접근 방법
        KCustomer.Companion.login(); // 위와 동일한 결과로 어노테이션을 사용하지 않을 때 접근 방법

        // KJob에 대한 객체 생성 후 접근
        KJob kjob = KCustomer.JOB;
        System.out.println(kjob.getTitle());

        // KCostomer를 통한 접근
        KCustomer.JOB.setTitle("Accountant");
        System.out.println(KCustomer.JOB.getTitle());
    }
}
