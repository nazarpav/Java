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
import UI.MainMenuUI;

public class GDX_main extends ApplicationAdapter {
    ParalaxBackground bg;
    MainMenuUI mainMenuUI;
    SpriteBatch batch;
    @Override
    public void create() {
        batch= new SpriteBatch();
        bg= new ParalaxBackground();
        bg.Create();
        mainMenuUI= new MainMenuUI();
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bg.Draw(batch,1.f,Gdx.graphics.getDeltaTime());
        batch.end();
        mainMenuUI.Draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
        mainMenuUI.dispose();
        bg.dispose();
    }
}
