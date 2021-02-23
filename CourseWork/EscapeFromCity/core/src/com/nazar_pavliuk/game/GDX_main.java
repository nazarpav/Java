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

public class GDX_main extends ApplicationAdapter {
    SpriteBatch batch;
    Stage stage;
    Skin skin;
    ParalaxBackground bg;
    @Override
    public void create() {
        bg= new ParalaxBackground();
        bg.Create();
        batch = new SpriteBatch();
        skin = new Skin(Gdx.files.internal("neon/skin/neon-ui.json"));
        stage = new Stage(new ScreenViewport());
        final TextButton button = new TextButton("Left", skin, "default");
        button.setWidth(200);
        button.setHeight(50);
        button.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                bg.MoveX(-5);
            }
        });
        stage.addActor(button);
        final TextButton button2 = new TextButton("Right", skin, "default");
        button2.setWidth(200);
        button2.setHeight(50);
        button2.setPosition(Gdx.graphics.getWidth()-200,0);
        button2.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                    bg.MoveX(5);
            }
        });
        stage.addActor(button2);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
        bg.Draw(batch,1.f,Gdx.graphics.getDeltaTime());
        batch.end();
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public void dispose() {
        batch.dispose();
        skin.dispose();
        stage.dispose();
    }
}
