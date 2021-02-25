package utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class util {
    static int testResolutionX=800;
    static int testResolutionY=400;
    static Skin skin;
    static {
        skin = new Skin(Gdx.files.internal("mskin/defskin.json"));
    }
    public static int Scaleer(int in){
        return Gdx.graphics.getHeight()/testResolutionY*in;
    }
    public static Skin GetDefSkin(){
        return  skin;
    }
}
