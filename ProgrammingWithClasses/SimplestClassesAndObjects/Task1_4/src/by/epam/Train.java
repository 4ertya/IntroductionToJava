package by.epam;

public class Train {
    private String destinationName;
    private int trainNumber;
    private String departureTime;


    public Train(String destinationName, int trainNumber, String departureTime) {
        this.destinationName = destinationName;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public static Train[] sortingTrainByNumber(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length-1; j++) {
                if (trains[j].trainNumber < trains[j + 1].trainNumber) {
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                }
            }
        }
        return trains;
    }

    public static Train[] sortTrainDestinationName(Train[] trains) {
        Train temp;
        for (int i = 0; i < trains.length; i++) {
            for (int j = 0; j < trains.length - 1; j++) {
                if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) > 0) {
                    temp = trains[j];
                    trains[j] = trains[j+1];
                    trains[j+1] = temp;
                } else if (trains[j].destinationName.compareTo(trains[j + 1].destinationName) == 0) {
                    if (trains[j].departureTime.compareTo(trains[j+1].departureTime) > 0) {
                        temp = trains[j];
                        trains[j] = trains[j+1];
                        trains[j+1] = temp;
                    }
                }
            }
        }
        return trains;
    }

    public static Train informationOfTrain(Train[] trains, int trainNumber) {

        for (Train train : trains) {
            if (train.trainNumber == trainNumber) {
                return train;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "destinationName= " + destinationName +
                ", trainNumber= " + trainNumber +
                ", departureTime= " + departureTime ;
    }
}
