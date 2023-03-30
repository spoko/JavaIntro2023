package oop;

public class Breed {
    private String breedName;
    private String characteristics;
    private String possibleIllness;

    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    public String getPossibleIllness() {
        return possibleIllness;
    }

    public void setPossibleIllness(String possibleIllness) {
        this.possibleIllness = possibleIllness;
    }

    public Breed(String breedName, String characteristics, String possibleIllness) {
        setBreedName(breedName);
        setCharacteristics(characteristics);
        setPossibleIllness(possibleIllness);
    }
}
