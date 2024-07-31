public class PC {
    /*
    A composition in Java between two objects associated with each other exists when there is a strong relationship between
    one class and another. Other classes cannot exist without the owner or parent class.
    For example, A 'Human' class is a composition of the Class Heart and the Class lungs.
     */

    /*
    It would be possible to create a PC class by extending (or inheriting) it from these other classes? Well there could be but you
    are going to run into problems real quickly at least doing inheritance in the conventional way.

    Inheritance and composition are two programming techniques developers use to establish RELATIONSHIPS between classes and objects.
    Whereas inheritance derives ONE CLASS FROM ANOTHER, composition defines a class as the SUM OF ITS PARTS;

    In th previous example, heart nd lungs compose a human, but with the concept of inheritance you cannot make human inherit
    heart and heart inherit from lungs for example. So in this case, composition makes way more sense than inheritance;
     */

    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC (Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp () {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy graphics;
        getMonitor().drawPixelArt(250,250,"Yellow");
    }

    private Case getTheCase() {
        return theCase;
    }

    public void setTheCase(Case theCase) {
        this.theCase = theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }
}
