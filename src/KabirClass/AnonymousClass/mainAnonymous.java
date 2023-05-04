package JubrilClass.AnonymousClass;

public class mainAnonymous {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        CarMethod carMethod = new CarMethod() {
            @Override
            public void stop() {
                System.out.println("Stop");
            }

            @Override
            public void move() {
                System.out.println("Move");
            }
        };
        toyota.move(carMethod);
        toyota.stop(carMethod);
    }
}
