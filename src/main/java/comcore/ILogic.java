package comcore;

public interface ILogic {

    void init() throws Exception;
    void update();
    void render();
    void cleanup();
    void input();

}
