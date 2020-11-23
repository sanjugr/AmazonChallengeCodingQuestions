public class TriangleSides {

    public String checkTriangleSide (int side1 ,int side2, int side3)  {
        if (side1 == side2 || side2 == side3 || side1==side3){
            if (side1 == side2 && side2 == side3)
                return "Equilateral";
            else
                return "Isoceles";
        }
        else
            return "Scalane";
    }
}
