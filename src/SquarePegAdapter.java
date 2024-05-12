class SquarePegAdapter implements RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public int getRadius() {
        // Calculate the equivalent radius for square peg
        return (int) (squarePeg.getSideLength() * Math.sqrt(2) / 2);
    }
}
