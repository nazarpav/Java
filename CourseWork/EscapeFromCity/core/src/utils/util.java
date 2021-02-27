package utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.Scaling;

public class util {
    public static int s_x = Gdx.graphics.getWidth();
    public static int s_y = Gdx.graphics.getHeight();
    public static Float testResolutionX=800.f;
    public static Float testResolutionY=400.f;
    static Skin skin;
    static {
        skin = new Skin(Gdx.files.internal("mskin/defskin.json"));
    }
    public static int Scaleer(int in){
        int res =Gdx.graphics.getHeight()/testResolutionY.intValue();
        int f = res*in;
        return f;
    }
    public static float Scaleer(float in){
        float res =Gdx.graphics.getHeight()/testResolutionY;
        float f = res*in;
        return f;
    }
    public static int ScaleerY(int in){
        return Gdx.graphics.getHeight()/testResolutionY.intValue()*in;
    }
    public static int ScaleerX(int in){
        return Gdx.graphics.getWidth()/testResolutionX.intValue()*in;
    }
    public static float ScaleerY(float in){
        return Gdx.graphics.getHeight()/testResolutionY*in;
    }
    public static float ScaleerX(float in){
        return Gdx.graphics.getWidth()/testResolutionX*in;
    }
    public static TextButton CreateDefTextButton(String text,float x, float y, int button_width, int button_height,int buttonNumber, ClickListener click){
        final TextButton button = new TextButton(text, util.GetDefSkin() , "default");
        button.setWidth(util.ScaleerX(button_width));
        button.setHeight(util.ScaleerY(button_height));
        button.setPosition(x,y);
        button.getLabel().setFontScale(util.Scaleer(1));
        button.addListener(click);
        return button;
    }
    public static ImageButton CreateDefImageButton(FileHandle imDown, FileHandle imUp, Vector2 pos, Vector2 size, ClickListener click){
        final ImageButton button = new ImageButton(new TextureRegionDrawable(new Texture(imUp)),new TextureRegionDrawable(new Texture(imDown)));
        button.getImage().setScaling(Scaling.fill);
        button.getImage().setScale(util.Scaleer(1.f));
        button.setWidth(size.x);
        button.setHeight(size.y);
        button.setPosition(pos.x,pos.y);
        button.addListener(click);
        return button;
    }
    public static Skin GetDefSkin(){
        return  skin;
    }
}
