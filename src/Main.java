public class Main {

    public static void main(String[] args) {
        BOSS boss = new BOSS();
        boss.setBossDamage(70);
        boss.setBossHealth(1000);
        boss.setBossDefenceType("Kinetic");
        System.out.println("Здоровья босса: " + boss.getBossHealth() + "\nУрон босса: " + boss.getBossDamage() +
                "\nТип защиты: " + boss.getBossDefenceType());

    }
}