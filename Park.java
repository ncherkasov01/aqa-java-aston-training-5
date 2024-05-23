//task 3 solution
public class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public class ParkDescribtion {
        private String attractionName;
        private String workTime;
        private int cost;

        public ParkDescribtion (String attractionName, String workTime, int cost) {
            this.attractionName = attractionName;
            this.workTime = workTime;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        Park sokol = new Park("sokol", "Moscow");
        Park.ParkDescribtion sokolDescribtion = sokol.new ParkDescribtion("koleso", "9to6", 100);
    }
}
