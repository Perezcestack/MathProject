package Week5;

    public class Room {
        public int getNumberOfBeds() {
            return numberOfBeds;
        }

        public void setNumberOfBeds(int numberOfBeds) {
            this.numberOfBeds = numberOfBeds;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public boolean isOccupied() {
            return isOccupied;
        }

        public void setOccupied(boolean occupied) {
            isOccupied = occupied;
        }

        public boolean isDirty() {
            return isDirty;
        }

        public void setDirty(boolean dirty) {
            isDirty = dirty;
        }

        public boolean isAvailable() {
            return !isOccupied && !isDirty;
        }

        public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
            this.numberOfBeds = numberOfBeds;
            this.price = price;
            this.isOccupied = isOccupied;
            this.isDirty = isDirty;
        }

        private int numberOfBeds;
        private double price;
        private boolean isOccupied;
        private boolean isDirty;

        @Override
        public String toString() {
            return "Room{" +
                    "numberOfBeds=" + numberOfBeds +
                    ", price=" + price +
                    ", isOccupied=" + isOccupied +
                    ", isDirty=" + isDirty +
                    '}';
        }

        public void checkIn() {

            setDirty(true);
            setOccupied(true);
        }

        public void checkOut() {
            setOccupied(false);
            setDirty(true);
        }
        public void cleanRoom(){
            setDirty(false);
            setOccupied(false);
        }
    }

