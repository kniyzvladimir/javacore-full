package lesson11.homeWork;

public class Controller {
    private API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        int lengthArray = 0;
        for (int i = 0; apis.length < i; i++) {
            lengthArray += apis[i].findRooms(price, persons, city, hotel).length;
        }
        Room[] requestRoomsArray = new Room[lengthArray];
        int index = 0;
        for (int i = 0; apis.length < i; i++) {
            Room[] api = apis[i].findRooms(price, persons, city, hotel);
            for (int b = 0; b < api.length; b++) {
                requestRoomsArray[index] = api[b];
            }
        }
        return requestRoomsArray;
    }

    public Room[] check(API api1, API api2) {
        Room[] apiOne = api1.getAll();
        Room[] apiTwo = api2.getAll();
        Room[] roomsArray = new Room[apiOne.length];
        int index = 0;
        outer:
        for (int i = 0; i < apiOne.length; i++) {
            if (apiOne[i] != null) {
                for (int j = 0; j < apiTwo.length; j++) {
                    if (apiTwo[j] != null) {
                        if (apiOne[i].getPrice() == apiTwo[j].getPrice() &&
                                apiOne[i].getPersons() == apiTwo[j].getPersons() &&
                                apiOne[i].getCityName().equals(apiTwo[j].getCityName()) &&
                                apiOne[i].getHotelName().equals(apiTwo[j].getHotelName())) {
                            roomsArray[index] = apiOne[i];
                            index++;
                            continue outer;
                        }
                    }
                }
            }
        }

        Room[] finalRoomsArray = new Room[index + 1];
        int index2 = 0;
        for (int i = 0; i < roomsArray.length; i++) {
            if (roomsArray[i] != null) {
                finalRoomsArray[index2] = roomsArray[i];
                index2++;
            }

        }
        return finalRoomsArray;
    }

    public Room cheapestRoom() {

        Room cheapest = apis[0].getAll()[0];//первый room с первого api масива apis
        for (int i = 0; i < apis.length; i++) {
            Room[] tecArrayRooms = apis[i].getAll();
            for (int j = 0; j < tecArrayRooms.length; j++) {
                if (tecArrayRooms[j] != null && tecArrayRooms[j].getPrice() < cheapest.getPrice())
                    cheapest = tecArrayRooms[j];
            }
        }
        return cheapest;
    }
}
