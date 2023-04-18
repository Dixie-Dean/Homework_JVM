public class MainXP {
    public static void main(String[] args) {
        JvmComprehension jvmComprehension = new JvmComprehension();
        MainXP xp = new MainXP();

        System.out.println(jvmComprehension.getClass().getClassLoader());
        System.out.println(xp.getClass().getClassLoader());
    }
}
