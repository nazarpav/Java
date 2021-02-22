package ParalaxBackground;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.util.*;

import sun.rmi.runtime.Log;

public class ParalaxBackground{
    private Map<Float, Sprite> backgrounds= new HashMap<Float, Sprite>();
    Float x=0.f;
    Float stepx=0.f;
    public void Create(){
        for (Integer i = 1; i < 7; i++) {
            Texture texture = new Texture(Gdx.files.internal("MenuBackground/0"+i.toString()+".png"));
            texture.setFilter(Texture.TextureFilter.Linear,Texture.TextureFilter.Linear);
            texture.setWrap(Texture.TextureWrap.Repeat,Texture.TextureWrap.Repeat);
            Sprite s =new Sprite(texture);
            s.setOrigin(s.getWidth(),s.getHeight());
            s.setPosition(0.f,0.f);
            backgrounds.put(0.1f*i*2,s);
        }
    }
    public void Draw(SpriteBatch bath, Float parentAlpha,Float dt){
        x-=stepx;
        for(Map.Entry<Float, Sprite> entry : backgrounds.entrySet()) {
            Float _x=x*entry.getKey();
            bath.draw(entry.getValue().getTexture(),0.f,0.f,_x.intValue(),0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
    }
    public void MoveX(Integer step){
        stepx=step.floatValue();
    }
}
