package mvc;

public class Teacher extends Person  implements IService{
    @Override
    public void work() {
        System.out.println("teach");
    }

    @Override
    public void checkin() {

    }


}
