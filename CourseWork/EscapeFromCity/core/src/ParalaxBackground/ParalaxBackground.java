package ParalaxBackground;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import net.dermetfan.utils.Pair;

public class ParalaxBackground{
    final private Integer backgroundsQuantity=6;
    private Array<Pair<Float, Sprite>>backgrounds = new Array<Pair<Float, Sprite>>();

    Float x=0.f;
    Float stepx=0.f;
    public void Create(){
        for (Integer i = 1; i <= backgroundsQuantity; i++) {
            Texture texture = new Texture(Gdx.files.internal("MenuBackground/0"+i.toString()+".png"));
            texture.setFilter(Texture.TextureFilter.Linear,Texture.TextureFilter.Linear);
            texture.setWrap(Texture.TextureWrap.Repeat,Texture.TextureWrap.Repeat);
            Sprite s =new Sprite(texture,0,0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
            s.setOrigin(0.f,0.f);
            backgrounds.add(new Pair<Float, Sprite>(0.1f*i*2.f,s));
        }
    }
    public void Draw(SpriteBatch bath, Float parentAlpha,Float dt){
        x-=stepx;
        Sprite tex;
        for (Pair<Float, Sprite>i:backgrounds) {
            Float _x=x*i.getKey();
            tex=i.getValue();
            bath.draw(tex.getTexture(),tex.getX(),0.f,_x.intValue(),0,Gdx.graphics.getWidth(),Gdx.graphics.getHeight());
        }
    }
    public void MoveX(Integer step){
        stepx=step.floatValue();
    }
}
