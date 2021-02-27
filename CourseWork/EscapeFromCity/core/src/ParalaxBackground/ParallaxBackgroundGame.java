package ParalaxBackground;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;

import net.dermetfan.utils.Pair;

public class ParallaxBackgroundGame {
    final private Integer backgroundsQuantity=2;
    final private Integer foregroundsQuantity=1;
    private Array<Pair<Float, Texture>> backgrounds = new Array<Pair<Float, Texture>>();
    private Array<Pair<Float, Texture>> foregrounds = new Array<Pair<Float, Texture>>();
    int s_x= Gdx.graphics.getWidth();
    int s_y=Gdx.graphics.getHeight();
    int x_pos=0;
    public void Create(){
        Parallax.InitBackgrounds(backgrounds,backgroundsQuantity,"city/background_",0.2f);
        Parallax.InitBackgrounds(foregrounds,foregroundsQuantity,"city/foreground_",1.f);
    }
    public void DrawBG(SpriteBatch bath, Float parentAlpha, Float dt){
        for (Pair<Float, Texture>i:backgrounds) {
            x_pos+=1.f;
            bath.draw(i.getValue(),0.f,0.f,x_pos,0,s_x,s_y);
        }
    }
    public void DrawFG(SpriteBatch bath, Float parentAlpha, Float dt){
        for (Pair<Float, Texture>i:foregrounds) {
            x_pos+=2.f;
            bath.draw(i.getValue(),0.f,0.f,x_pos,0,s_x,s_y);
        }
    }
    public void dispose() {
        for (Pair<Float, Texture>i:backgrounds) {
            i.getValue().dispose();
        }
    }
    public void MoveX(float step){
        x_pos+=step;
    }
}