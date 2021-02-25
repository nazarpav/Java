package UI;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import MAS.MAS;
import utils.util;

public class MainMenuUI {
    Stage stage;
    private TextButton CreateMenuButton(String text,float button_width,float button_height,int s_x, float startYpos, float buttonPixelStep,int buttonNumber,ClickListener click){
        final TextButton button = new TextButton(text, util.GetDefSkin() , "default");
        button.setWidth(button_width);
        button.setHeight(button_height);
        button.getLabel().setFontScale(util.Scaleer(1));
        button.setPosition(s_x/2-button_width/2,startYpos+buttonPixelStep*buttonNumber-button_height);
        button.addListener(click);
        return button;
    }
    public MainMenuUI(){
        MAS.StopCurrentAndStreamThisMusic(Gdx.files.internal("musics/background0.mp3"));
        stage = new Stage(new ScreenViewport());
        int s_x=Gdx.graphics.getWidth();
        int s_y=Gdx.graphics.getHeight();
        int button_count=4;
        float button_width=util.Scaleer(250);
        float button_height=util.Scaleer(50);
        float buttonPixelStep=button_height+util.Scaleer(5);
        float startYpos=s_y/2-buttonPixelStep*button_count/2;
        int buttonCounter=0;
        stage.addActor(CreateMenuButton("Start game", button_width,button_height,s_x,startYpos,buttonPixelStep,++buttonCounter,new ClickListener() {@Override public void clicked(InputEvent event, float x, float y) {
            MAS.PlaySound(Gdx.files.internal("sounds/buttonpres.mp3"));
        }}));
        stage.addActor(CreateMenuButton("Settings", button_width,button_height,s_x,startYpos,buttonPixelStep,++buttonCounter,new ClickListener() {@Override public void clicked(InputEvent event, float x, float y) {
            MAS.PlaySound(Gdx.files.internal("sounds/buttonpres.mp3"));

        }}));
        stage.addActor(CreateMenuButton("Creators", button_width,button_height,s_x,startYpos,buttonPixelStep,++buttonCounter,new ClickListener() {@Override public void clicked(InputEvent event, float x, float y) {
            MAS.PlaySound(Gdx.files.internal("sounds/buttonpres.mp3"));

        }}));
        stage.addActor(CreateMenuButton("Exit", button_width,button_height,s_x,startYpos,buttonPixelStep,++buttonCounter,new ClickListener() {@Override public void clicked(InputEvent event, float x, float y) {
            MAS.PlaySound(Gdx.files.internal("sounds/buttonpres.mp3"));

        }}));
        Gdx.input.setInputProcessor(stage);
    }
    public void Draw(){
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }
    public void dispose() {
        stage.dispose();
    }
}