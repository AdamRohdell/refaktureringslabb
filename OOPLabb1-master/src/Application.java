import Controllers.CarController;

public class Application {

    public static void main(String[] args){
        CarController cc = new CarController();
        cc.getCars().add(cc.getFactory().createSaab95());
        cc.getCars().add(cc.getFactory().createSaab95());
        cc.getCars().add(cc.getFactory().createSaab95());
        cc.initCarcontroller();

    }
}
