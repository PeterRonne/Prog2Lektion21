package opgave03.models.renting;

import opgave03.models.VehicleComponent;

public abstract class RentDecorator extends VehicleComponent {

    private VehicleComponent decorated;

    public RentDecorator(VehicleComponent decorated) {
        this.decorated = decorated;
    }
}


//    Kajs biler skal have udviklet et IT-system til udlejning af biler og motorcykler. Der er allerede
//    udviklet lidt, så man kan holde styr hvilke biler og motorcykler der er til rådighed. Nu skal vi
//    have tilføjet attributterne til at holde styr på lejeprisen og hvorvidt de er udlejet eller ej. Vi har
//    hørt om single responsibility princippet og tænker at udlejning detaljer ikke hører til i Vehicle
//    klassen.
//    Brug decorator pattern til at tilføje de nye attributter.