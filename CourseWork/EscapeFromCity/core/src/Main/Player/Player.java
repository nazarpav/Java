package Main.Player;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;

import utils.util;

public class Player extends Actor {
    @Override
    public void create() {
        super.create();
        String basePath = "player/animations/";
        _currentAnimation = util.CreateAnimation(Gdx.files.internal(basePath+"Idle.png"),4,1,0.15f);
        animations.put(AnimMap.Idle,_currentAnimation);
        animations.put(AnimMap.Move, util.CreateAnimation(Gdx.files.internal(basePath+"Walk.png"),4,1,0.15f));
        animations.put(AnimMap.Attack, util.CreateAnimation(Gdx.files.internal(basePath+"Attack.png"),8,1,0.1f));
        animations.put(AnimMap.Death, util.CreateAnimation(Gdx.files.internal(basePath+"Death.png"),4,1,0.1f));
        animations.put(AnimMap.TakeHit, util.CreateAnimation(Gdx.files.internal(basePath+"TakeHit.png"),4,1,0.08f));
        animations.put(AnimMap.Shield, util.CreateAnimation(Gdx.files.internal(basePath+"Shield.png"),4,1,0.1f));
        DrawPos= new Vector2(util.s_x/2/4,-60.f);
    }
    @Override
    public void render() {
       super.render();
    }
    @Override
    public void dispose() {
        super.dispose();
    }
}