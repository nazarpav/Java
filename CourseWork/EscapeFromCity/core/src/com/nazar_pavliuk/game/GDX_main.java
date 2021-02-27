package com.nazar_pavliuk.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import java.util.logging.FileHandler;

import ParalaxBackground.ParalaxBackground;
import ParalaxBackground.ParallaxBackgroundGame;
import UI.MainMenuUI;

public class GDX_main extends ApplicationAdapter {
    ParalaxBackground bgMenu;
    ParallaxBackgroundGame bgGame;
    MainMenuUI mainMenuUI;
    SpriteBatch batch;
    public static scene _scene;
    public static void SetScene(scene scene_){
        _scene=scene_;
    }
    @Override
    public void create() {
        _scene=scene.Menu;
        batch= new SpriteBatch();
        bgMenu= new ParalaxBackground();
        bgGame= new ParallaxBackgroundGame();
        bgMenu.Create();
        bgGame.Create();
        mainMenuUI= new MainMenuUI();
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        switch (_scene) {
            case Menu:
                bgMenu.Draw(batch,1.f,Gdx.graphics.getDeltaTime());
                mainMenuUI.Draw();
                break;
            case Game:
                bgGame.DrawBG(batch,1.f,Gdx.graphics.getDeltaTime());
                bgGame.DrawFG(batch,1.f,Gdx.graphics.getDeltaTime());
                break;
        }
        batch.end();

    }

    @Override
    public void dispose() {
        batch.dispose();
        mainMenuUI.dispose();
        bgMenu.dispose();
    }
}
