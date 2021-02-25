package ParalaxBackground;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;

import net.dermetfan.utils.Pair;

public class ParalaxBackground{
    final private Integer backgroundsQuantity=6;
    private Array<Pair<Float, Texture>>backgrounds = new Array<Pair<Float, Texture>>();
    int s_x=Gdx.graphics.getWidth();
    int s_y=Gdx.graphics.getHeight();
    Float x=0.f;
    Float stepx=2.f;
    public void Create(){
        for (Integer i = 1; i <= backgroundsQuantity; i++) {
            Texture texture = new Texture(Gdx.files.internal("MenuBackground/0"+i.toString()+".png"));
            int x_tex=s_y/texture.getHeight()*texture.getWidth();
            Pixmap textureRT = new Pixmap(Gdx.files.internal("MenuBackground/0"+i.toString()+".png"));
            Pixmap screenRT = new Pixmap(x_tex, s_y, textureRT.getFormat());
            screenRT.drawPixmap(textureRT,
                    0, 0, textureRT.getWidth(), textureRT.getHeight(),
                    0, 0, screenRT.getWidth(), screenRT.getHeight()
            );
            texture = new Texture(screenRT);
            textureRT.dispose();
            screenRT.dispose();
            texture.setFilter(Texture.TextureFilter.Linear,Texture.TextureFilter.Linear);
            texture.setWrap(Texture.TextureWrap.Repeat,Texture.TextureWrap.Repeat);
            backgrounds.add(new Pair<Float, Texture>(0.2f*i,texture));
        }
    }
    public void Draw(SpriteBatch bath, Float parentAlpha,Float dt){
        x-=stepx;
        for (Pair<Float, Texture>i:backgrounds) {
            Float _x=x*i.getKey();
            bath.draw(i.getValue(),0.f,0.f,_x.intValue(),0,s_x,s_y);
        }
    }
    public void dispose() {
        for (Pair<Float, Texture>i:backgrounds) {
           i.getValue().dispose();
        }
    }
    public void MoveX(Integer step){
        stepx=step.floatValue();
    }
}
