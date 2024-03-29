package LSP.Architect.violation;

public class UnitUpgrader {

    public void upgrade(Apartment apartment) {
        apartment.squareFootage += 40;

        if (apartment.getClass() != Studio.class)
            apartment.numberOfBedrooms += 1;    

        System.out.println("Now the bedrooms are " + apartment.numberOfBedrooms);
    }
}
