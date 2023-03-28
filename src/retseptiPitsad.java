
class PepperoniPitsa extends Pitsa implements pitsaRetsept {
    public PepperoniPitsa(double suurus) {
        super(suurus);
    }

    @Override
    public void teePitsaRetseptiJärgi() {
        this.lisaLisand(new Pepperoni());
        this.lisaLisand(new Juust());
        this.lisaLisand(new Mozzarella());
        this.lisaLisand(new Basiilik());
    }
}
class MargheritaPitsa extends Pitsa implements  pitsaRetsept {
    public MargheritaPitsa(double suurus) {
        super(suurus);
    }
    @Override
    public void teePitsaRetseptiJärgi() {
        this.lisaLisand(new Kaste());
        this.lisaLisand(new Juust());
    }
}
