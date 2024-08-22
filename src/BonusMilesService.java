public class BonusMilesService {
    public int calculate(int ticketCost) {
        double bonusMilesPerRuble = 20;
        return (int) (ticketCost / bonusMilesPerRuble);
    }
}
