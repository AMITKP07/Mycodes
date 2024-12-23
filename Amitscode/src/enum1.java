enum Direction {
    NORTH,SOUTH,EAST,WEST;
}
public class enum1 {
    public static void main(String[] args) {
        Direction dir=Direction.NORTH;

        System.out.println("Direction ="+dir);

        switch (dir) {
            case NORTH :
                System.out.println("going to north");
                break;
            case SOUTH:
                System.out.println("going south");
                break;
            case EAST:
                System.out.println("going east");
            case WEST:
                System.out.println("going west");
        }
    }
}
