public class ApartmentBlocks extends Apartments{

    @Override
    public void location() {
        super.location();
        System.out.println("Block A is on the east side ");
    }

    @Override
    public void calculateArea() {
        System.out.println("method to calculate area");
    }
}
