package HumanAndCommunication;


public class FamilyCommunication {
    private Human human;
    private TypeComunication typeComunication;

    public FamilyCommunication(Human human, TypeComunication typeComunication) {
        this.human = human;
        this.typeComunication = typeComunication;
    }

    public Human getHuman() {
        return human;
    }
    @Override
    public String toString() {
        return getHuman();
    }

    public TypeComunication getTypeComunication() {
        return typeComunication;
    }
}