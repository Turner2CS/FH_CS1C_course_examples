package week01_part02.solution;

public class Room <T>
{
    private int height;
    private int width;
    private T firstContainer;
    private T secondContainer;

    public Room(int height,int width)
    {
        this.height = height;
        this.width = width;
    }

    void setContents(T firstContainer, T secondContainer)
    {
        this.firstContainer = firstContainer;
        this.secondContainer = secondContainer;
    }

}