import model.TestModel;
import repository.Test;

public class Application {
    public static void main(String[] args) {
        Test.test(new TestModel().setId(2).setTest(3));
    }
}
