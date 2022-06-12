package practicingByMs;

public class HaykJob {
    int[] array = {8, 7, 40, 10, 41, 45};
    boolean equalTo15;
    boolean sumIs15(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == 15) {
                    equalTo15 = true;
                    break;
                }
            }
        }
        return equalTo15;
    }
}
class HaykJobDemo {
    public static void main(String[] args) {
        HaykJob haykJob = new HaykJob();
        System.out.println(haykJob.sumIs15(haykJob.array));

    }
}
