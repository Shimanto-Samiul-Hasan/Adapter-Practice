public class Main {
    public static void main(String[] args) {
        // Create objects
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg() {
            @Override
            public int getRadius() {
                return 3; // Just an example, you can replace it with any desired value
            }
        };
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(new SquarePeg(4));
        HexagonPeg hexagonPeg = new HexagonPeg(6);
        HexagonPegAdapter hexagonPegAdapter = new HexagonPegAdapter(hexagonPeg);

        // Test and print results
        System.out.println("Round Peg Radius: " + roundPeg.getRadius());
        System.out.println("Square Peg Adapter Radius: " + squarePegAdapter.getRadius());
        System.out.println("Hexagon Peg Adapter Radius: " + hexagonPegAdapter.getRadius());
    }
}
