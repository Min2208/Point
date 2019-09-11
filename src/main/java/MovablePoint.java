public class MovablePoint extends Point {
    private float xSpeed,ySpeed;

    public MovablePoint(){
        super();
        this.xSpeed=0;
        this.ySpeed=0;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getXSpeed(){
        return this.xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed=xSpeed;
    }

    public float getYSpeed(){
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed=ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString(){
        return super.toString()+" , speed: ( "+xSpeed +" , "+ySpeed+" )";
    }

    public MovablePoint move(){
        super.setXY(super.getX()+this.xSpeed,super.getY()+this.ySpeed);
        return this;
    }





}
