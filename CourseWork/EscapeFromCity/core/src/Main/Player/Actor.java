package Main.Player;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;

import net.dermetfan.utils.Pair;

import java.util.HashMap;
import java.util.Map;

import utils.util;

public abstract class Actor implements ApplicationListener {
    protected Map<AnimMap, Animation> animations = new HashMap<AnimMap, Animation>();
    protected Vector2 DrawPos;
    protected Animation _currentAnimation;
    protected TextureRegion currentFrame;
    protected SpriteBatch spriteBatch;
    protected AnimMap _currentstate;
    private boolean _isFlip=false;
    private float stateTime;
    private boolean _isPause=false;
    protected boolean _isLooping=true;
    @Override
    public void create() {
        spriteBatch= new SpriteBatch();
        stateTime=util.rnd.nextFloat()%50;
    }
    public void SetAnimState(AnimMap state){
        Animation newState =  animations.get(state);
        if(newState!=null){
            if((_currentstate==AnimMap.Attack||_currentstate==AnimMap.Shield)&&stateTime<0.5f)return;
            _currentAnimation=newState;
            _currentstate=state;
            if(state==AnimMap.Death||state==AnimMap.Attack||state==AnimMap.Shield||state==AnimMap.TakeHit){
                _isLooping=false;
            }
            else{
                _isLooping=true;
            }
            stateTime=0.f;
        }
    }
    public AnimMap GetCurrentState(){
        return _currentstate;
    }
    public void SetIsFlip(boolean val){
        _isFlip=val;
    }
    @Override
    public void resize(int width, int height) {
    }
    @Override
    public void render() {
        if((_currentstate==AnimMap.Attack||_currentstate==AnimMap.TakeHit||_currentstate==AnimMap.Shield)&&_currentAnimation.isAnimationFinished(stateTime)){
            SetAnimState(AnimMap.Idle);
        }
        if(_isPause||animations.isEmpty())return;
        stateTime += Gdx.graphics.getDeltaTime();
        currentFrame = (TextureRegion) _currentAnimation.getKeyFrame(stateTime, _isLooping);
        if(_isFlip&&!currentFrame.isFlipX()||!_isFlip&&currentFrame.isFlipX()){currentFrame.flip(true,false);}
        spriteBatch.begin();
        spriteBatch.draw(currentFrame, util.Scaleer(DrawPos.x), util.Scaleer(DrawPos.y), util.Scaleer(250.f),util.Scaleer(250.f));
        spriteBatch.end();
    }
    @Override
    public void pause() {
        _isPause=true;
    }
    @Override
    public void resume() {
        _isPause=false;
    }
    @Override
    public void dispose() {
        spriteBatch.dispose();
    }
}
