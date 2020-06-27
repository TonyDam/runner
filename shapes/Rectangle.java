package shapes;

public class Rectangle extends Shape implements Selectable {
    
    private int width, height;
    private boolean selected;
    
    public Rectangle ( int width, int height) {
        
        this.width = width;
        this.height = height;
        selected = false;
    }
    
    public double getArea() {
        
        return width * height;
    }
    
    public String toString() {
        
        String str;
        
        str = "\nShape : " + ( "" + this.getClass()).substring( 13, ( "" + this.getClass()).length()) + "\nArea : " + this.getArea()
            + "\nSelected : " + getSelected();
        
        return str;
    }
    
    @Override
    public boolean getSelected() {
        
        return selected;
    }
    
    @Override
    public void setSelected( boolean selected) {
        
        this.selected = selected;
    }
    
    @Override
    public Shape contains(int x, int y) {
        
        if ( x >= this.x && x <= this.x + width && y >= this.y && y <= this.y + height)
            return this;
        return null;
    }
    
}
