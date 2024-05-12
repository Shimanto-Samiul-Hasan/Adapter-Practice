class HexagonPegAdapter implements RoundPeg {
    private HexagonPeg hexagonPeg;

    public HexagonPegAdapter(HexagonPeg hexagonPeg) {
        this.hexagonPeg = hexagonPeg;
    }

    @Override
    public int getRadius() {
        // Calculate the equivalent radius for hexagon peg
        return (int) (hexagonPeg.getSideLength() * Math.sqrt(3) / 2);
    }
}
