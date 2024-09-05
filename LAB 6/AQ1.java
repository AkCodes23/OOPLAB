class Game {
    void type() {
        System.out.println("indoor & outdoor games");
    }
}

class Cricket extends Game {
    void type() {
        System.out.println("cricket is an outdoor game");
    }
}

class Chess extends Game {
    void type() {
        System.out.println("chess is an indoor game");
    }
}

class DMD {
    public static void main(String[] args) {
        Game g = new Cricket();
        g.type();

        g = new Chess();
        g.type();
    }
}
