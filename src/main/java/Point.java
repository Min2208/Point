public class Point {
    private float x,y;

    public Point(){
        this.x=0;
        this.y=0;
    }

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x=x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y=y;
    }

    public float[] getXY(){
        return new float[]{this.x,this.y};
    }

    public void setXY(float x, float y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return "X: "+this.x +" , Y: "+ this.y;
    }



}
