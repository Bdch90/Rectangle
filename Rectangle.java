package rectangle;

public class Rectangle
{
    private int width;
    private int height;
    public Rectangle() {
    }

    public Rectangle(int width, int height)
    {
        this.width = width;
        this.height = height;
    }

    public int getArea()
    {
        return this.width * this.height;
    }

    public int getPerimeter()
    {
        return (this.height * this.width) * 2;
    }

    public String display()
    {
        return "Width : " + width + " height : " + height;
    }
};


