public class Lisand {

    protected String lisandiNimi;
    protected double hind;

    public double getHind() {
        return hind;
    }
    public String getLisandiNimi() {
        return lisandiNimi;
    }

}

class Pepperoni extends Lisand {
    public Pepperoni() {
        this.hind = 1.5;
        this.lisandiNimi = "Pepperoni";
    }
}
class Suitsukana extends Lisand {
    public Suitsukana() {
        this.hind = 1.5;
        this.lisandiNimi = "Suitsukana";
    }
}
class Ananass extends Lisand {
    public Ananass() {
        this.hind = 1;
        this.lisandiNimi = "Ananass";
    }
}

class Kirsstomat extends Lisand {
    public Kirsstomat() {
        this.hind = 1.5;
        this.lisandiNimi = "Kirsstomat";
    }
}

class Paprika extends Lisand {
    public Paprika() {
        this.hind = 1.5;
        this.lisandiNimi = "Paprika";
    }
}
class Juust extends Lisand {
    public Juust() {
        this.hind = 1.5;
        this.lisandiNimi = "Juust";
    }
}

class Mozzarella extends Lisand {
    public Mozzarella() {
        this.hind = 1.5;
        this.lisandiNimi = "Mozzarella";
    }
}
class Basiilik extends Lisand {
    public Basiilik() {
        this.hind = 0.5;
        this.lisandiNimi = "Basiilik";
    }
}
class Kaste extends Lisand {
    public Kaste() {
        this.hind = 1;
        this.lisandiNimi = "Kaste";
    }
}



