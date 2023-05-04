package JubrilClass.AnonymousClass;
@FunctionalInterface
public interface CarMethod {
    void stop();
    default void  move(){
        System.out.println("move");
    };
}
