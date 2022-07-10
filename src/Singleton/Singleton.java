package Singleton;

class Singleton {
    private static Instance instance = new Instance();

    Instance getInstance(){
        return this.instance;
    }


}
